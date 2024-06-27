package com.linearSearch;

public class Search1 {

	public static void main(String[] args) {
		
		int[] nums= {1,2,3,4,5,6};
		
		int target=7;
		
		System.out.println("IsPresent "+linearSearch(nums,target));
		
		
		
	}

	private static boolean linearSearch(int[] nums, int target) {
		for(int num:nums)
		{
			if(num==target)
			{
				return true;
			}
		}
		return false;
	}

}
