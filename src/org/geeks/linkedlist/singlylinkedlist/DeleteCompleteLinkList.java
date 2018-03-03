package org.geeks.linkedlist.singlylinkedlist;

public class DeleteCompleteLinkList {
	Node head;
	
	private void deleteLinkedList() {
		if(head ==null)
			return ;
		
		if(head!=null)
			head = null;
		
	}
	
	private void printlist() {
		Node n = head;
		if (n==null)
			System.out.println("null");
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
		DeleteCompleteLinkList list = new DeleteCompleteLinkList();
		list.push(8);
		list.push(7);
		list.push(6);
		list.push(5);
		list.push(4);
		list.push(3);
		list.push(2);
		list.push(1);

		System.out.println(" before deleting list");
		list.printlist();
		
		list.deleteLinkedList();
		System.out.println("after deleting list");
		list.printlist();
		
	}

}
