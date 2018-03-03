package org.geeks.linkedlist.singlylinkedlist;

public class CountRotationsInSortedRotatedLinkList {
	Node head;
	
	private static int countRotationsInList(Node list) {
		int count = 0;
		if(list==null)
			return 0;
		int min = list.data;
		while(list!=null) {
			if(min>list.data)
				break;
			count++;
			list = list.next;
		}
		return count;
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
		CountRotationsInSortedRotatedLinkList list = new CountRotationsInSortedRotatedLinkList();
		list.push(3);
		list.push(2);
		list.push(1);
		list.push(10);
		list.push(9);
		list.push(8);
		list.push(7);
		list.push(6);
		list.push(4);

		System.out.println("list");
		list.printlist();
		int key = 5;
		Node temp = list.head;
		int count = countRotationsInList(temp);
		System.out.println("number of rotations = "+count);
	}
}
