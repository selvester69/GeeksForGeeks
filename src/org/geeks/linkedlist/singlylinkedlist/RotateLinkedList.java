package org.geeks.linkedlist.singlylinkedlist;

public class RotateLinkedList {
	Node head;
	
	private void rotateList( int k) {
		if(k==0)
			return;
		Node current = head;
		int count = 0;
		while(count<k && current!=null) {
			current = current.next;
			count++;
		}
		if(current==null)
			return;
		Node kthNode = current;
		while(current.next!=null)
			current = current.next;
		
		current.next = head;
		head = kthNode.next;
		kthNode.next = null;
	}
	
	private void printlist() {
		Node n = head;
		while(n!=null) {
			System.out.print(n.data+" ");
			n = n.next;
		}
		System.out.println();
	}

	private void push(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	
	
	public static void main(String[] args) {
		RotateLinkedList list = new RotateLinkedList();
		list.push(8);
		list.push(7);
		list.push(6);
		list.push(5);
		list.push(4);
		list.push(3);
		list.push(2);
		list.push(1);
		
		System.out.println("list");
		list.printlist();
		list.rotateList( 5);
		list.printlist();
	}


}
