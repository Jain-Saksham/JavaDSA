package com.maths;

public class OddOrEven {

	public static void main(String[] args) {
		int a=5,b=6;
		System.out.println(isOdd(a));
	}

	private static boolean isOdd(int a) {
//		return (a|1)!=a;
		return (a&1)==1;
	}

}
