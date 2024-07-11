package com.recursion3;

public class Pattern {

	public static void main(String[] args) {
		int n=4;
//		printPattern1(n,0);
		printPattern2(n,0);
	}

	private static void printPattern2(int r, int c) {
		if(r==0)
			return ;
		if(c<r)
		{
			
			printPattern2(r,c+1);
			System.out.print('*');
		}
		else
		{
			
			printPattern2(r-1,0);
			System.out.println();
		}
		
	}

	private static void printPattern1(int r, int c) {
		if(r==0)
			return ;
		if(c<r)
		{
			System.out.print('*');
			printPattern1(r,c+1);
		}
		else
		{
			System.out.println();
			printPattern1(r-1,0);
		}
	}

}
