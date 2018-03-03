package org.geeks.linkedlist.singlylinkedlist;

import java.util.HashSet;

public class DetectLoopLinkList {
	Node head;
	
	
	private boolean detectLoopUsingHash(Node temp) {
		HashSet<Node> set = new HashSet<Node>();
		if(temp==null)
			return false;
		while(temp!=null) {
			if(set.contains(temp))
				return true;
			set.add(temp);
			temp = temp.next;
		}
		return false;
	}
	
	private boolean detectLoopUsingFloydCycle(Node temp) {
		if(temp==null)
			return false;
		Node slow = temp,fast=temp;
		while(slow!=null && fast !=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
			if(fast==slow) {
				return true;
			}
		}
		return false;
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
		DetectLoopLinkList list = new DetectLoopLinkList();
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
		
		list.head.next.next.next.next = list.head;
		System.out.println("loop is present "+list.detectLoopUsingHash(list.head));
		
		
		System.out.println("loop is present "+list.detectLoopUsingFloydCycle(list.head));
		
		
		
	}
}
