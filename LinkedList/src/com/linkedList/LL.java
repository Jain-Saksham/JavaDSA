package com.linkedList;

import java.util.LinkedList;

public class LL {
	
	private Node head;
	private Node tail;
	private int size;
	public LL() {
		this.size=0;
	}
	
	public void printLL() {
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.value+" -> ");
			temp=temp.next;
		}
		System.out.println("NULL");
	}
	
	public Node get(int idx) {
		Node node=head;
		for(int i=0;i<idx;i++)
			node=node.next;
		return node;
	}
	
	
	public void insertFirst(int val) {
		Node node=new Node(val);
		node.next=head;
		head=node;
		if(tail==null)
			tail=head;
		size+=1;
	}
	
	public void insertLast(int val) {
		if(tail==null)
		{
			insertFirst(val);
			return ;
		}
		Node node=new Node(val);
		tail.next=node;
		tail=node;
		size+=1;
	}
	
	public void insert(int val, int idx) {
		if(idx==0)
		{
			insertFirst(val);
			return ;
		}
		if(idx==size)
		{
			insertLast(val);
			return ;
		}
		Node temp=head;
		for(int i=1;i<idx;i++) {
			temp=temp.next;
		}
		Node node=new Node(val, temp.next);
		temp.next=node;
		size++;
		
		
	}
	
	public void deleteFirst() {
		int val=head.value;
		head=head.next;
		if(head==null)
			tail=null;
		size--;
	}
	
	public void deleteLast() {
		if(size<=1)
		{
			deleteFirst();
			return ;
		}
		Node secondLast=get(size-2);
		tail=secondLast;
		tail.next=null;
		
	}
	
	public void delete(int idx) {
		if(idx==0)
		{
			deleteFirst();
			return ;
		}
		if(idx==size-1)
		{
			deleteLast();
			return ;
		}
		Node prev=get(idx-1);
		prev.next=prev.next.next;
		
	}
	
	public boolean find(int value)
	{
		Node node=head;
		while(node!=null) {
			if(node.value==value)
				return true;
			node=node.next;
		}
		return false;
	}
	
	private class Node{
		private int value;
		private Node next;
		
		public Node(int value) {
			this.value=value;
		}
		public Node(int value, Node next) {
			this.value=value;
			this.next=next;
		}
	}

}
