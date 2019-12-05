package com;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		int arr[]= {1,5,3,100,10,9,2,26,20,12};
		
		bubbleSort(arr);
		
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		
		
		
	}
	
	static void bubbleSort(int arr[])
	{
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			temp=0;
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}

}
