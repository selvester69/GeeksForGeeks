package org.geeks.linkedlist.singlylinkedlist;

public class DeleteAlternateNodeLinkList {
	Node head;	
	/*private void deleteAlternateNode() {
		if(head==null)
			return;
		Node prev = head;
		Node now = head.next;
		while(prev!=null && now!=null) {
			prev.next = now.next;
			now = null;
			prev = prev.next;
			if(prev.next!=null)
				now = prev.next;
		}
	}*/
	
	private void deleteNodeRecursive(Node head) {
		if(head==null)
			return;
		Node next = head.next;
		if(next==null)
			return;
		head.next = next.next;
		deleteNodeRecursive(head.next);
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
		DeleteAlternateNodeLinkList object = new DeleteAlternateNodeLinkList();
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
		object.head = list1;
		object.deleteNodeRecursive(object.head);
		object.printlist(object.head);

	}

}
