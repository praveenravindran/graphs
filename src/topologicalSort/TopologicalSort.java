package topologicalSort;

import java.util.Stack;

import vertex.Vertex;

public class TopologicalSort {
	
	private Stack<Vertex> stack;
	
	public TopologicalSort(){
		stack = new Stack<Vertex>();
	}
	
	public Stack<Vertex> doDfs(Vertex vertex){
		if(vertex == null)
			return null;
		if(vertex.getAdjacencyList().isEmpty()){
			stack.push(vertex);
			return stack;
		}
		else{
			vertex.setVisited(true);
			for(Vertex v:vertex.getAdjacencyList()){
				if(!v.isVisited()){
				doDfs(v);
				}
			}
			stack.push(vertex);
			
		}
		return stack;	
	}
	
	public void printTopologicalSort(Vertex vertex){
		this.doDfs(vertex);
		for(Vertex v:stack){
			System.out.println(v);
		}
	}
}
