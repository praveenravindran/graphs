package primsLazy;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Algorithm {

	private List<Vertex> unVisited;
	private List<Edge> spanningTree;
	private PriorityQueue<Edge> edgeHeap;
	private Double fullCost=0.0; // sum of the weights of all edges in the spanning
								// tree

	public Algorithm(List<Vertex> unVisited) {
		this.unVisited = unVisited;
		this.spanningTree = new ArrayList<Edge>();
		this.edgeHeap = new PriorityQueue<Edge>();

	}

	public void primsAlgo(Vertex vertex) {
		this.unVisited.remove(vertex);
		while (!this.unVisited.isEmpty()) {
			for (Edge edge : vertex.getAdjacenciesList()) {
				if (unVisited.contains(edge.getTargetVertex())) {
					this.edgeHeap.add(edge);
				}
			}

			Edge minEdge = this.edgeHeap.poll();
			this.spanningTree.add(minEdge);
			this.fullCost = this.fullCost + minEdge.getWeight();
			vertex = minEdge.getTargetVertex();
			this.unVisited.remove(vertex);
		}

		for (Edge edge : this.spanningTree) {
			System.out.println(edge.getStartVertex() + "-"
					+ edge.getTargetVertex());
		}
	}

	public void setUnVisited(List<Vertex> unVisited) {
		this.unVisited = unVisited;
	}

	public void setSpanningTree(List<Edge> spanningTree) {
		this.spanningTree = spanningTree;
	}

}
