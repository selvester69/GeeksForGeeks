package org.geeks.linkedlist.singlylinkedlist;

public class SwapNodeWithoutData {
	Node head;
	
	private void swapNode(int x, int y) {
		if(x==y)
			return ;
		
		Node prevX = null,currX = head;
		while(currX != null && currX.data != x) {
			prevX = currX;
			currX = currX.next;
		}
		
		Node prevY = null,currY = head;
		while(currY != null && currY.data != y) {
			prevY = currY;
			currY = currY.next;
		}
		
		// if either x or y is null no swap 
		if(currX==null || currY ==null) {
			System.out.println("either value is not present so no swap");
			return;
		}
		
		//if x is not head of linklist
		if(prevX != null) 
			 prevX.next = currY;
		else
			head= currY;
		
		//if y is not head of linked list
		if(prevY!=null)
			prevY.next = currX;
		else
			head= currX;
		
		Node temp = currX.next;
		currX.next = currY.next;
		currY.next = temp;
		
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
		SwapNodeWithoutData list = new SwapNodeWithoutData();
		list.push(8);
		list.push(7);
		list.push(6);
		list.push(5);
		list.push(4);
		list.push(3);
		list.push(2);
		list.push(1);

		System.out.println("before swap");
		list.printlist();
		list.swapNode(1, 7);
		System.out.println("after swap");
		list.printlist();

	}

}
