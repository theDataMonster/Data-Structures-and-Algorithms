package TreesInForest;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class GraphTrees {
	
	//program to count the number of trees in a forest
	
	private int V;
	
	private LinkedList<Integer> adj[];
	
	GraphTrees(int v){
		
		V=v;
		adj=new LinkedList[v];
		for(int i=0;i< v; i++) {
			
			adj[i]=new LinkedList();
		}
	}
	
	void addEdge(int v, int w) {
		
		adj[v].add(w);
	}
	
	void DFSUtil(int v, boolean visited[]) {
		
		visited[v]=true;
		
		Iterator<Integer> i=adj[v].listIterator();
		
		while(i.hasNext()) {
			
			int n=i.next();
			if(!visited[n]) {
				
				DFSUtil(n,visited);
			}
		}
	}
	
	int countTrees() {
		
		boolean visited[]=new boolean[V];
		
		System.out.println();
		for(boolean v:visited)
			System.out.print(v+" ");
		
		
		int res=0;
		
		for(int i=0;i<V;i++) {
			
			if(visited[i]==false) {
				
				DFSUtil(i,visited);
				res++;
			}
		}
		
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GraphTrees g=new GraphTrees(5);
		
		g.addEdge(0, 1);
		g.addEdge(0,2);
		g.addEdge(3, 4);
		
		System.out.println(g.countTrees());
		
		

	}

}
