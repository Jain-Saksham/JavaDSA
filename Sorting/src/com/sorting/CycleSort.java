package com.sorting;

import java.util.Arrays;

// when given numbers from 1 to n -- Use Cyclic Sort
public class CycleSort {

	public static void main(String[] args) {
		int nums[]= {3,5,2,1,4};
		cycleSort(nums);
	}
	
	private static void swap(int[] nums, int i, int idx) {
		int t=nums[idx];
		nums[idx]=nums[i];
		nums[i]=t;
	}

	private static void cycleSort(int[] nums) {
		int n=nums.length;
		for(int i=0;i<n-1;i++)
		{
			while(nums[i]!=i+1)
			{
				swap(nums,i,nums[i]-1);
			}
		}
		printArray(nums);
	}

	private static void printArray(int[] nums) {
		System.out.println(Arrays.toString(nums));
		
	}
}
