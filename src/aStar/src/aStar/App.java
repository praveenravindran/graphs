package aStar;

import java.util.List;

public class App {
	
	public static void main(String args[]){
		
		Node node1 = new Node("A");
		Node node2 = new Node("B");
		Node node3 = new Node("C");
		Node node4 = new Node("D");
		
		node1.addNeighbour(new Edge(10,node2));
		node1.addNeighbour(new Edge(1,node4));
		node2.addNeighbour(new Edge(10,node3));
		node3.addNeighbour(new Edge(10,node4));
		
		Algorithm algo = new Algorithm();
		algo.aStarSearch(node1, node4);
		
		List<Node> path = algo.printPath(node4);
		System.out.println(path);
		
		
		
	}

}
