package org.geeks.linkedlist.singlylinkedlist;

public class ReverseLinkList {
	Node head;
	
	private void iterativeReverse() {
		Node curr=head,prev=null,next=null;
		if(curr==null)
			return;
		while(curr!=null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
	}
	
	private Node recursiveReverse(Node node) {
		if(node==null ||node.next==null)
			return node;
		Node newNode = recursiveReverse(node.next);
		node.next.next = node;
		node.next = null;
		return newNode;
	}
	
	private Node tailRecursiveMethod(Node curr,Node prev) {
		if(curr.next==null) {
			head=curr;
			curr.next = prev;
			return null;
		}
		Node next = curr.next;
		curr.next = prev;
		tailRecursiveMethod(next,curr);
		return head;
	}
	
	
	
	private void printlist() {
		Node n = head;
		if(n==null)
			System.out.println("empty");
		while(n!=null) {
			System.out.print(n.data+"--> ");
			n = n.next;
		}
		System.out.println("null");
	}

	private void push(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	public static void main(String[] args) {
		ReverseLinkList list = new ReverseLinkList();
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
		
		list.iterativeReverse();
		System.out.println("iterative reverse list");
		list.printlist();
		
		list.head = list.recursiveReverse(list.head);
		System.out.println("recursive reverse list");
		list.printlist();
		
		list.head = list.tailRecursiveMethod(list.head, null);
		System.out.println("tail recursive reverse list");
		list.printlist();
		
	}

}
