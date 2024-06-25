package com.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<>();
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		list.add(4);
//		
//		System.out.println(list);
//		System.out.println(list.contains(1));
//		list.set(0, 99);
//		System.out.println(list);
//		list.remove(2);
//		System.out.println(list);
		
		for(int i=0;i<5;i++)
		{
			list.add(sc.nextInt());
		}
		System.out.println(list);
		System.out.println(list.get(2));
		
	}
}
