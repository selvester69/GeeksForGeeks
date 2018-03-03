package org.geeks.linkedlist.singlylinkedlist;

public class IdenticalLinkedList {
	
	private boolean checkIdenticalLinkedListIterative(Node list1, Node list2) {
		if(list1==null || list2==null) 
			return false;
		while(list1!=null && list2!=null) {
			if(list1.data!=list2.data){
				return false;
			}else {
				list1 = list1.next;
				list2 = list2.next;
			}
		}
		return true;
	}
	
	private boolean checkIdenticalLinkedListRecursive(Node list1, Node list2) {
		if(list1==null && list2==null)
			return true;
		if(list1!=null && list2!=null) {
			return list1.data==list2.data && checkIdenticalLinkedListRecursive(list1.next,list2.next);
		}
		
		return false;
	}
	
	private Node push(Node h,int data) {
		Node newNode = new Node(data);
		newNode.next = h;
		h = newNode;
		return h;
	}
	
	public static void main(String[] args) {
		IdenticalLinkedList object = new IdenticalLinkedList();
		
		Node list1 = null;
		list1=object.push(list1,9);
		list1=object.push(list1,7);
		list1=object.push(list1,6);
		list1=object.push(list1,5);
		list1=object.push(list1,4);
		list1=object.push(list1,3);
		list1=object.push(list1,1);
		
		Node list2 = null;
		list2=object.push(list2,9);
		list2=object.push(list2,7);
		list2=object.push(list2,6);
		list2=object.push(list2,5);
		list2=object.push(list2,4);
		list2=object.push(list2,3);
		list2=object.push(list2,1);
		
		System.out.println("lists are identical "+object.checkIdenticalLinkedListIterative(list1, list2));
		System.out.println("lists are identical "+object.checkIdenticalLinkedListRecursive(list1, list2));
	}

}
