package org.example.graph.operation;

import java.util.LinkedList;

import org.example.graph.model.Graph;

public class UnionFind {

	public int find(int parent[],int i){
		if(parent[i]==-1){
			return i;
		}else{
			return find(parent,parent[i]);
		}
	}
	
	public void union(int parent[], int x, int y)
    {
        int xset = find(parent, x);
        int yset = find(parent, y);
        parent[xset] = yset;
    }
	public boolean isCycle(Graph graph){
		int[] parent=new int[graph.getAdjacencyMatrix().length];
		for(int i=0;i<graph.getAdjacencyMatrix().length;i++){
			parent[i]=-1;
		}
		for(int i=0;i<graph.getAdjacencyMatrix().length;i++){
			LinkedList<Integer> edges=graph.getAdjacencyMatrix()[i];
			for(Integer edge:edges){
				if(find(parent,i)==find(parent,edge)){
					return true;
				}else{
					union(parent,i,edge);
				}
			}
		}
		return false;
	}
}
