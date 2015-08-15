package kruskal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Algo {
	
	private List<Edge> mst;
	
	public Algo(){
		this.mst=new ArrayList<Edge>();
	}
	
	public void spanningTree(List<Edge> edgeList, List<Vertex>vertexList){
		
		DisjointedSet disjointedSet = new DisjointedSet(vertexList);
		Collections.sort(edgeList);
		//System.out.println(edgeList.get(3).getWeight());
		for(Edge edge:edgeList){
			Vertex u =edge.getOneVertex();
			Vertex v =edge.getOtherVertex();
			
			if(disjointedSet.find(u.getNode()) != disjointedSet.find(v.getNode())){
				this.mst.add(edge);
				disjointedSet.union(u.getNode(), v.getNode());
			}
		}
	}
	
	public void printMST(){
		for(Edge edge:this.mst){
			System.out.println("Edge" + edge.getOneVertex() + "-" + edge.getOtherVertex());
		}
	}

}
