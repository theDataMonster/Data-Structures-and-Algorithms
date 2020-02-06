package DoublyLinkedList;

import java.util.HashSet;

//Remove duplicates from unsorted doubly Linked List
public class DuplicatesRemove {
	
	static class Node{
		int data;
		Node next;
		Node prev;
	}
	
	static Node deleteNode(Node head_ref, Node del) {
		
		if(head_ref==null || del == null)
			return null;
		
		if(head_ref == del)
			head_ref=del.next;
		
		if(del.next!=null)
			del.next.prev=del.prev;
		
		if(del.prev!=null)
			del.prev.next=del.next;
		
		return head_ref;
	}
	
	static Node removeDuplicates(Node head_ref) {
		
		if(head_ref==null)
			return null;
		
		HashSet<Integer> us=new HashSet<>();
		
		Node current= head_ref, next;
		
		while(current!=null) {
			
			if(us.contains(current.data)) {
				
				next=current.next;
				head_ref= deleteNode(head_ref,current);
				current=next;
			}
			else {
				
				us.add(current.data);
				
				current=current.next;
			}
		}
		
		return head_ref;
	}
	
	
	static Node push(Node head_ref, int new_data) {
		
		Node new_node=new Node();
		new_node.data= new_data;
		
		new_node.prev=null;
		new_node.next=head_ref;
		
		if(head_ref!=null)
			head_ref.prev=new_node;
		head_ref=new_node;
		
		return head_ref;
	}
	
	static void printList(Node head) {
		
		if(head==null) {
			
			System.out.println("DLL is empty");
		}
		
		while(head!=null) {
			
			System.out.print(head.data+" ");
			head=head.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node head=null;
		
		head=push(head, 12);
		head=push(head, 12);
		head=push(head, 10);
		head=push(head, 4);
		head=push(head, 8);
		head=push(head, 4);
		head=push(head, 6);
		head=push(head, 4);
		head=push(head, 4);
		head=push(head, 8);
		
		
		System.out.println("Original Doubly Linked List-->");
		printList(head);
		
		head=removeDuplicates(head);
		
		System.out.println();
		System.out.println(" DLL after remove duplicates -->");
		printList(head);

	}

}
