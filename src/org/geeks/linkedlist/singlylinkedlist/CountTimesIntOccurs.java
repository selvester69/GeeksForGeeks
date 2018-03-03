package org.geeks.linkedlist.singlylinkedlist;

public class CountTimesIntOccurs {
	Node head;
	
	private int countWithoutrecursion(int key) {
		int count=0;
		Node temp = head;
		if(temp==null)
			return 0;
		
		while(temp!=null) {
			if(temp.data==key)
				count++;
			temp = temp.next;
		}
		return count;
	}
	
	
	private int countWithRecursion(Node temp,int key) {
		if(temp==null)
			return 0;
		if(temp.data!=key)
			return countWithRecursion(temp.next, key);
		
		else
			return 1+countWithRecursion(temp.next, key);
		
	}
	
	int freq=0;
	private int countWithRecursion2(Node temp,int key) {
		if(temp==null)
			return freq;
		if(temp.data==key)
			freq++;
		countWithRecursion2(temp.next, key);
		return freq;
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
		CountTimesIntOccurs list = new CountTimesIntOccurs();
		list.push(8);
		list.push(5);
		list.push(7);
		list.push(5);
		list.push(6);
		list.push(5);
		list.push(4);
		list.push(3);
		list.push(5);
		list.push(2);
		list.push(5);
		list.push(1);
		list.push(5);

		System.out.println("list");
		list.printlist();
		int key = 5;
		System.out.println("iteration method");
		System.out.println("count of key ["+key+"] is "+list.countWithoutrecursion(key));
		
		System.out.println("recursion method 1");
		System.out.println("count of key ["+key+"] is "+list.countWithRecursion(list.head,key));
		
		System.out.println("recursion method 2");
		System.out.println("count of key ["+key+"] is "+list.countWithRecursion2(list.head,key));
	}

}
