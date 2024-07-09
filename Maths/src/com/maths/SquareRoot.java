package com.maths;

public class SquareRoot {

	public static void main(String[] args) {
		int n=40;
		int p=3;//precision
		
		System.out.printf("%.3f",sqrt(n,p));
	}

	private static double sqrt(int n, int p) {
		double root= mySqrt(n);
		double incr=0.1;
		for(int i=0;i<p;i++)
		{
			while(root*root<=n)
			{
				root+=incr;
			}
			root-=incr;
			incr/=10;
		}
		return root;
		
	}
	
	static double mySqrt(int x) {
        long start=0;
        long end=x;
        while(start<=end)
        {
            long mid=start+(end-start)/2;
            if(mid*mid==x)
                return (double)mid;
            else if(mid*mid>x)
                end=mid-1;
            else
                start=mid+1;
        }
        return (double)end;

    }

}
