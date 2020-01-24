package MinimumSpanningTree;

import java.util.Comparator;
import java.util.LinkedList;

public class PrimMSTAdjList {
	
	class node1{
		
		int dest;
		
		int weight;
		
		node1(int a, int b){
			
			dest=a;
			weight=b;
		}
	}
	
	static class Graph{
		
		int V;
		
		LinkedList<node1>[] adj;
		
		Graph(int e){
			
			V=e;
			adj=new LinkedList[V];
			
			for(int i=0;i<V;i++) {
				
				adj[i]= new LinkedList<>();
			}
		}
	}
		
		class node{
			int vertex;
			int key;
		}
		
		class comparator implements Comparator<node>{

			@Override
			public int compare(node arg0, node arg1) {
				// TODO Auto-generated method stub
				return arg0.key-arg1.key;
			}
			
			
		}
		
		void addEdge(Graph graph, int src, int dest, int weight) {
			
			node1 node0= new node1(dest,weight);
			node1 node=new node1(src, weight);
			
			graph.adj[src].addLast(node0);
			graph.adj[src].addLast(node);
		}
		
		void prims_mst(Graph graph) {
			
			Boolean[] mstset=new Boolean[graph.V];
			node[] e=new node[graph.V];
			
			int[] parent=new int[graph.V];
			
			
			
		}
		


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
