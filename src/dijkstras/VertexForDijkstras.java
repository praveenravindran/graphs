package dijkstras;

import java.util.ArrayList;
import java.util.List;



public class VertexForDijkstras implements Comparable<VertexForDijkstras> {
	
	private String name;
	private boolean visited;
	private List<Edge> adjacenciesList;
	private VertexForDijkstras previousVertex;
	private Double minDistance = Double.MAX_VALUE;
	
	public VertexForDijkstras(String name){
		this.name=name;
		this.adjacenciesList= new ArrayList<Edge>();
	}
	
	public void addNeighbour(Edge edge){
		this.adjacenciesList.add(edge);
	}

	@Override
	public String toString() {
		return this.name;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public VertexForDijkstras getPreviousVertex() {
		return previousVertex;
	}

	public void setPreviousVertex(VertexForDijkstras previousVertex) {
		this.previousVertex = previousVertex;
	}

	public Double getMinDistance() {
		return minDistance;
	}

	public void setMinDistance(Double minDistance) {
		this.minDistance = minDistance;
	}

	public List<Edge> getAdjacenciesList() {
		return adjacenciesList;
	}

	

	@Override
	public int compareTo(VertexForDijkstras otherVertex) {
		return Double.compare(this.minDistance, otherVertex.minDistance);
	}
	
	
	
	
}
