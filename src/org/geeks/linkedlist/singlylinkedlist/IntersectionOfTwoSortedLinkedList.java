package org.geeks.linkedlist.singlylinkedlist;

public class IntersectionOfTwoSortedLinkedList {


	private Node getIntersectionUsingDummyNode(Node a, Node b) {
		if(a==null || b==null)
			return null;
		Node list=null;
		while(a!=null && b!=null) {
			if(a.data==b.data) {
				list = pushNew(list, a.data);
				a = a.next;
				b = b.next;
			}else if(a.data<b.data)
				a= a.next;
			else
				b= b.next;
		}
		return list;
	}
	
	Node list = null;
	private Node getIntersectionListReursion(Node a,Node b) {
		
		if(a==null || b==null)
			return list;
		if(a.data == b.data) {
			list = pushNew(list, a.data);
			getIntersectionListReursion(a.next, b.next);
			
		}
		else if(a.data<b.data) {
			getIntersectionListReursion(a.next, b);
		}else
			getIntersectionListReursion(a, b.next);
		return list;
	}


	private void printlist(Node head) {
		Node n = head;
		while(n!=null) {
			System.out.print(n.data+" ");
			n = n.next;
		}
		System.out.println();
	}

	private Node pushNew(Node head,int data) {
		Node newNode = null;
		if(head==null) {
			newNode = new Node(data);
			head = newNode;
			return head;
		}
		Node temp = head;
		while(temp.next!=null) {
			temp = temp.next;
		}
		newNode = new Node(data);
		temp.next = newNode;
		return head;
	}


	public static void main(String[] args) {
		IntersectionOfTwoSortedLinkedList object = new IntersectionOfTwoSortedLinkedList();
		Node list1 = null;
		list1=object.pushNew(list1,1);
		list1=object.pushNew(list1,3);
		list1=object.pushNew(list1,4);
		list1=object.pushNew(list1,5);
		list1=object.pushNew(list1,6);
		list1=object.pushNew(list1,7);
		list1=object.pushNew(list1,9);

		Node list2 = null;
		list2=object.pushNew(list2,1);
		list2=object.pushNew(list2,2);
		list2=object.pushNew(list2,3);
		list2=object.pushNew(list2,7);
		list2=object.pushNew(list2,9);
		System.out.println("list1");
		object.printlist(list1);
		System.out.println("list2");
		object.printlist(list2);
		System.out.println("result 1");
		Node res = object.getIntersectionUsingDummyNode(list1,list2);
		object.printlist(res);
		
		System.out.println("result 2");
		Node res2 = object.getIntersectionListReursion(list1, list2);
		object.printlist(res2);


	}

}
