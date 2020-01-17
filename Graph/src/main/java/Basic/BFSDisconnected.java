package Basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class BFSDisconnected {
	
	static HashMap<Integer,LinkedList<Integer>> graph=new HashMap<>();
	
	public static void addEdge(int a, int b) {
		
		if(graph.containsKey(a)) {
			
			LinkedList<Integer> l=graph.get(a);
			l.add(b);
			graph.put(a, l);
		}
		else {
			
			LinkedList<Integer> l=new LinkedList<>();
			l.add(b);
			graph.put(a, l);
		}
	}
	
	public static void bfshelp(int s, ArrayList<Boolean> visited) {
		
		LinkedList<Integer> q=new LinkedList<>();
		
		q.add(s);
		visited.set(s, true);
		
		while(!q.isEmpty()) {
			
			int f=q.poll();
			System.out.print(f+" ");
			
			if(graph.containsKey(f)) {
				
				Iterator<Integer> i=graph.get(f).listIterator();
				
				while(i.hasNext()) {
					
					int n=i.next();
					if(!visited.get(n)) {
						
						visited.set(n, true);
						q.add(n);
					}
				}
			}
		}
	}
	
	public static void bfs(int vertex) {
		
		ArrayList<Boolean> visited=new ArrayList<Boolean>();
		
		for(int i=0;i< vertex; i++)
			visited.add(i,false);
		
		for(int i=0; i< vertex; i++) {
			
			if(!visited.get(i))
				bfshelp(i,visited);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int v=5;
		addEdge(0,4);
		addEdge(1,2);
		addEdge(1,3);
		addEdge(1,4);
		addEdge(2,3);
		addEdge(3,4);
		bfs(v);
		
		

	}

}
