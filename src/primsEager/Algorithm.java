package primsEager;

import java.util.List;
import java.util.PriorityQueue;

public class Algorithm {

	private List<Vertex> vertexList;
	private PriorityQueue<Vertex> heap;

	public Algorithm(Graph graph) {
		this.vertexList = graph.getVertexList();
		this.heap = new PriorityQueue();
	}

	public void spanningTree() {
		for (Vertex vertex : vertexList) {
			if (!vertex.isVisited()) {
				eagerPrim(vertex);
			}
		}
	}

	private void eagerPrim(Vertex vertex) {
		vertex.setMinDistance(0);
		this.heap.add(vertex);

		while (!this.heap.isEmpty()) {
			Vertex v = this.heap.remove();
			searchVertex(v);

		}
	}

	private void searchVertex(Vertex vertex) {
		vertex.setVisited(true);

		for (Edge edge : vertex.getAdjacenceisList()) {
			Vertex v = edge.getTargetVertex();

			if (v.isVisited())
				continue;
			if (edge.getWeight() < v.getMinDistance()) {
				v.setMinDistance(edge.getWeight());
				v.setMinEdge(edge);

				if (this.heap.contains(v))
					this.heap.remove(v);
				this.heap.add(v);
			}
		}

	}
	
	public void show(){
		for(Vertex v :this.vertexList){
			if(v.getMinEdge()!=null){
				Edge e = v.getMinEdge();
				System.out.println("Edge" + e.getStartVertex() + "-" + e.getTargetVertex());
			}
		}
	}

}
