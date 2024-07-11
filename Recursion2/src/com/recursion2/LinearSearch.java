package com.recursion2;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr= {3,2,4,1,5,9,6,5};
		int target=7;
		System.out.println(search(arr,target,0));

	}

	private static boolean search(int[] arr, int target, int i) {
		if(i>arr.length-1)
			return false;
		if(arr[i]==target)
			return true;
		else
			return search(arr, target, i+1);
	}

}
