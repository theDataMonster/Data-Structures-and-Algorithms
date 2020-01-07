package com.Arrays.tests;

public class RotationTimeCOn {
	
	static void leftRotate(int arr[], int n, int k) {
		
		int mod=k%n;
		
		for(int i=0;i < n; i++) {
			
			System.out.print(arr[(i+mod)%n]+" ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,4,5,6};
		
		int k;
		
		k=2;
		leftRotate(arr,arr.length,k);
		System.out.println();
		
		k=3;
		leftRotate(arr, arr.length, k);
		System.out.println();
		
		k=9;
		leftRotate(arr, arr.length, k);
		
		

	}

}
