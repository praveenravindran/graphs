package primsEager;

import java.util.ArrayList;
import java.util.List;


public class Vertex implements Comparable<Vertex>{

	private String name;
	private Edge minEdge;
	private boolean isVisited;
	private Vertex prevVertex;
	private double minDistance = Double.POSITIVE_INFINITY;
	private List<Edge> adjacenceisList;

	public Vertex(String name) {
		this.name = name;
		this.adjacenceisList = new ArrayList<Edge>();
	}

	@Override
	public String toString() {
		return this.name;
	}

	public Edge getMinEdge() {
		return minEdge;
	}

	public void setMinEdge(Edge minEdge) {
		this.minEdge = minEdge;
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

	public List<Edge> getAdjacenceisList() {
		return adjacenceisList;
	}

	public void addNeighbour(Edge edge) {
		this.adjacenceisList.add(edge);
	}

	public double getMinDistance() {
		return minDistance;
	}

	public void setMinDistance(double minDistance) {
		this.minDistance = minDistance;
	}

	@Override
	public int compareTo(Vertex otherVertex) {
		return Double.compare(this.getMinDistance(), otherVertex.getMinDistance());
	}

}
