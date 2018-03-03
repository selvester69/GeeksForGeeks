package org.geeks.linkedlist.singlylinkedlist;

public class MoveLastToFirst {
	
	
	private void moveLastToFirst(Node head) {
		if(head==null || head.next==null)
			return ;
		Node secLast = null,last=head;
		while(last.next!=null) {
			secLast = last;
			last = last.next;
		}
		secLast.next = null;
		last.next = head;
		head = last;
		printlist(head);
	}

	private void printlist(Node head) {
		Node n = head;
		while(n!=null) {
			System.out.print(n.data+" ");
			n = n.next;
		}
		System.out.println();
	}

	private Node push(Node h,int data) {
		Node newNode = new Node(data);
		newNode.next = h;
		h = newNode;
		return h;
	}

	public static void main(String[] args) {
		MoveLastToFirst object = new MoveLastToFirst();
		Node list1 = null;
		list1=object.push(list1,9);
		list1=object.push(list1,7);
		list1=object.push(list1,6);
		list1=object.push(list1,5);
		list1=object.push(list1,4);
		list1=object.push(list1,3);
		list1=object.push(list1,1);
		System.out.println("original list1");
		object.printlist(list1);
		
		object.moveLastToFirst(list1);
	}

}
