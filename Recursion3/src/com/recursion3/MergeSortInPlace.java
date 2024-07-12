package com.recursion3;

import java.util.Arrays;

public class MergeSortInPlace {

	public static void main(String[] args) {
		int[] nums= {8,3,4,12,5,6};
		mergeSortInPlace(nums,0,nums.length);
		System.out.println(Arrays.toString(nums));
		
	}
	
	private static void mergeSortInPlace(int[] nums,int start, int end) {
		if(end-start==1)
			return ;
		int mid=start+(end-start)/2;
		mergeSortInPlace(nums, 0, mid);
		mergeSortInPlace(nums, mid, end);
		
		mergeInPlace(nums,start,mid,end);
	}

	static void mergeInPlace(int[] nums, int start, int mid, int end) {
		int[] merged_array = new int[end-start];
		int i=start;
		int j=mid;
		int k=0;
		while(i<mid&&j<end)
		{
			if(nums[i]<nums[j])
				merged_array[k++]=nums[i++];
			else
				merged_array[k++]=nums[j++];
		}
		while(i<mid)
			merged_array[k++]=nums[i++];
		while(j<end)
			merged_array[k++]=nums[j++];
		
		for(int l=0;l<merged_array.length;l++)
		{
			nums[start+l]=merged_array[l];
		}
	}

}

