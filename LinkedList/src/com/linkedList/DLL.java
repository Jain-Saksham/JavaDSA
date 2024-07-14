package com.linkedList;

public class DLL {
	
	Node head;
	
	public void printDLL() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.value+" -> ");
			temp=temp.next;
		}
		System.out.println("NULL");
	}
	
	public void insertFirst(int val) {
		Node node=new Node(val);
		node.next=head;
		node.prev=null;
		if(head!=null)
			head.prev=node;
		head=node;
		
	}
	
	public void insertLast(int val) {
		Node node=new Node(val);
		if(head==null)
		{
			insertFirst(val);
			return ;
		}
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=node;
		node.prev=temp;
		node.next=null;
	}
	
//	public void insert(int val, int after) {
//		Node node=new Node(val);
//		node.next=null;
//	}
	
	public class Node{
		private int value;
		private Node next;
		private Node prev;
		
		public Node(int value) {
			this.value=value;
		}
		
		public Node(int value, Node next, Node prev) {
			this.value = value;
			this.next = next;
			this.prev = prev;
		}
		
	}
}
