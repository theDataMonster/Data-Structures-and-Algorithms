package BFSandDFS;

public class MatrixProbablity {
	
	static boolean isSafe(int x, int y, int m ,int n) {
		
		return (x>=0 && x<m && y>=0 && y<n);
	}
	
	static double findProbability(int m ,int n, int x, int y, int N) {
		
		if(!isSafe(x,y,m,n)) {
			return 0.0;
		}
		
		if(N==0)
			return 1.0;
		
		double prob= 0.0;
		//Recursion is DFS traversal
		//Use of queue is BFS
		
		
		//DFS on a directed graph results in a tree
		prob+=findProbability(m, n, x-1,y, N-1)* 0.25;
		
		prob+=findProbability(m,n,x,y+1, N-1)*0.25;
		
		prob+=findProbability(m,n,x+1,y,N-1)*0.25;
		
		prob+=findProbability(m,n,x,y-1,N-1)*0.25;
		
		return prob;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m=5, n=5;
		
		int i=1,j=1;
		
		int N=2;
		
		System.out.println("Probability is "+findProbability(m,n,i,j,N));

	}

}
