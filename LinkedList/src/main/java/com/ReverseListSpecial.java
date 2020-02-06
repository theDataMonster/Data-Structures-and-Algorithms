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
	
	static Node push(Node head, int data) {
		
		Node new_node=new Node(data);
		new_node.next= head;
		head=new_node;
		
		return head;
	}
	
	static int printList(Node head) {
		
		int i=0;
		Node temp= head;
		while(temp!=null) {
			
			System.out.print(temp.data+ " ");
			temp=temp.next;
			i++;
			
		}
		
		return i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node head=null;
		
		head=push(head,1);
		head=push(head, 2);
		head=push(head, 3);
		head=push(head, 4);
		head= push(head, 5);
		head=push(head, 6);
		
		System.out.println("Given Linked List-->");
		
		int n=printList(head);
		System.out.println();
		System.out.println("Reversed List-->");
		printReverse(head,n);

	}

}
