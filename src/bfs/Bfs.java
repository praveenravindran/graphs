package bfs;

import java.util.LinkedList;
import java.util.Queue;

import vertex.Vertex;

public class Bfs {
	
	public void giveBfs(Vertex vertex){
		vertex.setVisited(true);
		Queue<Vertex> queue = new LinkedList<Vertex>();
		queue.add(vertex);
		while(!queue.isEmpty()){
			Vertex currentVertex = queue.remove();
			System.out.println(currentVertex);
			for(Vertex v:currentVertex.getAdjacencyList()){
				if(v.isVisited()==false){
					v.setVisited(true);
					queue.add(v);
				}
			}
		}
	}

}
