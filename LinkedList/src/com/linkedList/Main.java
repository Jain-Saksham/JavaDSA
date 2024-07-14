package com.linkedList;

public class Main {
	public static void main(String[] args) {
//		LinkedList<Integer> list=new LinkedList<>();
//		list.add(34);
		
//		LL list= new LL();
//		list.insertFirst(3);
//		list.insertFirst(4);
//		list.insertFirst(2);
//		list.insertFirst(5);
//		list.insertLast(99);
//		list.insertLast(100);
//		list.insert(50, 4);
//		list.printLL();
//		list.deleteFirst();
//		list.printLL();
//		list.deleteLast();
//		list.printLL();
//		list.delete(2);
//		list.printLL();
//		System.out.println(list.find(4));
		
//		DLL list=new DLL();
//		list.insertFirst(1);
//		list.insertFirst(2);
//		list.insertFirst(3);
//		list.insertFirst(4);
//		list.insertLast(99);
//		list.insertLast(100);
//		list.printDLL();
		
		CLL list = new CLL();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.printCLL();
		list.delete(3);
		list.printCLL();
		
	}
}
