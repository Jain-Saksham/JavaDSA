package com.sorting;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		int nums[]= {5,4,3,2,1,0,-1,10,11,30,-40};
//		bubbleSort(nums); // get largest number at last index
//		selectionSort(nums); // select an element and put it at its correct index
		insertionSort(nums); // sort in chunks
	}

	private static void insertionSort(int[] nums) {
		int n=nums.length;	
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j>0;j--)
			{
				if(nums[j]<nums[j-1])
				{
					swap(nums,j,j-1);
				}
				else
				{
					break;
				}
			}
		}
		printArray(nums);
		
	}

	private static void selectionSort(int[] nums) {
		int n=nums.length;
		for(int i=0;i<n-1;i++)
		{
			int smallest=nums[i];
			int idx=i;
			for(int j=i+1;j<n;j++)
			{
				if(nums[j]<smallest)
				{
					smallest=nums[j];
					idx=j;
				}
			}
			swap(nums, i, idx);
		}
		printArray(nums);
	}

	private static void swap(int[] nums, int i, int idx) {
		int t=nums[idx];
		nums[idx]=nums[i];
		nums[i]=t;
	}

	private static void bubbleSort(int[] nums) {
		int n=nums.length;
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<n-i;j++)
			{
				if(nums[j]<nums[j-1])
				{
					swap(nums,j,j-1);
				}
			}
		}
		printArray(nums);
	}

	private static void printArray(int[] nums) {
		System.out.println(Arrays.toString(nums));
		
	}

}
