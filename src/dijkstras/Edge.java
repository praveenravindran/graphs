package dijkstras;

public class Edge {
	
	private double weight;
	private VertexForDijkstras startVertex;
	private VertexForDijkstras targetVertex;
	
	public Edge(double weight, VertexForDijkstras startVertex, VertexForDijkstras targetVertex ){
		this.weight=weight;
		this.startVertex=startVertex;
		this.targetVertex=targetVertex;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public VertexForDijkstras getStartVertex() {
		return startVertex;
	}

	public void setStartVertex(VertexForDijkstras startVertex) {
		this.startVertex = startVertex;
	}

	public VertexForDijkstras getTargetVertex() {
		return targetVertex;
	}

	public void setTargetVertex(VertexForDijkstras targetVertex) {
		this.targetVertex = targetVertex;
	}
	
	
	
	

}
