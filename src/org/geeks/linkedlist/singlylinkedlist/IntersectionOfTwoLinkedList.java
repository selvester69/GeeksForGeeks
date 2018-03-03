package org.geeks.linkedlist.singlylinkedlist;

import java.util.HashSet;

public class IntersectionOfTwoLinkedList {
	Node head;
	
	/**
	 * -----------------------------------Method 1---------------------------------
	 * */
	private void intersectionUsing2LoopsMethod1(Node temp1,Node temp2) {
		boolean match = false;
		if(temp1==null || temp2==null)
			return;
		outer:		while(temp1!=null && temp1.next!=null) {
			while(temp2!=null && temp2.next!=null) {
				if(temp1.next==temp2|| temp1.next==temp2.next) {
					match = true;
					System.out.println("match found data="+temp1.data+" ref"+temp1.next);
					break outer;
				}
				temp2 = temp2.next;
			}
			temp1 = temp1.next;
		}
		if(!match) {
			System.out.println("match not found");
		}
	}
/**
 *----------------------------Method 2-----------------------------------------------------
 * */	
	class ModNode extends Node{
		boolean visited;
		public ModNode(int data) {
			super(data);
		}
		public boolean isVisited() {
			return visited;
		}
		public void setVisited(boolean visited) {
			this.visited = visited;
		}
	}

	private void InsertionUsingVisitedNodeMethod2(ModNode head1, ModNode head2) {
		boolean match = false;
		if(head1==null || head2==null)
			return;
		while(head1!=null) {
			head1.setVisited(true);
			head1 = (ModNode) head1.next;
		}
		while(head2!=null) {
			if(head2.isVisited()) {
				match = true;
				System.out.println("match found data="+head2.data+" ref"+head2.next);
				break;
			}else {
				head2 = (ModNode) head2.next;
			}
		}
		if(!match)
			System.out.println("No Match found");
	}
	
	private void populateListForMethod2() {
		ModNode list1 = null;
		list1=(ModNode) push(list1,9);
		list1=(ModNode) push(list1,7);
		list1=(ModNode) push(list1,5);
		list1=(ModNode) push(list1,3);
		list1=(ModNode) push(list1,1);
		
		ModNode list2 = null;
		list2=(ModNode) push(list2,1);
		list2=(ModNode) push(list2,8);
		list2=(ModNode) push(list2,6);
		list2=(ModNode) push(list2,4);
		list2=(ModNode) push(list2,2);
		
		list2.next = list1;
		
		InsertionUsingVisitedNodeMethod2(list1,list2);
	}
/**
 *-------------------------Method 3-----------------------------------------------------------
 * */
	
	private int getNodeCount(Node temp) {
		int count = 0;
		if(temp ==null)
			return count;
		while(temp!=null) {
			count++;
			temp = temp.next;
		}
		return count;
	}
	
	private int getNodeMethod3(Node temp1,Node temp2) {
		int c1 = getNodeCount(temp1);
		int c2 = getNodeCount(temp2);
		int d=0;
		if(c1>c2) {
			d = c1-c2;
			return getIntersectingNode(d,temp1,temp2);
		}else {
			d=c2-c1;
			return getIntersectingNode(d,temp2,temp1);
		}
	}
	
	
	private int getIntersectingNode(int d,Node temp1,Node temp2) {
		Node current1 = temp1;
		Node current2 = temp2;
		//below for loop equals both the nodes
		for(int i=0;i<d;i++) {
			if(current1==null)
				return -1;
			current1 = current1.next;
		}
		while(current1!=null && current2!=null) {
			if(current1.data==current2.data) {
				return current1.data;
			}
			current1 = current1.next;
			current2 = current2.next;
		}
		
		return -1;
	}
	
	/**
	 * --------------------------------------Method 4 using hash------------------------------
	 * */
	
	private void intersectionUsingHash(Node temp1,Node temp2) {
		HashSet<Object> hashing = new HashSet<Object>();
		if(temp1==null || temp2==null) {
			System.out.println("One list is null so no intersection");
			return;
		}
		while(temp1!=null) {
			hashing.add(temp1);
			temp1 = temp1.next;
		}
		while(temp2!=null) {
			if(hashing.contains(temp2)) {
				System.out.println("node found : node= "+temp2+" data= "+temp2.data);
				break;
			}
			temp2 = temp2.next;
		}
	}
	

/**
 * --------------------------Util methods----------------------------------------------------
 * */
	private void printlist(Node head) {
		Node n = head;
		while(n!=null) {
			System.out.print(n.data+" ");
			n = n.next;
		}
		System.out.println();
	}

	private Node push(Node h,int data) {
		Node newNode = new ModNode(data);
		newNode.next = h;
		h = newNode;
		return h;
	}

	public static void main(String[] args) {
		IntersectionOfTwoLinkedList object = new IntersectionOfTwoLinkedList();

		Node list1 = null;
		list1=object.push(list1,9);
		list1=object.push(list1,7);
		list1=object.push(list1,5);
		list1=object.push(list1,3);
		list1=object.push(list1,1);

		Node list2 = null;
		list2=object.push(list2,1);
		list2=object.push(list2,8);
		list2=object.push(list2,6);
		list2=object.push(list2,4);
		list2=object.push(list2,2);

		list2.next = list1;


		System.out.println("list1");
		object.printlist(list1);
		System.out.println("-----------------------------");
		System.out.println("list2");
		object.printlist(list2);

		System.out.println("-----------------------------");
		System.out.println("result");
		/*System.out.println("Method1 output");
		object.intersectionUsing2LoopsMethod1(list1, list2);
		
		System.out.println("Method2 output");
		object.populateListForMethod2();
		
		System.out.println("Method3 output");
		System.out.println(object.getNodeMethod3(list1, list2));*/
		
		System.out.println("Method4 output");
		object.intersectionUsingHash(list1, list2);
		
	}
}
