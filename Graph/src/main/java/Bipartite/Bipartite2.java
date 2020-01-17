package Bipartite;

import java.util.LinkedList;

public class Bipartite2 {
	
	public  static int V=4;
	
	public static boolean isBipartiteUtil(int G[][], int src, int colorArr[]) {
		
		colorArr[src]=1;
		
		LinkedList<Integer> q=new LinkedList<Integer>();
		q.add(src);
		
		while(!q.isEmpty()) {
			
			int u=q.getFirst();
			q.pop();
			
			if(G[u][u]==1)
				return false;
			
			for(int v=0;v<V;v++) {
				
				if(G[u][v]==1 && colorArr[v]==-1) {
					
					colorArr[v]=1-colorArr[u];
					q.push(v);
				}
				
				if(G[u][v]==1 && colorArr[v]==colorArr[u])
					return false;
			}
		}
		
		return true;
		
	}
	
	public static boolean isBipartite(int G[][]) {
		
		int colorArr[]=new int[V];
		
		for(int i=0;i<V; i++)
			if(colorArr[i]==-1)
				if(isBipartiteUtil(G,i,colorArr)==false)
					return false;
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int G[][]= {{0,1,0,1},
				{1,0,1,0},
				{0,1,0,1},
				{1,0,1,0}};
		
		if(isBipartite(G))
			System.out.println("Yes");
		else
			System.out.println("No");

	}

}
