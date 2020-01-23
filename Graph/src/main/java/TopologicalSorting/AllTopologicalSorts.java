package TopologicalSorting;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AllTopologicalSorts {
	
	int V;
	
	List<Integer> adjListArray[];
	
	public AllTopologicalSorts(int V) {
		
		this.V=V;
		
		LinkedList[] adjListArray=new LinkedList[V];
		this.adjListArray=adjListArray;
		
		for(int i=0;i< V; i++) {
			
			adjListArray[i]=new LinkedList<>();
		}
	}
	
	public void addEdge(int src, int dest) {
		
		this.adjListArray[src].add(dest);
	}
	
	private void allTopologicalSortsUtil(boolean[] visited, int[] indegree, ArrayList<Integer> stack) {
		
		boolean flag=false;
		
		for(int i=0; i<this.V ;i++) {
			
			if(!visited[i] && indegree[i] == 0) {
				
				visited[i]=true;
				stack.add(i);
				
				for(int adjacent: this.adjListArray[i]) {
					
					indegree[adjacent]--;
				}
				
				allTopologicalSortsUtil(visited, indegree,stack);
				
				visited[i]=false;
				stack.remove(stack.size()-1);
				
				for(int adjacent: this.adjListArray[i]) {
					
					indegree[adjacent]++;
					
				}
				flag=true;
			}
		}
		
		if(!flag) {
			stack.forEach(i->System.out.print(i+ " "));
			System.out.println();
		}
	}
	
	public void allTopologicalSorts() {
		
		boolean[] visited=new boolean[this.V];
		
		int[] indegree=new int[this.V];
		
		for(int i=0;i< this.V; i++) {
			
			for(int var : this.adjListArray[i]) {
				
				indegree[var]++;
			}
		}
		
		ArrayList<Integer> stack=new ArrayList<>();
		allTopologicalSortsUtil(visited,indegree,stack);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AllTopologicalSorts g=new AllTopologicalSorts(6);
		g.addEdge(5, 2);
		g.addEdge(5, 0);
		g.addEdge(4, 0);
		g.addEdge(4, 1);
		g.addEdge(2, 3);
		g.addEdge(3, 1);
		
		System.out.println("All topological sorts");
		
		g.allTopologicalSorts();

	}

}
