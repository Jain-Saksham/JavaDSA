package com.patterns;

public class Patterns {

	public static void main(String[] args) {
		int n=4;
//		pattern1(n);
//		pattern2(n);
//		pattern3(n);
//		pattern4(n);
//		pattern5(n);
		pattern28(n);
	}

	private static void pattern28(int n) {
		
		
	}

	private static void pattern5(int n) {
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print('*');
			}
			System.out.println();
		}
		for(int i=1;i<=n-1;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print('*');
			}
			System.out.println();
		}
		
	}

	private static void pattern4(int n) {
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

	private static void pattern3(int n) {
		for(int i=0;i<n;i++)
		{
			for(int j=n-i;j>0;j--)
			{
				System.out.print('*');
			}
			System.out.println();
		}
		
	}

	private static void pattern2(int n) {
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print('*');
			}
			System.out.println();
		}
		
	}

	private static void pattern1(int n) {
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print('*');
			}
			System.out.println();
		}
		
	}

}
