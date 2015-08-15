package bellmanford;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	private String name;
	private boolean visited;
	private List<Edge> adjacencyList;
	private double minDistance = Double.MAX_VALUE;
	private Vertex previousVertex;

	public Vertex(String name) {
		this.name = name;
		this.adjacencyList = new ArrayList<Edge>();
	}

	public void addEdge(Edge edge) {
		this.adjacencyList.add(edge);
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

	public List<Edge> getAdjacencyList() {
		return adjacencyList;
	}

	public double getMinDistance() {
		return minDistance;
	}

	public void setMinDistance(double minDistance) {
		this.minDistance = minDistance;
	}

	public Vertex getPreviousVertex() {
		return previousVertex;
	}

	public void setPreviousVertex(Vertex previousVertex) {
		this.previousVertex = previousVertex;
	}

}
