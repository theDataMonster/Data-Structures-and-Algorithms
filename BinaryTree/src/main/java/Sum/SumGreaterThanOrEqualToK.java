package Sum;

public class SumGreaterThanOrEqualToK {
	
	static int max(int l, int r) {
		
		return (l>=r? l:r);
	}
	
	static class Node{
		
		int data;
		Node left, right;
	}
	
	static class INT{
		
		int v;
		INT(int a){
			
			v=a;
		}
	}
	
	static Node newNode(int data) {
		
		Node node=new Node();
		node.data=data;
		node.left=node.right=null;
		
		return node;
	}
	
	static void print(Node root) {
		
		if(root!=null) {
			
			print(root.left);
			System.out.println(root.data);
			print(root.right);
		}
	}
	
	static Node pruneUtil(Node root, int k, INT sum) {
		
		if(root==null)
			return null;
		
		INT lsum=new INT(sum.v+ root.data);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
