package com.recursion1;

public class Factorial {

	public static void main(String[] args) {
		int n=5;
		System.out.println(fact(n));

	}

	private static int fact(int n) {
		if(n<2)
			return n;
		return n*fact(n-1);
	}

}
