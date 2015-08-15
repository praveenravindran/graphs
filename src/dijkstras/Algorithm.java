package dijkstras;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
//import java.util.Queue;

public class Algorithm {
	
	
	public void computePath(VertexForDijkstras sourceVertex){
		sourceVertex.setMinDistance(0.0);
		PriorityQueue<VertexForDijkstras> priorityQueue= new PriorityQueue<VertexForDijkstras>();
		priorityQueue.add(sourceVertex);
		
		
		while(!priorityQueue.isEmpty()){
			
			VertexForDijkstras actualVertex = priorityQueue.poll();
			
			for(Edge edge:actualVertex.getAdjacenciesList()){
				//System.out.println(edge.getTargetVertex());
				VertexForDijkstras v = edge.getTargetVertex();
				 double weight = edge.getWeight();
				 double minDistanceViaV = actualVertex.getMinDistance() + weight;
				// System.out.println(v.getMinDistance());
				 
				 if(minDistanceViaV < v.getMinDistance()){
					 priorityQueue.remove(v);
					 v.setPreviousVertex(actualVertex);
					 v.setMinDistance(minDistanceViaV);
					 priorityQueue.add(v);
				 }
			}
		}
	}
	
	
	public List<VertexForDijkstras> getShoretestPath(VertexForDijkstras targetVertex){
		List<VertexForDijkstras> path = new ArrayList<VertexForDijkstras> ();
		for(VertexForDijkstras vertex = targetVertex; vertex != null ; vertex=vertex.getPreviousVertex()){
			//System.out.println(vertex);
			path.add(vertex);
		}
		
		Collections.reverse(path);
		return path;
	}
}
