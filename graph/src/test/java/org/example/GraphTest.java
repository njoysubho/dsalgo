package org.example;

import org.example.graph.model.Graph;
import org.example.graph.model.GraphAL;
import org.example.graph.operation.DFS;
import org.junit.Before;
import org.junit.Test;



public class GraphTest{
    Graph graph=null;
    
	@Before
	public void testAddEdge(){
		graph=new GraphAL(5);
		graph.addEdge(0, 1);
		graph.addEdge(0, 4);
		graph.addEdge(1,2);
		graph.addEdge(1, 3);
		graph.addEdge(1, 4);
		graph.addEdge(2, 3);
		graph.addEdge(3, 4);
	}
	
	@Test
	public void testDFS(){
		DFS dfs=new DFS();
	    dfs.traverse(graph, 1);	
	}
	
	@Test
	public void testFind(){
		
		
	}
}
