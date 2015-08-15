package kruskal;

public class Edge implements Comparable<Edge> {

	private double weight;
	private Vertex oneVertex;
	private Vertex otherVertex;

	public Edge(double weight, Vertex oneVertex, Vertex otherVertex) {
		this.weight = weight;
		this.oneVertex = oneVertex;
		this.otherVertex = otherVertex;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Vertex getOneVertex() {
		return oneVertex;
	}

	public void setOneVertex(Vertex oneVertex) {
		this.oneVertex = oneVertex;
	}

	public Vertex getOtherVertex() {
		return otherVertex;
	}

	public void setOtherVertex(Vertex otherVertex) {
		this.otherVertex = otherVertex;
	}

	@Override
	public int compareTo(Edge otherEdge) {
		return Double.compare(this.weight, otherEdge.weight);
	}

}
