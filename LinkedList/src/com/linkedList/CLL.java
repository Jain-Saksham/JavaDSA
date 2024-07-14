package com.linkedList;

public class CLL {
	
	private Node head;
	private Node tail;
	
	public CLL(){
		this.head=null;
		this.tail=null;
	}
	
	public void printCLL() {
		Node temp=head;
		if(head!=null) {
			do {
				System.out.print(temp.value+" -> ");
				temp=temp.next;
			}while(temp!=head);
		}
		System.out.println("LOOP");
	}
	
	public void insert(int val) {
		Node node=new Node(val);
		if(head==null)
		{
			head=node;
			tail=node;
			return ;
		}
		tail.next=node;
		node.next=head;
		tail=node;
	}
	
	public void delete(int val) {
		Node node=head;
		if(head==null)
			return ;
		if(node.value==val) {
			head=head.next;
			tail.next=head;
			return ;
		}
		do {
			Node n=node.next;
			if(n.value==val) {
				node.next=n.next;
				break;
			}
			node=node.next;
		}while(node!=head);
	}
	
	private class Node{
		private int value;
		private Node next;
		
		public Node(int val) {
			this.value=val;
		}
		
		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}
		
	}
}
