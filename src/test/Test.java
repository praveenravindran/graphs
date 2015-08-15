package test;

import maze.FileReader;
import maze.MazeSolver;
import dfs.Dfs;
import bfs.Bfs;
import topologicalSort.TopologicalSort;
import vertex.Vertex;
import webcrawler.WebCrawler;

public class Test {
	
	public static void main(String args[]){
	
	Vertex vertex0 = new Vertex("budapest");
	
	Vertex vertex2 = new Vertex("munich");
	Vertex vertex1 = new Vertex("vegas");
	Vertex vertex3 = new Vertex("berlin");
	Vertex vertex4 = new Vertex("london");
	
	vertex0.addNeighbour(vertex1);
	vertex0.addNeighbour(vertex2);
	
	vertex1.addNeighbour(vertex3);
	vertex3.addNeighbour(vertex4);
	
	// /testing bfs
	//Bfs bfs = new Bfs();
	//bfs.giveBfs(vertex0);
	
	//testing webcrawler
	//WebCrawler webcrawler = new WebCrawler();
	//webcrawler.webCrawler("file:///home/pradeep/Desktop/praveen_website/index.html");
	
	// testing dfs
	//Dfs dfs = new Dfs();
	//dfs.doDfs(vertex0);
	
	//testing topologicalsort
	
	//TopologicalSort topologicalSort = new TopologicalSort();
	//topologicalSort.printTopologicalSort(vertex0);
	
	MazeSolver mazeSolver = new MazeSolver();
	mazeSolver.solveMaze("/home/pradeep/Desktop/maze/maze.txt",5,5);
	
	
	}
	
}
