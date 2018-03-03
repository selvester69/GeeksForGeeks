package org.geeks.linkedlist.singlylinkedlist;

public class SearchLinkListIterRecur {
	Node head;

	private boolean searchRecursive(Node temp, int data){
		if(temp==null) {
			System.out.println("list empty");
			return false;
		}
		if(temp.data == data) {
			System.out.println("match found "+data );
			return true;
		}
		else
			return searchRecursive(temp.next, data);

	}

	private boolean searchIterative(Node temp, int data){
		if(temp==null) {
			System.out.println("list empty");
			return false;
		}
		while(temp!=null) {
			if(temp.data==data) {
				System.out.println("match found "+data );
				return true;
			}
			temp = temp.next;
			
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
		SearchLinkListIterRecur list = new SearchLinkListIterRecur();
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

		list.searchRecursive(list.head,5);
		list.searchIterative(list.head,1);


	}
}
