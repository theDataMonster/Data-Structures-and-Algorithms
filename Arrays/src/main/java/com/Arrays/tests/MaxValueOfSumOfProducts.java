package com.Arrays.tests;

public class MaxValueOfSumOfProducts {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {10,1,2,3,4,5,6,7,8,9};
		int currVal=0;
		int maxVal;
		int arrSum=0;
		
		for(int i=0;i<arr.length;i++) {
			
			arrSum=arrSum+arr[i];
			currVal=currVal+(i*arr[i]);
			
		}
		
		maxVal=currVal;
		
		for(int i=0; i< arr.length; i++) {
			
			currVal=currVal+arrSum-arr[arr.length-i-1]*arr.length;
			System.out.println(currVal);
			
			if(currVal>maxVal)
				maxVal=currVal;
		}
		
		System.out.println("MaxVal="+maxVal);

	}

}
