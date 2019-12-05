package com.searching.algorithms;

public class BinarySearchRecursive {
	
	
	static int arr[]= {1,2,4,6,8};
	static int k=4;
	static int r=arr.length;
	static int l=0;
	static int BinarySearch(int l,int r)
	{
		int mid;
		
		mid=(l+r)/2;
		if(l>r)
		{
			return -1;
		}
		else
		{
			if(arr[mid]==k)
			{
				return mid;
			}
			else if(arr[mid]<k)
			{
				return BinarySearch(mid+1,r);
			}
			else
			{
				return BinarySearch(l,mid-1);
			}
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("Result="+BinarySearch(l,r));
	}
	
	

}
