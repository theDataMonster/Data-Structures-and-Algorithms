package com;

import java.util.Arrays;

public class QuickSort {
	
	int partition(int arr[],int low,int high)
	{
		int pivot=arr[high];
		int i=low-1;
		
		for(int j=low;j<high;j++)
		{
			if(arr[j]<pivot)
			{
				i++;
				
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		
		int temp=arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=temp;
		
		return i+1;
		
	}
	void sort(int arr[],int low,int high)
	{
		if(low<high)
		{
			int pi=partition(arr,low,high);
			
			sort(arr,low,pi-1);
			sort(arr,pi+1,high);
		}
	}
	
	public static void main(String[] args) {
		
		int arr[]={1,5,3,100,10,9,2,26,20,12};
		
		QuickSort ob=new QuickSort();
		ob.sort(arr, 0, arr.length-1);
		
		Arrays.stream(arr).forEach(System.out::println);
	}

}
