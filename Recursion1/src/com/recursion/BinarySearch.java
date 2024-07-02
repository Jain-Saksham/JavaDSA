package com.recursion;

public class BinarySearch {

	public static void main(String[] args) {
		int[] nums= {1,2,3,4,5,6,7};
		int target=9;
		System.out.println(binarySearch(nums,target,0,nums.length-1));
	}

	private static int binarySearch(int[] nums, int target, int start, int end) {
		if(start>end)
			return -1;
		int mid=start+(end-start)/2;
		if(nums[mid]==target)
			return mid;
		else if(nums[mid]<target)
			return binarySearch(nums, target, mid+1, end);
		else
			return binarySearch(nums, target, start, mid-1);
	}

}
