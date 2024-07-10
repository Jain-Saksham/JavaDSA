package com.recursion1;

public class CountZeroes {

	public static void main(String[] args) {
		int n=10200;
		int count=0;
		System.out.println(countZero(n,count));

	}

	private static int countZero(int n,int count) {
		if(n==0)
			return count;
		if(n%10==0)
			count++;
		return countZero(n/10, count);
	}

}
