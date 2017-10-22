/**
 * 
 */
package org.example.graph.model;

import java.util.LinkedList;

/**
 * @author Sabyasachi
 * This Graph model represent graph as Adjacency List
 */
public class GraphAL extends Graph{

@SuppressWarnings("unchecked")
public GraphAL(int vertices){
	this.vertices=vertices;
	adjacencyMatrix=new LinkedList[this.vertices];
	for(int i=0;i<vertices;i++){
		adjacencyMatrix[i]=new LinkedList<Integer>();
	}
}

public void addEdge(int src,int dest){
	this.adjacencyMatrix[src].add(dest);
	this.adjacencyMatrix[dest].add(src);
}



}
