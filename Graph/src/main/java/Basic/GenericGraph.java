package Basic;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class GenericGraph<T> {
	
	private Map<T,List<T>> map=new HashMap<>();
	
	public void addVertex(T s) {
		
		map.put(s, new LinkedList<T>());
	}
	
	public void addEdge(T source, T destination, boolean bidirectional) {
		
		if(!map.containsKey(source))
			addVertex(source);
		
		if(!map.containsKey(destination))
			addVertex(destination);
		
		map.get(source).add(destination);
		
		if(bidirectional==true) {
			map.get(destination).add(source);
		}
	}
	
	public void getVertexCount() {
		
		System.out.println("The graph has "+map.keySet().size()+" vertex");
		
	}
	
	public void getEdgesCount(boolean bidirection) {
		
		int count=0;
		for(T v: map.keySet()) {
			
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
