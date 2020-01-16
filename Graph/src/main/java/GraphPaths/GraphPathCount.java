package GraphPaths;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class GraphPathCount {
	
	private int V;
	
	private LinkedList<Integer> adj[];
	
	GraphPathCount(int v){
		
		V=v;
		adj=new LinkedList[v];
		
		for(int i=0;i<v;i++) {
			
			adj[i]=new LinkedList<>();
			
			
		}
	}
	
	void addEdge(int v, int w) {
		
		adj[v].add(w);
	}
	
	int countPathsUtil(int u,int d, boolean visited[], int pathCount) {
		
		visited[u]=true;
		
		if(u==d)
			pathCount++;
		else {
			Iterator<Integer> i=adj[u].listIterator();
			
			while(i.hasNext()) {
				
				int n=i.next();
				if(!visited[n]) {
					pathCount=countPathsUtil(n,d,visited,pathCount);
				}
			}
		}
		
		visited[u]=false;
		return pathCount;
	}
	
	int countPaths(int s, int d) {
		
		boolean visited[]=new boolean[V];
		Arrays.fill(visited, false);
		
		int pathCount=0;
		
		pathCount=countPathsUtil(s,d,visited,pathCount);
		
		return pathCount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GraphPathCount g=new GraphPathCount(4);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(0, 3);
		g.addEdge(2, 0);
		g.addEdge(2, 1);
		g.addEdge(1, 3);
		
		int s=2;
		int d=3;
		
		
		System.out.println(g.countPaths(s, d));
		
		

	}

}
