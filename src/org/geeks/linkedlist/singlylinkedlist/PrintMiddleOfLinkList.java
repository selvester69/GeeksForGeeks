package org.geeks.linkedlist.singlylinkedlist;

/**
 * Traverse linked list using two pointers. 
 * Move one pointer by one and other pointer by two. 
 * When the fast pointer reaches end slow pointer will reach middle of the linked list.
 * */
public class PrintMiddleOfLinkList {
	Node head;
	
	private void getMiddleOfList() {
		Node slow = head,fast=head;
		if(head==null)
			return;
		while(fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		System.out.println(slow.data);
		
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
		PrintMiddleOfLinkList list = new PrintMiddleOfLinkList();
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

		System.out.println("value");
		list.getMiddleOfList();

	}
}
