package org.geeks.linkedlist.singlylinkedlist;

public class MergeTwoSortedLinkedList {
	Node head;

	private Node sortedMergeMethod1(Node node1,Node node2) {
		Node temp = null;
		if(node2==null) {
			temp = node1;
			return node1;
		}
		if(node1==null) {
			temp=node2;
			return node2;
		}
		if(node1!=null && node2!=null){
			if(node1.data<=node2.data){
				temp=node1;
				node1=temp.next;
			}
			else{
				temp=node2;
				node2=temp.next;
			}
		}
		head = temp;
		while(node1!=null && node2!=null ) {
			if(node1.data <= node2.data) {
				temp.next = node1;
				temp = node1;
				node1 = temp.next;
			}
			else if(node2.data <= node1.data) {
				temp.next = node2;
				temp = node2;
				node2 = temp.next;
			}
		}
		if(node1==null)
			temp.next = node2;
		if(node2==null)
			temp.next = node1;
		return head;
	}

	private Node sortedMergeMethod2(Node node1, Node node2) {
		if (node1==null && node2!=null)
			return node2;
		else if (node2==null && node1==null)
			return node1;
		else if (node1==null && node2==null)
			return null;
		else {
			if(node1.data< node2.data) {
				node1.next = sortedMergeMethod2(node1.next,node2);
				return node1;
			}
			else {
				node2.next = sortedMergeMethod2(node1, node2.next);
				return node2;
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
		// TODO Auto-generated method stub
		MergeTwoSortedLinkedList object = new MergeTwoSortedLinkedList();
		Node list1 = null;
		list1=object.push(list1,9);
		list1=object.push(list1,7);
		list1=object.push(list1,5);
		list1=object.push(list1,3);
		list1=object.push(list1,1);

		Node list2 = null;
		list2=object.push(list2,10);
		list2=object.push(list2,8);
		list2=object.push(list2,6);
		list2=object.push(list2,4);
		list2=object.push(list2,2);



		System.out.println("list1");
		object.printlist(list1);
		System.out.println("-----------------------------");
		System.out.println("list2");
		object.printlist(list2);

		/*	Node res = object.sortedMergeMethod1(list1, list2);

		//object.head = res;
		System.out.println("-----------------------------");
		System.out.println("result");
		object.printlist(res);*/

		Node res = object.sortedMergeMethod2(list1, list2);

		//object.head = res;
		System.out.println("-----------------------------");
		System.out.println("result");
		object.printlist(res);

	}

}
