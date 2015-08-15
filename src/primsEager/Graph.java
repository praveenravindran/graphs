package primsEager;

import java.util.ArrayList;
import java.util.List;

public class Graph {
	
	private List<Vertex> vertexList;
	private List<Edge> edgeList;
	
	public Graph(){
		this.edgeList=new ArrayList<Edge>();
		this.vertexList= new ArrayList<Vertex>();
	}
	
	public List<Vertex> getVertexList() {
		return vertexList;
	}

	public void setVertexList(List<Vertex> vertexList) {
		this.vertexList = vertexList;
	}

	public List<Edge> getEdgeList() {
		return edgeList;
	}

	public void setEdgeList(List<Edge> edgeList) {
		this.edgeList = edgeList;
	}

	public void addEdge(Edge edge){
		Vertex startVertex = edge.getStartVertex();
		Vertex targetVertex = edge.getTargetVertex();
		
		this.vertexList.get(vertexList.indexOf(startVertex)).addNeighbour (new Edge(edge.getWeight(),startVertex,targetVertex));
		this.vertexList.get(vertexList.indexOf(targetVertex)).addNeighbour (new Edge(edge.getWeight(),targetVertex,startVertex));
	}
	

}
