package com.maths;

public class SetIthBit {

	public static void main(String[] args) {
		int a=10; //1010
		int i=3;
		System.out.println(setIthBit(a,i)); //1110
	}

	private static int setIthBit(int a, int i) {
		return a^(1<<(i-1));
	}

}
