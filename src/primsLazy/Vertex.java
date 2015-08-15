package primsLazy;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	
	private String name;
	private boolean isVisited;
	private Vertex prevVertex;
	private List<Edge> adjacenciesList;
	
	
	public Vertex(String name){
		this.name = name;
		this.adjacenciesList= new ArrayList<Edge>();
	}
	
	public void addNeighbour(Edge edge){
		this.adjacenciesList.add(edge);
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public boolean isVisited() {
		return isVisited;
	}


	public void setVisited(boolean isVisited) {
		this.isVisited = isVisited;
	}


	public Vertex getPrevVertex() {
		return prevVertex;
	}


	public void setPrevVertex(Vertex prevVertex) {
		this.prevVertex = prevVertex;
	}


	public List<Edge> getAdjacenciesList() {
		return adjacenciesList;
	}


	public void setAdjacenciesList(List<Edge> adjacenciesList) {
		this.adjacenciesList = adjacenciesList;
	}


	@Override
	public String toString() {
	
		return this.name;
	}
	
	

}
