package org.geeks.linkedlist.singlylinkedlist;

public class LinkListlenIterativ {
	Node head;
	
	private int getLength(Node temp) {
		int len = 0;
		if(temp==null)
			return len;
		
		while(temp!=null) {
			len++;
			temp = temp.next;
		}
		return len;
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
		LinkListlenIterativ list = new LinkListlenIterativ();
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
		System.out.println("length of list = "+ list.getLength(list.head));
	}

}
