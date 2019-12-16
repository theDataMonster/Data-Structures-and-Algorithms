package com.Arrays.tests;

import java.util.HashSet;

public class SumPairSearch {
	
	public static void printPairs(int arr[],int sum) {
		
		HashSet<Integer> s=new HashSet<Integer>();
		int temp;
		
		for(int i=0;i< arr.length; i++) {
			
			temp=sum-arr[i];
			if(s.contains(temp)) {
				
				System.out.println(temp+","+arr[i]);
			}
			s.add(arr[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,4,45,6,10,8};
		int n=16;
		printPairs(arr, n);

	}

}
