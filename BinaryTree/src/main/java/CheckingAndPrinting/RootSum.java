package CheckingAndPrinting;

import java.util.HashSet;
//print root to leaf path with sum equal to root's data
public class RootSum {
	
	static class Node{
		
		int data;
		Node left,right;
	}
	
	static Node newNode(int data) {
		
		Node node=new Node();
		node.data=data;
		node.left= node.right=null;
		
		return (node);
	}
	
	static boolean printPathUtil(Node node, HashSet<Integer> s, int root_data) {
		
		if(node==null)
			return false;
		int rem=root_data-node.data;
		if(s.contains(rem))
			return true;
		
		s.add(node.data);
		
		boolean res=printPathUtil(node.left, s, root_data) || printPathUtil(node.right, s,root_data);
		
		s.remove(node.data);
		
		return res;
	}
	
	static boolean isPathSum(Node root) {
		
		HashSet<Integer> s=new HashSet<>();
		return printPathUtil(root.left, s, root.data) || printPathUtil(root.right,s , root.data);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node root=newNode(8);
		root.left= newNode(5);
		root.right=newNode(4);
		root.left.left=newNode(9);
		root.left.right=newNode(7);
		root.left.right.left=newNode(1);
		root.left.right.right=newNode(12);
		root.left.right.right.right=newNode(2);
		root.right.right=newNode(11);
		root.right.right.left=newNode(3);
		
		System.out.println(isPathSum(root)? "Yes":"No");

	}

}
