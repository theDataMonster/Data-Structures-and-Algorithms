package CheckingAndPrinting;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;

class TreeNode{
	
	int data;
	int vd;
	
	TreeNode left,right;
	
	public TreeNode(int data) {
		
		this.data=data;
		vd= Integer.MAX_VALUE;
		left=right=null;
	}
}

public class DiagonalSum {
	
	TreeNode root;
	
	public DiagonalSum(TreeNode root) {
		
		this.root=root;
	}
	
	public void diagonalSum() {
		
		Queue<TreeNode> queue=new LinkedList<TreeNode>();
		
		Map<Integer,Integer> map=new TreeMap<>();
		
		root.vd=0;
		queue.add(root);
		
		while(!queue.isEmpty()) {
			
			TreeNode curr=queue.remove();
			int vd=curr.vd;
			
			while(curr!=null) {
				
				int prevSum=(map.get(vd) ==null) ? 0: map.get(vd);
				map.put(vd, prevSum+curr.data);
				
				if(curr.left!=null)
				{
					curr.left.vd=vd+1;
					queue.add(curr.left);
					
				}
				
				curr=curr.right;
			}
		}
		
		Set<Entry<Integer,Integer>> set=map.entrySet();
		
		Iterator<Entry<Integer,Integer>> iterator= set.iterator();
		
		while(iterator.hasNext()) {
			
			Map.Entry<Integer,Integer> x=iterator.next();
			System.out.println(x.getValue()+" ");
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		root.right= new TreeNode(3);
		root.left.left=new TreeNode(9);
		root.left.right=new TreeNode(6);
		root.right.left=new TreeNode(4);
		root.right.right=new TreeNode(5);
		root.right.left.left= new TreeNode(12);
		root.right.left.right=new TreeNode(7);
		root.left.right.left= new TreeNode(11);
		root.left.left.right= new TreeNode(10);
		
		DiagonalSum tr=new DiagonalSum(root);
		tr.diagonalSum();

	}

}
