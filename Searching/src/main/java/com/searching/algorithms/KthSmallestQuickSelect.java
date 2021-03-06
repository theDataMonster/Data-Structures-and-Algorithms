package com.searching.algorithms;

public class KthSmallestQuickSelect {
	
	public static int partition(int[] arr,int l,int r)
	{
		int x=arr[r],i=l;
		for(int j=l;j<=r-1;j++)
		{
			if(arr[j]<=x)
			{
				int t=arr[i];
				arr[i]=arr[j];
				arr[j]=t;
				
				i++;
			}
		}
		int temp=arr[i];
		arr[i]=arr[r];
		arr[r]=temp;
		
		return i;
		
	}
	
	public static int kthSmallest(int[] arr, int l, int r, int k)
	{
		if((k>0) && (k <= r-l +1))
		{
			int pos=partition(arr,l,r);
			
			if((pos-l)==k-1)
				return arr[pos];
			
			if(pos-l>k-1)
			{
				return kthSmallest(arr,l,pos-1,k);
			}
			
			return kthSmallest(arr,pos+1,r,k-1-pos+l);
		}
		
		return Integer.MAX_VALUE;
	}
	
	public static void main(String[] args) {
		int arr[]={1,5,3,100,10,9,2,26,20,12};
		int k=4;
		
		System.out.println("kth smallest="+ kthSmallest(arr,0,arr.length-1,k));
	}
	


}
