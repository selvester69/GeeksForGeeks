package org.geeks.linkedlist.singlylinkedlist;

public class RecursivePrintReverse {
	
	private void printReverselist(Node temp) {
		if(temp==null)
			return;
		printReverselist(temp.next);
		System.out.print(temp.data+" ");
		
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
		RecursivePrintReverse object = new RecursivePrintReverse();
		Node list1 = null;
		list1=object.push(list1,9);
		list1=object.push(list1,7);
		list1=object.push(list1,5);
		list1=object.push(list1,3);
		list1=object.push(list1,1);

		System.out.println("original list1");
		object.printlist(list1);
		System.out.println("recursive reverse");
		object.printReverselist(list1);

		
		
	}

}
