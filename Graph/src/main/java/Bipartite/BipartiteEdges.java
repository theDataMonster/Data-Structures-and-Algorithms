package Bipartite;

import java.util.Vector;

public class BipartiteEdges {
	
	//Minimum number of edges in order to make the graph bipartite
	
	static long count_color[]=new long[2];
	
	static void dfs(Vector<Integer> adj[],int node, int parent, boolean color) {
		
		count_color[color==false?0:1]++;
		
		for(int i=0; i<adj[node].size(); i++) {
			
			if(adj[node].get(i) !=parent) {
				
				dfs(adj, adj[node].get(i), node, !color);
			}
		}
		
	}
	
	static int findMaxEdges(Vector<Integer> adj[], int n) {
		
		dfs(adj,1,0,false);
		
		return (int) (count_color[0] * count_color[1] -(n-1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		Vector<Integer>[] adj=new Vector[n+1];
		
		for(int i=0;i< n+1; i++) {
			
			adj[i]=new Vector<Integer>();
		}
		
		adj[1].add(2);
		adj[1].add(3);
		adj[2].add(4);
		adj[2].add(5);
		
		System.out.println(findMaxEdges(adj,n));

	}

}
