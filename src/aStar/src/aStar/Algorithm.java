package aStar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;

public class Algorithm {
	
	private PriorityQueue<Node> unexploredNodeQueue;
	private Set<Node> exploredNode;
	
	
	public Algorithm(){
		this.unexploredNodeQueue = new PriorityQueue<Node>();
		this.exploredNode= new HashSet<Node>();
	}
	
	public void aStarSearch(Node sourceNode, Node goalNode){
		sourceNode.setGscore(0);
		this.unexploredNodeQueue.add(sourceNode);
		
		boolean isFound = false;
		if(!this.unexploredNodeQueue.isEmpty() && isFound==false){
			Node currNode = this.unexploredNodeQueue.poll();
			this.exploredNode.add(currNode);
			
			if(currNode.getValue().equals(goalNode.getValue()))
				isFound=true;
			else{
				for(Edge edge : currNode.getAdjacencyList()){
					Node childNode = edge.getTargetNode();
					double weight = edge.getCost();
					
					double tempGscore = currNode.getGscore()+weight;
					double tempFscore = tempGscore + heuristic(childNode,goalNode);
					
					if(this.exploredNode.contains(childNode) && tempFscore>=childNode.getFscore())
						continue;
					
					else if(!this.unexploredNodeQueue.contains(childNode)&&tempFscore<childNode.getFscore()){
						childNode.setParentNode(currNode);
						childNode.setFscore(tempFscore);
						childNode.setGscore(tempGscore);
						
						if(this.unexploredNodeQueue.contains(childNode))
						this.unexploredNodeQueue.remove(childNode);
					
						this.unexploredNodeQueue.add(childNode);
					}
				}
			}
		}
	}
		
	
	public double heuristic(Node node1, Node node2){
		
		return Math.abs(node1.getX()-node2.getX()) - Math.abs(node1.getY()-node2.getY());
		
	}
	
	public List<Node> printPath(Node targetNode){
		List<Node> pathList = new ArrayList<Node>();
		for(Node node = targetNode; node!=null; node=node.getParentNode()){
			pathList.add(node);
		}
		
		Collections.reverse(pathList);
		return pathList;
	}

}
