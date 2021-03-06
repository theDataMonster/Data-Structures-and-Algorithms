package com;

import java.util.Arrays;

public class MergeSort {
	
	public static void main(String[] args) {
		
		int arr[]={1,5,3,100,10,9,2,26,20,12};
		
		
		MergeSort ob=new MergeSort();
		ob.sort(arr, 0, arr.length-1);
		
		Arrays.stream(arr).forEach(System.out::println);
	}
	
	void merge(int arr[], int l,int m, int r)
	{
		int n1=m-l+1;
		int n2= r-m;
		
		int L[]=new int[n1];
		int R[]=new int[n2];
		
		for(int i=0;i<n1;i++)
		{
			L[i]=arr[l+i];
		}
		
		for(int i=0;i<n2;i++)
		{
			R[i]=arr[m+1+i];
		}
		
		int i=0,j=0;
		
		int key=l;
		while((i<n1)&&(j<n2))
		{
			if(L[i]<=R[j])
			{
				arr[key]=L[i];
				i++;
			}
			else
			{
				arr[key]=R[j];
				j++;
			}
			key++;
		}
		
		while(i<n1)
		{
			arr[key]=L[i];
			i++;
			key++;
		}
		
		while(j<n2)
		{
			arr[key]=R[j];
			j++;
			key++;
		}
	}
	
	void sort(int arr[],int l,int r)
	{
		if(l<r)
		{
			int m=(l+r)/2;
			
			sort(arr,l,m);
			sort(arr,m+1,r);
			
			merge(arr,l,m,r);
		}
	}

}
