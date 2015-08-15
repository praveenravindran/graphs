package kruskal;

import java.util.ArrayList;
import java.util.List;

public class DisjointedSet {
	private int nodeCount;
	private int setCount;
	private List<Node> rootNode;

	public DisjointedSet(List<Vertex> vertexList) {
		this.rootNode = new ArrayList<Node>(vertexList.size());
		makeSets(vertexList);
	}

	public void makeSets(List<Vertex> vertexList) {
		for (Vertex vertex : vertexList) {
			makeSet(vertex);
		}
	}

	public void makeSet(Vertex vertex) {
		Node node = new Node(0, this.rootNode.size(), null);
		vertex.setNode(node);
		this.setCount++;
		this.nodeCount++;
		this.rootNode.add(node);
		//System.out.println(this.rootNode.get(0).getParentNode());

	}

	public int find(Node node) {
		Node currentNode = node;
		while (currentNode.getParentNode() != null) {
			currentNode = currentNode.getParentNode();
		}

		Node root = currentNode;
		currentNode = node;
		while (!currentNode.equals(root)) {
			Node tempNode = currentNode.getParentNode();
			currentNode.setParentNode(root);
			currentNode = tempNode;
		}

		return root.getId();
	}

	public void union(Node node1, Node node2) {
		int index1 = find(node1);
		int index2 = find(node2);
		if (index1 == index2)
			return;
		else {
			Node root1 = this.rootNode.get(index1);
			Node root2 = this.rootNode.get(index2);

			if (root1.getHeight() < root2.getHeight()) {
				root1.setParentNode(root2);
			}

			else if (root1.getHeight() > root2.getHeight())
				root2.setParentNode(root1);
			else
				root2.setParentNode(root1);
		}
		this.setCount = this.setCount--;

	}

}
