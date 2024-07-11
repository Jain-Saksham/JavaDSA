package com.recursion3;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] nums= {5,1,4,3,2};
		bubble(nums,0,nums.length-1);
		System.out.println(Arrays.toString(nums));

	}

	private static void bubble(int[] nums, int i, int j) {
		if(j==0)
			return ;
		if(i<j)
		{
			if(nums[i]>nums[i+1])
			{
				int t=nums[i+1];
				nums[i+1]=nums[i];
				nums[i]=t;
			}
			bubble(nums,i+1,j);
		}
		else
		{
			bubble(nums,0,j-1);
		}
		
	}

}
