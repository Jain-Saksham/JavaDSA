package com.maths;

public class ResetIthBit {

	public static void main(String[] args) {
		int a=10; //1010
		int i=4;
		System.out.println(resetIthBit(a,i)); //0010
	}

	private static int resetIthBit(int a, int i) {
		// TODO Auto-generated method stub
		return a&(~(1<<(i-1)));
	}

}
