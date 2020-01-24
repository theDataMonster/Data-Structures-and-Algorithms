package Backtracking;

import java.util.Arrays;

public class MColoringProblem {
	
	final int V=4;
	int[] color;
	
	boolean isSafe(int v, int graph[][], int color[], int c) {
		
		for(int i=0; i<V; i++)
			if(graph[v][i]==1 && c==color[i])
				return false;
		return true;
	}
	
	boolean graphColoringUtil(int graph[][], int m, int color[], int v) {
		
		if(v==V)
			return true;
		
		for(int c=1; c<=m; c++) {
			
				
				if(isSafe(v, graph, color,c)) {
					
					color[v]=c;
					
					if(graphColoringUtil(graph, m, color, v+1))
						return true;
					
					color[v]=0;
				}
		}
		
		return false;
		
	}
	
	boolean graphColoring(int graph[][], int m) {
		
		color=new int[V];
		for(int i=0; i<V; i++)
			color[i]=0;
		
		if(!graphColoringUtil(graph,m , color,0)) {
			
			System.out.println("The solution does not exist");
			return false;
		}
		
		printSolution(color);
		return true;
	}
	
	void printSolution(int color[]) {
		
		System.out.println("SOLUTION EXISTS, The following are the assigned colors" );
		
		Arrays.stream(color).forEach(c-> System.out.print(c+" "));
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MColoringProblem mco=new MColoringProblem();
		
		int graph[][]= {{0,1,1,1},
				{1,0,1,0},
				{1,1,0,1},
				{1,0,1,0}};
		
		int m=3;
		
		mco.graphColoring(graph, m);
		

	}

}
