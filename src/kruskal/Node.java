package kruskal;

public class Node {

	private int height;
	private int id;
	private Node parentNode;

	public Node(int height, int id, Node parentNode) {
		this.height = height;
		this.id = id;
		this.parentNode = parentNode;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Node getParentNode() {
		return parentNode;
	}

	public void setParentNode(Node parentNode) {
		this.parentNode = parentNode;
	}
	
	

}
