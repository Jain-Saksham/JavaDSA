package com.maths;

public class FindIthBit {

	public static void main(String[] args) {
		int a=5; //101 
		int i=3;
		System.out.println(findIthBit(a,i)); //0
	}

	private static int findIthBit(int a, int i) {
		return (a>>(i-1))&1;
	}

}
