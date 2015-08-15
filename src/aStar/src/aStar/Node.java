package aStar;

import java.util.ArrayList;
import java.util.List;

public class Node implements Comparable<Node> {

	private String value;
	private double gscore; // distance from this node to another node
	private double fscore; // sum of gscore and heuristics
	private double x;
	private double y;
	private List<Edge> adjacencyList;
	private Node parentNode;

	public Node(String value) {
		this.value = value;
		adjacencyList = new ArrayList<Edge>();
	}
	
	public void addNeighbour(Edge edge){
		this.adjacencyList.add(edge);
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public double getGscore() {
		return gscore;
	}

	public void setGscore(double gscore) {
		this.gscore = gscore;
	}

	public double getFscore() {
		return fscore;
	}

	public void setFscore(double fscore) {
		this.fscore = fscore;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public Node getParentNode() {
		return parentNode;
	}

	public void setParentNode(Node parentNode) {
		this.parentNode = parentNode;
	}

	public List<Edge> getAdjacencyList() {
		return adjacencyList;
	}

	@Override
	public String toString() {
		return this.value;
	}

	@Override
	public int compareTo(Node otherNode) {
		return Double.compare(this.gscore, otherNode.gscore);
	}

}
