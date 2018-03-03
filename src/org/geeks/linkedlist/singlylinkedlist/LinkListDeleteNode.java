package org.geeks.linkedlist.singlylinkedlist;

public class LinkListDeleteNode {

	Node head;

	private void printlist() {
		Node n = head;
		while(n!=null) {
			System.out.print(n.data+" ");
			n = n.next;
		}
		System.out.println();
	}


	private void deleteNode(int key) {
		// Store head node
		Node temp = head, prev = null;

		if(temp==null) return;
		// If head node itself holds the key to be deleted
		if(temp!=null && temp.data == key) {
			head = temp.next;  // Changed head
			return;
		}
		while(temp!=null && temp.data!=key) {
			prev = temp;
			temp = temp.next;
		}
		prev.next = temp.next;
	}

	private void push(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	public static void main(String[] args) {
		
		LinkListDeleteNode list = new LinkListDeleteNode();
		list.push(8);
		list.push(7);
		list.push(6);
		list.push(5);
		list.push(4);
		list.push(3);
		list.push(2);
		list.push(1);

		System.out.println("list before deletion");
		list.printlist();
		list.deleteNode(4);
		System.out.println("list after deletion");
		list.printlist();

	}

}
