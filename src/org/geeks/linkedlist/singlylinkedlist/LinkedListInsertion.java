package org.geeks.linkedlist.singlylinkedlist;

public class LinkedListInsertion {
	
	Node head;
	
	private void insertBegining(int data) {
		Node n = new Node(data);
		n.next = head;
		head = n;
	}
	
	private void insertMiddle(Node prevNode,int data) {
		if(prevNode ==null) {
			System.out.println("previos node cannot be null");
			return;
		}
		
		Node n = new Node(data);
		n.next = prevNode.next;
		prevNode.next = n;
		
	}
	
	private void insertEnd(int data) {
		Node n = new Node(data);
		if(head==null) {
			head = n;
			return;
		}
		Node last = head;
		while(last.next!=null) {
			last = last.next;
		}
		last.next = n;
	}
	
	private void printlist() {
		Node n = head;
		while(n!=null) {
			System.out.print(n.data+" ");
			n = n.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		LinkedListInsertion list = new LinkedListInsertion();
		
		list.head = new Node(5);
		Node second = new Node(6);
		Node third = new Node(9);
		list.head.next = second;
		second.next = third;
		System.out.println("original list");
		list.printlist();
		
		list.insertBegining(4);
		list.insertBegining(3);
		System.out.println("after insertion in begining");
		list.printlist();
		
		list.insertMiddle(second, 8);
		list.insertMiddle(second, 7);
		System.out.println("after insertion in middle");
		list.printlist();
		
		list.insertEnd(10);
		list.insertEnd(11);
		System.out.println("after insertion in end");
		list.printlist();
		
	}
	
}
