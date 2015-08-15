package dijkstras;

public class App {
	
	public static void main(String args[]){
		VertexForDijkstras v1 = new VertexForDijkstras("A");
		VertexForDijkstras v2 =new VertexForDijkstras("B");
		VertexForDijkstras v3 =new VertexForDijkstras("C");
		
		v1.addNeighbour(new Edge(1,v1,v2));
		v1.addNeighbour(new Edge(10,v1,v3));
		v2.addNeighbour(new Edge(1,v2,v3));
		
		Algorithm algo = new Algorithm();
		algo.computePath(v1);
		
		System.out.println(algo.getShoretestPath(v3));
		
		
	}

}
