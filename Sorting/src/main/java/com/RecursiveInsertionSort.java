package com;

import java.util.Arrays;

public class RecursiveInsertionSort {
	
	//The elements are returned in a reverse order, the elements are sorted in forward manner, i.e the first elements present are sorted first.
	//Calling the recursive function first and then doing the necessary operations is an elegant way to do so.
	
	public static void main(String[] args) {
		
		int arr[]={1,5,3,100,10,9,2,26,20,12};
		
		sort(arr,arr.length);
		
		Arrays.stream(arr).forEach(System.out::println);
		
	}
	
	static void sort(int arr[],int n)
	{
		
		if(n==1)
		{
			return;
		}
		else if(n==2)
		{
			int t=0;
			if(arr[0]>arr[1])
			{
				t=arr[0];
				arr[0]=arr[1];
				arr[1]=t;
			}
		}
		else if(n==3)
		{
			int key=arr[n-1];
			int t=0;
			
			if((key>=arr[n-2])&&(key>=arr[n-3]))
			{
				return;
			}
			else if((key<=arr[n-2])&&(key>=arr[n-3]))
			{
				t=arr[n-2];
				arr[n-2]=arr[n-1];
				arr[n-1]=t;
			}
			else
			{
				int key2=arr[n-3];
				arr[n-3]=arr[n-2];
				arr[n-2]=arr[n-1];
				arr[n-1]=key2;
				
			}
			
		}
		else
		{
			sort(arr,n-1);
		}
		
		
	}

}
