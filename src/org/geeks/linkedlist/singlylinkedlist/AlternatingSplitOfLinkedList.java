package org.geeks.linkedlist.singlylinkedlist;

public class AlternatingSplitOfLinkedList {
	
	Node headA;
	Node headB;
	
	
	private void splitLinkedListAlternatively(Node head) {
		Node curr = head;
		if(curr == null || curr.next==null)
			return;
		headA = curr;
		headB = curr.next;
		while(curr!=null && curr.next!=null) {
			Node t = curr.next;
			curr.next = t.next;
			if(curr.next!=null && curr.next.next!=null) {
				t.next = curr.next.next;
			}else {
				t.next = null;
				return;
			}
			curr = curr.next;
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
		AlternatingSplitOfLinkedList object = new AlternatingSplitOfLinkedList();
		
		Node list1 = null;
		list1=object.push(list1,9);
		list1=object.push(list1,7);
		list1=object.push(list1,6);
		list1=object.push(list1,5);
		list1=object.push(list1,4);
		list1=object.push(list1,3);
		list1=object.push(list1,1);
		System.out.println("original list1");
		object.printlist(list1);
		object.splitLinkedListAlternatively(list1);
		object.printlist(object.headA);
		object.printlist(object.headB);

	}

}
