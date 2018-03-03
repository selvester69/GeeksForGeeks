package org.geeks.linkedlist.singlylinkedlist;

public class PairWiseSwapNodeLinkedList {
	Node head;
	
	/*private Node pairWiseSwapIterative(Node node) {
		if(node==null || node.next==null)
			return null;
		Node prev = node;
		System.out.println("prev = "+prev.data);
		Node curr = node.next;
		System.out.println("curr = "+curr.data);
		node = curr;
		System.out.println("node = "+node.data);
		while(true) {
			System.out.println("while start--------");
			Node next = curr.next;
			System.out.println("next = "+next.data);
			curr.next = prev;
			System.out.println("curr.next = "+curr.next.data+"-->prev");
			//condition for last node
			if(next== null || next.next == null) {
				prev.next = next;
				System.out.println("prev.next = "+prev.next.data+" -->next");
				break;
			}
			
			System.out.println("prev.next = "+prev.next.data+"-->next.next = "+next.next.data);
			prev.next = next.next;
			System.out.println("prev.next = "+prev.next.data);
			prev = next;
			System.out.println("prev = "+prev.data);
			curr = prev.next;
			System.out.println("curr = "+curr.data);
			System.out.println("while ends");
		}
		return node;
	}*/

	private Node pairWiseSwapRecursive(Node node) {
		if(node==null || node.next==null)
			return node;
		Node remaining = node.next.next;
		Node newNode = node.next;
		node.next.next = node;
		node.next = pairWiseSwapRecursive(remaining);
		return newNode;
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
		PairWiseSwapNodeLinkedList object = new PairWiseSwapNodeLinkedList();
		Node list1 = null;
		list1=object.push(list1,9);
		list1=object.push(list1,7);
		list1=object.push(list1,5);
		list1=object.push(list1,3);
		list1=object.push(list1,1);
		
		System.out.println("original list1");
		object.printlist(list1);
		object.head = list1;
		/*Node res = object.pairWiseSwapIterative(list1);
		System.out.println("list after pair swap iterative");
		object.printlist(res);*/
		
		Node res = object.pairWiseSwapRecursive(object.head);
		System.out.println("list after pair swap recursive");
		object.printlist(res);
	}
}
