package org.geeks.linkedlist.singlylinkedlist;

public class PalindromeSinglyLinkList {
	Node head,slow,fast,secondHalf;

	private boolean isPanlindromeUsingMiddleList(Node temp) {
		slow=temp;
		fast=temp;
		Node slowPrev=temp,middle=null;

		boolean result = true;//initialize
		if(temp!=null && temp.next!=null) {

			while(fast!=null && fast.next!=null) {
				fast = fast.next.next;
				slowPrev = slow;
				slow = slow.next;
			}
			if (fast!=null) {
				middle=slow;
				slow = slow.next;
			}
			secondHalf = slow;
			slowPrev.next = null;
			reverse();
			result = compareList(head,secondHalf);
			reverse();
			if(middle!=null) {
				slowPrev = middle;
				middle.next = secondHalf;
			}
			else
				slowPrev = secondHalf;
		}
		return result;
	}

	private void reverse() 
	{
		Node prev = null;
		Node current = secondHalf;
		Node next;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		secondHalf = prev;
	}
	
	private boolean compareList(Node head1, Node head2) {
		Node temp1 = head1;
		Node temp2 = head2;
		while(temp1!=null && temp2!=null) {
			if(temp1.data == temp2.data) {
				temp1 = temp1.next;
				temp2 = temp2.next;
			}
			else
				return false;
		}
		if(temp1==null && temp2==null)
			return true;
		
		return false;
	}

	private boolean isPalindromeUsingRecursion(Node temp) {
		if(temp==null)
			return true;
		boolean result = isPalindromeUsingRecursion(temp.next);
		if(temp.data==head.data && result) {
			head = head.next;
			return true;
		}
		else 
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
		PalindromeSinglyLinkList list = new PalindromeSinglyLinkList();
		list.push(1);
		list.push(2);
		list.push(3);
		list.push(4);
		list.push(3);
		list.push(2);
		list.push(1);
		System.out.println("list");
		list.printlist();
		/*boolean result = list.isPalindromeUsingRecursion(list.head);
		System.out.println("list is palindrome "+result);*/
		
		 boolean result = list.isPanlindromeUsingMiddleList(list.head);
		 System.out.println("list is palindrome "+result);
	}

}
