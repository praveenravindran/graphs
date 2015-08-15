package vertex;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	
	private String name;
	private boolean visited;
	private List<Vertex> adjacencyList;
	
	public Vertex(){
		
	}
	
	public Vertex(String name){
		this.name=name;
		this.adjacencyList = new ArrayList<Vertex>();
	}
	
	public void addNeighbour(Vertex vertex){
		
		adjacencyList.add(vertex);
	}
	
	

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public List<Vertex> getAdjacencyList() {
		return adjacencyList;
	}

	@Override
	public String toString() {
		return this.name;
	}
	
	
	

}