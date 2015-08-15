package bellmanford;

import java.util.List;

public class Algorithm {

	private List<Vertex> vertexList;
	private List<Edge> edgesList;
	

	public Algorithm(List<Vertex> vertexList, List<Edge> edgesList) {
		this.vertexList = vertexList;
		this.edgesList = edgesList;
	}

	public void shortestPath(Vertex sourceVertex, Vertex targetVertex) {
		sourceVertex.setMinDistance(0.0);
		
		 int length = this.vertexList.size();

		for (int i = 0; i < length - 1; i++) {
			for (Edge edge : this.edgesList) {
				if (edge.getStartVertex().getMinDistance() != Double.MAX_VALUE) {
					Vertex u = edge.getStartVertex();
					Vertex v = edge.getEndVertex();
					double newDistance = u.getMinDistance() + edge.getWeight();
					if (newDistance < v.getMinDistance()) {
						v.setMinDistance(newDistance);
						v.setPreviousVertex(u);
					}

				}
			}
		}

		for (Edge edge : this.edgesList) {
			if (edge.getStartVertex().getMinDistance() != Double.MAX_VALUE) {
				if (hasCycle(edge))
					System.out.println("negative cycle exists");
			}
		}
		
		if(targetVertex.getMinDistance()==Double.MAX_VALUE)
			System.out.println("there is no path at all from the source");
		else{
			System.out.println("shortest path is " + targetVertex.getMinDistance());
			Vertex actualVertex = targetVertex;
			while(actualVertex.getPreviousVertex()!=null){
				System.out.print(actualVertex + "-");
				actualVertex=actualVertex.getPreviousVertex();
				}
		}
		
	}

	public boolean hasCycle(Edge edge) {
		return (edge.getStartVertex().getMinDistance() + edge.getWeight() < edge
				.getEndVertex().getMinDistance());

	}
}
