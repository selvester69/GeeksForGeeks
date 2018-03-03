package org.geeks.linkedlist.singlylinkedlist;

public class GetNthNodeFromBackLinkList {
	Node head;

	private void getNthNodeFromLastUsingLength(int n) {
		int len=0;
		Node temp = head;
		while(temp!=null) {
			temp = temp.next;
			len++;
		}
		if(len<n)
			return;
		temp = head;
		for(int i=1;i<len-n+1;i++)
			temp = temp.next;
		System.out.println(temp.data);
	}
	
	static int i = 0;
	private void printNthFromLast(Node temp,int n) 	{
	    if (temp == null)
	       return;
	    printNthFromLast(temp.next, n);
	    if (++i == n)
	       System.out.print(temp.data);
	}

	private void getNthNodeFromLastUsingTwoPointer(int n) {
		Node main = head,ref = head;
		int count=0;
		if(head!=null) {
			while(count<n) {
				if(ref==null) {
					System.out.println(n+" is greater than number");
					return ;
				}
				ref = ref.next;
				count++;
			}
			while(ref!=null) {
				ref = ref.next;
				main = main.next;
			}
			System.out.println( main.data);
		}
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
		GetNthNodeFromBackLinkList list = new GetNthNodeFromBackLinkList();
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

		System.out.println("nth node from last using length");
		list.getNthNodeFromLastUsingLength(6);

		System.out.println("nth node from last using 2 pointer");
		list.getNthNodeFromLastUsingTwoPointer(6);
		
		System.out.println("nth node from last using recursion");
		list.printNthFromLast(list.head,6);
	}
}
