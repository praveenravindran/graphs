package primsEager;

import java.util.ArrayList;
import java.util.List;

public class App {
	
	public static void main(String args[]){
		
		Vertex vertex1= new Vertex("A");
		Vertex vertex2= new Vertex("B");
		Vertex vertex3= new Vertex("C");
		
		List<Vertex> vertexList = new ArrayList<Vertex>();
		vertexList.add(vertex1);
		vertexList.add(vertex2);
		vertexList.add(vertex3);
		
		Graph graph = new Graph();
		graph.setVertexList(vertexList);
		
		graph.addEdge(new Edge(1.0,vertex1,vertex2));
		graph.addEdge(new Edge(1.0,vertex1,vertex3));
		graph.addEdge(new Edge(10.0,vertex2,vertex3));
		
		Algorithm algo = new Algorithm(graph);
		algo.spanningTree();
		algo.show();
		
		
	}

}
