package CircularList;


class Node{
	
	int val;
	
	Node left, right;
	
	public Node(int val) {
		
		this.val=val;
		left=right=null;
	}
}
public class BinaryTreeToDLL {

	Node root;
	public BinaryTreeToDLL() {
		
		root=null;
	}
	
	public Node concatenate(Node leftList, Node rightList) {
		
		if(leftList==null) {
			return rightList;
		}
		
		if(rightList==null) {
			
			return leftList;
		}
		
		Node leftLast=leftList.left;
		
		Node rightLast= rightList.left;
		
		leftLast.right=rightList;
		rightLast.left=leftLast;
		
		leftList.left=rightLast;
		
		return leftList;
	}
	
	public Node bTreeToCList(Node root) {
		
		if(root==null)
			return null;
		
		Node left = bTreeToCList(root.left);
		Node right= bTreeToCList(root.right);
		
		root.left=root.right=root;
		
		return concatenate(concatenate(left,root), right);
	}
	
	public void display(Node head) {
		
		System.out.println("Circular list is:");
		Node itr=head;
		
		do {
			System.out.print(itr.val+" ");
			itr=itr.right;
			
		}while(itr!=head);
			System.out.println("The end line");
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeToDLL tree=new BinaryTreeToDLL();
		tree.root=new Node(10);
		tree.root.left=new Node(12);
		tree.root.right=new Node(15);
		tree.root.left.left=new Node(25);
		tree.root.left.right= new Node(30);
		tree.root.right.left=new Node(36);
		
		Node head=tree.bTreeToCList(tree.root);
		
		tree.display(head);
		

	}

}
