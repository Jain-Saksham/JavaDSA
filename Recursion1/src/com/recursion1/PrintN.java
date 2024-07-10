package com.recursion1;

public class PrintN {

	public static void main(String[] args) {
		int n=5;
//		printNto1(n);
//		print1toN(n);
		printNto1toN(n);

	}

	private static void printNto1toN(int n) {
		if(n==0)
			return ;
		System.out.println(n);
		printNto1toN(n-1);
		System.out.println(n);
		
	}

	private static void print1toN(int n) {
		if(n==0)
			return ;
		print1toN(n-1);
		System.out.println(n);
		
	}

	private static void printNto1(int n) {
		if(n==0)
			return ;
		System.out.println(n);
		printNto1(--n);
	}

}
