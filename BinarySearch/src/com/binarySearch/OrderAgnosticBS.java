package com.binarySearch;

public class OrderAgnosticBS {

	public static void main(String[] args) {
		int[] arr1= {1,2,3,4,5,6};
		int[] arr2= {9,8,7,6,5,4,3,2,1};
		int target=2;
		
		System.out.println("Target's index: "+ orderAgnosticBS(arr2, target));
	}
	
	static int orderAgnosticBS(int[] arr, int target)
	{
		int start=0;
		int end=arr.length-1;
		boolean isAsc=arr[start]<arr[end];
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			if(arr[mid]==target)
				return mid;
			if(isAsc)
			{
				if(arr[mid]<target)
					start=mid+1;
				else
					end=mid-1;
			}
			else 
			{
				if(arr[mid]>target)
					start=mid+1;
				else
					end=mid-1;
			}
		}
		return -1;
	}

}
