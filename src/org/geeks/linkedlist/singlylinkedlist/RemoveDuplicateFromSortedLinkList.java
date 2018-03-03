package org.geeks.linkedlist.singlylinkedlist;

public class RemoveDuplicateFromSortedLinkList {
	Node head;
	
	private void removeDupilcateElements(Node temp) {
		head = temp;
		if(temp==null)
			return;
		while(temp!=null && temp.next!=null) {
			if(temp.data==temp.next.data) {
				temp.next = temp.next.next;
			}
			else {
				temp = temp.next;
			}
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
		
		RemoveDuplicateFromSortedLinkList object = new RemoveDuplicateFromSortedLinkList();
		
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
		object.removeDupilcateElements(list1);
		System.out.println("list after duplicate");
		object.printlist(object.head);
	}
	
}
