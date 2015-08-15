package primsEager;


public class Edge implements Comparable<Edge> {

	private Double weight;
	private Vertex startVertex;
	private Vertex targetVertex;

	public Edge(Double weight, Vertex startVertex, Vertex targetVertex) {

		this.weight = weight;
		this.startVertex = startVertex;
		this.targetVertex = targetVertex;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Vertex getStartVertex() {
		return startVertex;
	}

	public void setStartVertex(Vertex startVertex) {
		this.startVertex = startVertex;
	}

	public Vertex getTargetVertex() {
		return targetVertex;
	}

	public void setTargetVertex(Vertex targetVertex) {
		this.targetVertex = targetVertex;
	}

	@Override
	public int compareTo(Edge otherEdge) {
		return Double.compare(this.weight, otherEdge.getWeight()); // we use comparable to facilitate polling from the priority queue
	}
}
