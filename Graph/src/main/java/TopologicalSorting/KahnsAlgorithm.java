package TopologicalSorting;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

public class KahnsAlgorithm {
	
	int V;
	
	ArrayList<Integer>[] adj;
	
	public KahnsAlgorithm(int V) {
		
		this.V=V;
		adj=new ArrayList[V];
		
		for(int i=0;i<V;i++) {
			adj[i]=new ArrayList<Integer>();
		}
	}
	
	public void addEdge(int u, int v) {
		
		adj[u].add(v);
	}
	
	public void topologicalSort() {
		
		int indegree[] = new int[V];
		
		
		for(int i=0; i< V; i++) {
			
			ArrayList<Integer> temp=(ArrayList<Integer>) adj[i];
			
			for(int node: temp) {
				
				indegree[node]++;
			}
		}
		
		
		Queue<Integer> q=new LinkedList<Integer>();
		
		for(int i=0;i<V;i++) {
			
			if(indegree[i]==0)
				q.add(i);
		}
		
		int cnt=0;
		
		Vector<Integer> topOrder=new Vector<Integer>();
		
		while(!q.isEmpty()) {
			
			int u=q.poll();
			topOrder.add(u);
			
			for(int node : adj[u])
			{
				if(--indegree[node]==0)
					q.add(node);
			}
			cnt++;
		}
		
		if(cnt!=V)
			System.out.println("There is a cycle in the graph");
		else {
			for(int i : topOrder) {
				
				System.out.print(i+" ");
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		KahnsAlgorithm g=new KahnsAlgorithm(6);
		g.addEdge(5,2);
		g.addEdge(5, 0);
		g.addEdge(4, 0);
		g.addEdge(4, 1);
		g.addEdge(2, 3);
		g.addEdge(3, 1);
		
		System.out.println("The topological sort is as follows--");
		
		g.topologicalSort();

	}

}
