package com.Arrays.tests;

public class SearchInRotatedArray {
	
	static int searchArr(int arr[], int k, int pivot) {
		
		int pos=-1;
		
		if((k<=arr[0])&& (k>=arr[pivot]))
			pos=binarySearch(arr,pivot,arr.length-1, k);
		else
			pos=binarySearch(arr,0,pivot-1, k);
		
		return pos;
				
	}
	
	static int binarySearch(int arr[], int low, int high, int k) {
		
		int mid=-1;
		int f=0;
		 while(low<high) {
			 
			 mid=(low+high)/2;
			 
			 if(arr[mid]==k)
			 {
				 f=1;
				break;
				 
			 }
				 
			 else if(arr[mid]<k)
				 low=mid+1;
			 else if(arr[mid]>k)
				 high=mid-1;
		 }
		 
		 if(f==1)
			 return mid;
		 else
			 return -1;
	}
	
	static int findPivot(int arr[]) {
		
		int mid=arr.length/2;
		int low=0;
		int high= arr.length-1;
		
		while(low<=high) {
			
			mid=(low+high)/2;
			
			if(arr[mid]>arr[mid+1])
				return mid;
			
			if(arr[mid]<arr[mid-1])
				return mid;
			
			if(arr[low]>arr[high])
				low=mid+1;
			else
				high=mid-1;
		}
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {5,6,7,8,9,10,1,2,3};
		int pivot=findPivot(arr);
		System.out.println("Pivot= "+findPivot(arr));
		System.out.println("Position of 7 is="+ searchArr(arr,7,pivot));
		

	}

}
