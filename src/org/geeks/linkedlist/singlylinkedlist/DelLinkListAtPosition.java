package org.geeks.linkedlist.singlylinkedlist;

public class DelLinkListAtPosition {

	Node head;

	private void deleteNode(int position) {
		Node temp = head;
		if(head == null) return;

		if (position == 0) {
			head = temp.next;   // Change head
			return;
		}
		//Find previous node of the node to be deleted
		for (int i=0; temp!=null && i<position-1; i++)
			temp = temp.next;

		//If position is more than number of nodes
		if(temp==null || temp.next==null)
			return;

		Node next = temp.next.next;
		temp.next = next;
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
		DelLinkListAtPosition list = new DelLinkListAtPosition();
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

		list.deleteNode(7);
		System.out.println("list after deletion at 7");
		list.printlist();
		
		list.deleteNode(6);
		System.out.println("list after deletion at 6");
		list.printlist();
		
		list.deleteNode(5);
		System.out.println("list after deletion at 5");
		list.printlist();
		
		list.deleteNode(4);
		System.out.println("list after deletion at 4");
		list.printlist();
		
		list.deleteNode(3);
		System.out.println("list after deletion at 3");
		list.printlist();
		
		list.deleteNode(2);
		System.out.println("list after deletion at 2");
		list.printlist();
		
		list.deleteNode(1);
		System.out.println("list after deletion at 1");
		list.printlist();

	}

}
