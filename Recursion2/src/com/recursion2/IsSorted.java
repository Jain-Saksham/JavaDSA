package com.recursion2;

public class IsSorted {

	public static void main(String[] args) {
		int[] nums= {1,2,3,4,6};
		System.out.println(isSorted(nums,1));

	}

	private static boolean isSorted(int[] nums, int i) {
		if(i>nums.length-1)
			return true;
		if(nums[i]>=nums[i-1])
			return isSorted(nums, i+1);
		else
			return false;
	}

}
