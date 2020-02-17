package Traversal;

import java.util.HashMap;

//To print postorder traversal from preorder and inorder traversals
public class PrePost {
	
	static int preIndex=0;
	
	void printPost(int[] in, int[] pre, int inStrt, int inEnd, HashMap<Integer,Integer> hm) {
		
		if(inStrt> inEnd)
			return;
		
		int inIndex=hm.get(pre[preIndex++]);
		
		printPost(in, pre, inStrt, inIndex-1,hm);
		
		printPost(in,pre,inIndex+1, inEnd,hm);
		
		System.out.print(in[inIndex]+ " ");
	}
	
	void printPostMain(int[] in, int[] pre) {
		
		int n= pre.length;
		
		HashMap<Integer, Integer> hm=new HashMap<>();
		
		for(int i=0;i<n;i++)
			hm.put(in[i], i);
		
		printPost(in,  pre, 0, n-1, hm);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int in[]= {4,2 ,5,1,3,6};
		int pre[]= {1,2,4,5,3,6};
		
		PrePost tree=new PrePost();
		tree.printPostMain(in, pre);

	}

}
