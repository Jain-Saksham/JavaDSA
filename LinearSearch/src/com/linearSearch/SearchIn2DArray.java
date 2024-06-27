package com.linearSearch;

import java.util.Arrays;

public class SearchIn2DArray {

	public static void main(String[] args) {
		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		int target=5;
		
		//System.out.println("IsPresent "+linearSearch(arr,target));
		
		System.out.println(Arrays.toString(linearSearch1(arr,target)));
		
		
		
	}
	
	private static int[] linearSearch1(int[][] arr, int target) {
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(arr[i][j]==target)
				{
					return new int[] {i,j};
				}
			}
		}
		return new int[] {-1,-1};
	}

	private static boolean linearSearch(int[][] arr, int target) {
		for(int ar[]:arr)
		{
			for(int a:ar)
			{
				if(a==target)
					return true;
			}
		}
		return false;
	}

}
