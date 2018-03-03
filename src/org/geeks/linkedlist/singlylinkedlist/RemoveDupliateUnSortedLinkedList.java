package org.geeks.linkedlist.singlylinkedlist;

import java.util.HashSet;

public class RemoveDupliateUnSortedLinkedList {
	Node head;
	
	private void removeDupilcateUsingHashing(Node current) {
		HashSet<Integer> hs = new HashSet<Integer>();
		Node previous = null;
		if(current==null)
			return;
		while(current!=null) {
			if(hs.contains(current.data)) {
				previous.next = current.next;
			} else {
				hs.add(current.data);
				previous = current;
			}
			current = current.next;
		}
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
		RemoveDupliateUnSortedLinkedList object = new RemoveDupliateUnSortedLinkedList();

		Node list1 = null;
		list1=object.push(list1,9);
		list1=object.push(list1,7);
		list1=object.push(list1,7);
		list1=object.push(list1,7);
		list1=object.push(list1,7);
		list1=object.push(list1,7);
		list1=object.push(list1,5);
		list1=object.push(list1,5);
		list1=object.push(list1,5);
		list1=object.push(list1,5);
		list1=object.push(list1,3);
		list1=object.push(list1,3);
		list1=object.push(list1,3);
		list1=object.push(list1,1);
		list1=object.push(list1,1);

		System.out.println("original list1");
		object.printlist(list1);
		object.removeDupilcateUsingHashing(list1);
		System.out.println("list after duplicate");
		object.printlist(list1);
	}
}
