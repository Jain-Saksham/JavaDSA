package com.heaps;

public class Main {

	public static void main(String[] args) throws Exception{
		Heap<Integer> heap=new Heap<>();
		
		heap.insert(34);
		heap.insert(44);
		heap.insert(6);
		heap.insert(36);
		
		System.out.println(heap.remove());
		
	}

}
