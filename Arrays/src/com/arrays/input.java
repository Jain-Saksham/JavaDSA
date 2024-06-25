package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class input {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
//		arr[0]=0;
//		arr[1]=1;
//		arr[2]=2;
//		arr[3]=3;
//		arr[4]=4;
//		System.out.println(arr[1]);
//		for(int i=0;i<arr.length;i++)
//		{
//			arr[i]=sc.nextInt();
//		}
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.println(arr[i]);
//		}
//		for(int num:arr)
//		{
//			System.out.print(num+" ");
//		}
//		System.out.println(Arrays.toString(arr));
//		
		String[] str=new String[4];
		for(int i=0;i<str.length;i++)
		{
			str[i]=sc.next();
		}
		System.out.println(Arrays.toString(str));
		
		str[1]="zzz";
		System.out.println(Arrays.toString(str));
		
	}

}
