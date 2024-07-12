package com.recursion3;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] nums= {8,3,4,12,5,6};
		int[] ans=mergeSort(nums);
		System.out.println(Arrays.toString(ans));
		
	}
	
	private static int[] mergeSort(int[] nums) {
		if(nums.length==1)
			return nums;
		int mid=nums.length/2;
		int[] left=mergeSort(Arrays.copyOfRange(nums, 0, mid));
		int[] right=mergeSort(Arrays.copyOfRange(nums, mid, nums.length));
		
		return merge(left,right);
	}

	static int[] merge(int[] a, int[] b) {
		int n=a.length,m=b.length;
		int[] merged_array=new int[n+m];
		int i=0,j=0,k=0;
		while(i<n&&j<m)
		{
			if(a[i]<b[j])
			{
				merged_array[k]=a[i];
				k++;
				i++;
			}
			else
			{
				merged_array[k]=b[j];
				k++;
				j++;
			}
		}
		while(i<n)
		{
			merged_array[k]=a[i];
			k++;
			i++;
		}
		while(j<m)
		{
			merged_array[k]=b[j];
			k++;
			j++;
		}
		return merged_array;
	}

}
