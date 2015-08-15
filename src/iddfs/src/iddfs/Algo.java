package iddfs;

import java.util.Stack;

public class Algo {
	
	private Node targetNode;
	private boolean isFound;
	
	public Algo(Node targetNode){
		this.targetNode=targetNode;
	}
	
	public void runIddfs(Node startNode){
		int depth = 0;
		
		while(!this.isFound){
			System.out.println("");
			dfs(startNode,depth);
			depth++;
		}
	}
	
	public void dfs(Node startNode, int depth){
		Stack<Node> stack = new Stack<Node>();
		startNode.setDepthLevel(0);
		stack.push(startNode);
		while(!stack.isEmpty()){
			Node currNode = stack.pop();
			System.out.println(currNode);
			
			if(currNode.getName().equals(this.targetNode.getName())){
				System.out.println("Node is Found");
				this.isFound=true;
				return;
			}
			
			if(currNode.getDepthLevel()>=depth)
				continue;
			
			for(Node node:currNode.getAdjacencyList()){
				node.setDepthLevel(currNode.getDepthLevel()+1);
				stack.push(node);
			}
		}
	}

}
 