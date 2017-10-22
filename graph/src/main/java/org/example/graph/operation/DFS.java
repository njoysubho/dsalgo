package org.example.graph.operation;

import java.util.LinkedList;
import java.util.Stack;

import org.example.graph.model.Graph;

public class DFS {

	public Stack<Integer>s=new Stack<Integer>();
	boolean visited[];
	public void traverse(Graph graph,int source){
	   visited=new boolean[graph.getAdjacencyMatrix().length];
		s.push(source);
		visited[source]=true;
		while(!s.isEmpty()){
			System.out.println(s.pop());
			LinkedList<Integer> adjacentVertices=graph.getAdjacencyMatrix()[source];
			for(int i=0;i<adjacentVertices.size();i++){
				Integer v=adjacentVertices.get(i);
				if (!visited[v]) {
                    visited[v]=true;
					s.push(v);
				}
			}
		}
	}
}
