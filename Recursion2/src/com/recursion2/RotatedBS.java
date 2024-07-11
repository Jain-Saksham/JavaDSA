package com.recursion2;

public class RotatedBS {

	public static void main(String[] args) {
		int[] nums= {5,6,7,8,9,1,2,3};
		int target=2;
		System.out.println(search(nums,target,0,nums.length-1));

	}

	private static boolean search(int[] nums, int target, int start, int end) {
		if(start>end)
			return false;
		int mid=start+(end-start)/2;
		if(nums[mid]==target)
			return true;
		if(nums[start]<=nums[mid]) {
			if(target>=nums[start]&&target<=nums[mid])
				return search(nums,target,start,mid-1);
			else
				return search(nums,target,mid+1,end);
		}
		if(target>=nums[mid]&&target<=nums[end])
			return search(nums,target,mid+1,end);
		else
			return search(nums,target,start,mid-1);
			
	}

}
