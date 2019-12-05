package com.searching.algorithms;

public class BinarySearch {
	
	public static void main(String[] args) {
		
		int arr[]= {1,3,4,6,7,8,9,11,20,35};
		
		int l=0;
		int r=arr.length;
		
		int mid=(l+r)/2;
		
		int k=4;
		int f=0;
		
		while(l<=r)
		{
			mid=(l+r)/2;
			
			if(arr[mid]==k)
			{
				f=1;
				break;
			}
			else if(arr[mid]<k)
			{
				l=mid+1;
			}
			else
			{
				r=mid-1;
			}
			
		}
		if(f==0)
		{
			System.out.println("Element does not exist");
		}
		else
		{
			System.out.println("Element found at "+mid);
		}
		
	}
	
	

}
