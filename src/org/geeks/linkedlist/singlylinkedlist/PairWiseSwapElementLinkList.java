package org.geeks.linkedlist.singlylinkedlist;

public class PairWiseSwapElementLinkList {

	Node head;
	
	private void pairWiseSwapIterative(Node current) {
		if(current==null)
			return;
		while(current!=null && current.next!=null) {
			int temp = current.data;
			current.data = current.next.data;
			current.next.data = temp;
			current = current.next.next;
		}
	}
	
	private void pairWiseSwapRecursive(Node current) {
		if(current==null)
			return;
		if(current!=null && current.next!=null) {
			int temp = current.data;
			current.data = current.next.data;
			current.next.data = temp;
			System.out.println(current.data+" "+current.next.data);
			pairWiseSwapRecursive(current.next.next);
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
		PairWiseSwapElementLinkList object = new PairWiseSwapElementLinkList();

		Node list1 = null;
		list1=object.push(list1,9);
		list1=object.push(list1,7);
		list1=object.push(list1,5);
		list1=object.push(list1,3);
		list1=object.push(list1,1);

		System.out.println("original list1");
		object.printlist(list1);
		object.head = list1;
		object.pairWiseSwapIterative(list1);
		System.out.println("list after pair swap iterative");
		object.printlist(list1);
		object.pairWiseSwapRecursive(object.head);
		System.out.println("list after pair swap recursive");
		object.printlist(object.head);
	}
	
}
