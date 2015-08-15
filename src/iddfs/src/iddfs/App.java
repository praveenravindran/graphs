package iddfs;

public class App {
	
	public static void main(String args[]){
		
		Node node1 = new Node("100");
		Node node2 = new Node("90");
		Node node3 = new Node("110");
		Node node4 = new Node("80");
		Node node5 = new Node("95");
		Node node6 = new Node("50");
		
		node1.addNeighbour(node2);
		node1.addNeighbour(node3);
		
		node2.addNeighbour(node4);
		node2.addNeighbour(node5);
		
		node4.addNeighbour(node6);
		
		Algo algo = new Algo(node4);
		algo.runIddfs(node1);
		
		
		
	}

}
