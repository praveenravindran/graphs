package dfs;

import vertex.Vertex;

public class Dfs {
	
	public void doDfs(Vertex vertex){
		if(vertex==null)
			return ;
		if(vertex.getAdjacencyList().size()==0){
				System.out.println(vertex);
				vertex.setVisited(true);
			}
		else{
			vertex.setVisited(true);
			System.out.println(vertex);
			for(Vertex v: vertex.getAdjacencyList()){
				doDfs(v);
			}
		}
	}
}
		
