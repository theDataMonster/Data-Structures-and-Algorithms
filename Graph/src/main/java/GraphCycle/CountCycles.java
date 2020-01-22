package GraphCycle;

public class CountCycles {
	
	
	public static final int V=5;
	
	static int count= 0;
	
	static void DFS(int graph[][], boolean marked[], int n, int vert, int start) {
		
		marked[vert] = true;
		
		if(n==0) {
			
			marked[vert]=false;
			
			if(graph[vert][start]==1) {
				
				count++;
				return;
			}
			else
				return;
		}
		
		for(int i=0;i<V; i++) {
			
			if(!marked[i] && graph[vert][i]==1)
				
				DFS(graph, marked, n-1,i, start);
		}
		
		marked[vert]=false;
	}
	
	static int countCycles(int graph[][], int n) {
		
		boolean marked[]=new boolean[V];
		
		for(int i=0; i< V- (n-1); i++) {
			
			DFS(graph, marked, n-1, i, i);
			
			marked[i]=true;
		}
		
		return count/2;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int graph[][]= {{0,1,0,1,0},
				{1,0,1,0,1},
				{0,1,0,1,0},
				{1,0,1,0,1},
				{0,1,0,1,0}};
		
		int n=4;
		
		System.out.println("Total cycles of length "+n +" are "+countCycles(graph,n));
		
		

	}

}
