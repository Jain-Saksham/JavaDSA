package com.recursion1;

public class SumDigits {

	public static void main(String[] args) {
		int n=1234;
		int sum=0;
		System.out.println(sumDigits(n));

	}

	private static int sumDigits(int n) {
		if(n==0)
			return 0;
		return n%10+sumDigits(n/10);
	}

}
