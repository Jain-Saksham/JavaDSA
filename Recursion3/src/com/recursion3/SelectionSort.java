package com.recursion3;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] nums= {5,1,4,3,2};
		int max_idx=0;
		selection(nums,0,nums.length,max_idx);
		System.out.println(Arrays.toString(nums));

	}

	private static void selection(int[] nums, int i, int j, int max_idx) {
		if(j==0)
			return ;
		if(i<j)
		{
			if(nums[i]>nums[max_idx])
				max_idx=i;
			selection(nums,i+1,j,max_idx);
		}
		else
		{
			int t=nums[max_idx];
			nums[max_idx]=nums[j-1];
			nums[j-1]=t;
			selection(nums,0,j-1,0);
		}
		
	}

}
