package org.geeks.linkedlist.singlylinkedlist;

public class Simplelinklist1 {
	
	Node head;
	
	private void printList() {
		while(head!=null) {
			System.out.print(head.data+" --> ");
			head = head.next;
		}
	}
	
	public static void main(String[] args) {
		Simplelinklist1 list = new Simplelinklist1();
		
		list.head = new Node(1);
		
		Node newNode = new Node(2);
		list.head.next = newNode;
		
		Node third = new Node(3);
		newNode.next = third;
		
		list.printList();
		
	}

}
