package Traversal;

class tNode{
	
	int data;
	tNode left, right;
	
	tNode(int item){
		
		data=item;
		left=right=null;
	}
}

public class Inorder3 {
	
	tNode root;
	
	void MorrisTraversal(tNode root) {
		
		tNode current, pre;
		
		if(root==null) {
			
			return;
		}
		
		current = root;
		
		while(current!=null) {
			
			if(current.left == null) {
				
				System.out.print(current.data+" ");
				current= current.right;
			}
			else {
				
				pre=current.left;
				
				while(pre.right!=null && pre.right!=null)
					pre=pre.right;
				
				if(pre.right == null) {
					
					pre.right=current;
					current=current.left
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
