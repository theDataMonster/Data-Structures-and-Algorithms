package com.Arrays.tests;

public class MaxProductSubArray {
	
	public static int maxProductSub(int arr[], int n) {
		
		int minVal=arr[0];
		int maxVal=arr[0];
		
		int maxProduct=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			
			if(arr[i]<0) {
				
				int temp=maxVal;
				maxVal=minVal;
				minVal=temp;
			}
			
			maxVal=Math.max(arr[i],maxVal*arr[i]);
			minVal=Math.min(arr[i], minVal*arr[i]);
			
			maxProduct=Math.max(maxProduct, maxVal);
		}
		
		return maxProduct;
		
	}
	
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,-1,4,5,-2,1,100};
		
		System.out.println("MxProduct="+maxProductSub(arr,arr.length));
		
		
	}

}
