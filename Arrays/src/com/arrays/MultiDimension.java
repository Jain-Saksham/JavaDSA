package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {

	public static void main(String[] args) {
		/*
		 * 1 2 3
		 * 4 5 6
		 * 7 8 9
		 */
//		int[][] arr=new int[3][];
		int[][] arr=new int[3][3];
//		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
//		int[][] arr= {{1,2,3},{4,5},{7,8,9,10}};
		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++)
		{
//			for(int j=0;j<arr[0].length;j++)
//			{
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
			System.out.println(Arrays.toString(arr[i]));
		}
		
	}
}


