package com.maths;

public class Prime {

	public static void main(String[] args) {
		int n=36;
//		System.out.println(isPrime(n));
		int m=40;
		sieve(m);
	}
	
	
	//TC:- O(n*log(logn))
	private static void sieve(int m) {
		int[] primes=new int[m+1];
		for(int i=2;i*i<=m;i++)
		{
			if(primes[i]==0)//prime
			{
				for(int j=i*2;j<=m;j+=i)
				{
					primes[j]=1;//not prime
				}
			}
		}
		for(int i=2;i<primes.length;i++)
		{
			if(primes[i]==0)
				System.out.println(i);
		}
		
	}

	private static boolean isPrime(int n) {
		// TODO Auto-generated method stub
		if(n<=1)
			return false;
		int c=2;
		while(c*c<=n)
		{
			if(n%c==0)
				return false;
			c++;
		}
		return true;
	}

}
