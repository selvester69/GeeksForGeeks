package org.geeks.linkedlist.singlylinkedlist;

public class GetNthNodeOfLinkedList {

	Node head;

	private int getNthNode(int n) {

		Node temp = head;
		int pos = 0;
		if(temp==null)
			return -1;
		while(temp!=null) {
			if(pos==n) 
				return temp.data;
			pos++;
			temp = temp.next;
		}
		assert(false);
		return -1;
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
		GetNthNodeOfLinkedList list = new GetNthNodeOfLinkedList();
		list.push(8);
		list.push(7);
		list.push(6);
		list.push(5);
		list.push(8);
		list.push(7);
		list.push(4);
		list.push(3);
		list.push(8);
		list.push(7);
		list.push(2);
		list.push(1);

		System.out.println("list");
		list.printlist();

		System.out.println("value");
		System.out.println(list.getNthNode(8));

	}

}
