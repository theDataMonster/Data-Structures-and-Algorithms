package com;

//Reverse a Linked List using a special method

class Node{
	
	int data;
	Node next;
	Node(int val){
		
		data = val;
		next=null;
	}
}

public class ReverseListSpecial {
	
	static void printReverse(Node head, int n) {
		
		int j=0;
		Node current=head;
		
		while(current!=null) {
			
			for(int i=0; i<  2*(n-j) ;i++) {
				
				System.out.print(" ");
			}
			
			System.out.print("\r"+ current.data);
			
			current=current.next;
			j++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
