package iddfs;

import java.util.ArrayList;
import java.util.List;

public class Node {

	private String name;
	private int depthLevel;
	private List<Node> adjacencyList;

	public Node(String name) {
		this.name = name;
		this.adjacencyList = new ArrayList<Node>();
	}

	public void addNeighbour(Node node) {
		this.adjacencyList.add(node);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDepthLevel() {
		return depthLevel;
	}

	public void setDepthLevel(int depthLevel) {
		this.depthLevel = depthLevel;
	}

	public List<Node> getAdjacencyList() {
		return adjacencyList;
	}

	@Override
	public String toString() {
		return this.name;
	}

}
