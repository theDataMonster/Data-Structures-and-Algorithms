package LCA;


//This is a Binary Search Tree
class Node{
	
	int key;
	Node left, right , parent;
	
	Node(int key){
		
		this.key=key;
		left=right=parent=null;
	}
}

public class ParentPointer {
	
	Node root, n1, n2, lca;
	
	Node insert(Node node, int key) {
		
		if(node==null)
			return new Node(key);
		if(key<node.key) {
			node.left=insert(node.left,key);
		}
		else if(key>node.key) {
			
			node.right=insert(node.right,key);
			node.right.parent=node;
		}
		
		return node;
	}
	
	int depth(Node node) {
		
		int d=-1;
		while(node!=null) {
			
			++d;
			node=node.parent;
		}
		return d;
	}
	
	Node LCA(Node n1, Node n2) {
		
		int d1= depth(n1);
		int d2= depth(n2);
		
		int diff=d1-d2;
		if(diff<0) {
			
			Node temp=n1;
			n1=n2;
			n2=temp;
			diff=-diff;
		}
		
		while(diff-- !=0)
			n1=n1.parent;
		
		while(n1!=null && n2!=null) {
			
			if(n1==n2)
				return n1;
			n1=n1.parent;
			n2=n2.parent;
			
		}
		
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParentPointer p=new ParentPointer();
		p.root=p.insert(p.root, 20);
		p.root=p.insert(p.root, 8);
		p.root=p.insert(p.root, 22);
		p.root=p.insert(p.root, 4);
		p.root=p.insert(p.root, 12);
		p.root=p.insert(p.root, 10);
		p.root=p.insert(p.root, 14);
		
		p.n1=p.root.left.right.left;
		p.n2=p.root.right;
		p.lca=p.LCA(p.n1, p.n2);
		
		if(p.n1==null) {
			System.out.println("n1 is null");
		}
		
		if(p.n2==null)
		{
			System.out.println("n2 is null");
		}
		
		if(p.lca==null) {
			System.out.println("lca is null");
		}
		System.out.println("Key of "+p.n1.key+" and "+p.n2.key+" is "+p.lca.key);
		

	}

}
