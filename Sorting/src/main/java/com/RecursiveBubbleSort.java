package com;

import java.util.Arrays;

public class RecursiveBubbleSort {
	
	public static void main(String[] args) {
		
		int arr[]= {1,5,3,100,10,9,2,26,20,12};
		
		bubbleSort(arr);
		
		Arrays.stream(arr).forEach(System.out::println);
		
	}
	
	static void bubbleSort(int arr[])
	{
		if(arr.length==1)
		{
			return ; 
		}
		int temp=0;
		
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]>arr[i+1])
			{
			temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
			}
		}
		int arr2[]=Arrays.copyOfRange(arr, 0, arr.length-1);
		System.out.println("Inside bubbleSort");
		
		Arrays.stream(arr2).forEach(System.out::println);
		
		bubbleSort(arr2);
	}

}
