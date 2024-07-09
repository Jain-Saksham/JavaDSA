package com.maths;

public class NoOfDigits {

	public static void main(String[] args) {
		int n=10; //1010
		int base=2;
		System.out.println(noOfDigits(n,base));
	}

	private static int noOfDigits(int n, int base) {
		return (int)(Math.log(n)/Math.log(base))+1;
	}

}
