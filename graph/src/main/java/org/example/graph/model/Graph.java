package org.example.graph.model;

import java.util.LinkedList;

public abstract class Graph {
	protected int vertices;
	protected LinkedList<Integer>[] adjacencyMatrix;
	public LinkedList<Integer>[] getAdjacencyMatrix() {
		return adjacencyMatrix;
	}

	public abstract void addEdge(int src,int dest);
}
