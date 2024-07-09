package com.maths;

public class RangeXor {

	public static void main(String[] args) {
		int a=5;
//		System.out.println(xor(a));
		
//		range for xor a, b = xor(b)^xor(a-1)
		int b=9;
		System.out.println(xor(b)^xor(a-1));
		
		
		
	}

	private static int xor(int a) {
		if(a%4==0)
			return a;
		if(a%4==1)
			return 1;
		if(a%4==2)
			return a+1;
		return 0;
	}

}
