package com.maths;

public class FirstSetBit {

	public static void main(String[] args) {
		int n=20; //10100
		System.out.println(findFirstSetBit(n));
		
	}

	private static int findFirstSetBit(int n) {
		int count=0;
		while(n!=0)
		{
			count++;
			if((n&1)==1)
			{
				return count;
			}
			n=n>>1;
		}
		return 0;
	}

}
