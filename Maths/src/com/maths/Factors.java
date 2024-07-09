package com.maths;

public class Factors {

	public static void main(String[] args) {
		int n=36;
		printFactors(n);
	}

	private static void printFactors(int n) {
		for(int i=1;i<=Math.sqrt(n);i++) {
			if(n%i==0)
			{
				if(n/i==i)
					System.out.println(i);
				else
					System.out.println(i+" "+n/i);
			}
		}
		
	}

}
