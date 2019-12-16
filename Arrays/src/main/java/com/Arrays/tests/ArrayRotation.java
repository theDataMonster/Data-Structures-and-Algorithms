package com.Arrays.tests;

import java.util.Arrays;

public class ArrayRotation {
	
	//Juggling algo
	void leftRotate3(int arr[], int d, int n) {
		
		int mygcd=gcd(d,n);
		System.out.println("GCD="+mygcd);
		int temp;
		int iter=n/mygcd;
		
		for(int i=0; i< mygcd; i++) {
			
			temp=arr[i];
			
			for(int j=i; j< ((iter-1)*mygcd)+i; j=j+mygcd) {
				
				arr[j]=arr[j+mygcd];
			}
			arr[(iter-1)*mygcd+i]=temp;
		}
		
	}
	
	
	//reversing algo
	void leftRotate4(int arr[], int d, int n) {
		
		if(d==0)
			return;
		reverseArr(arr, 0, d-1);
		reverseArr(arr, d, n-1);
		reverseArr(arr, 0, n-1);
		
		
	}
	
	static void reverseArr(int arr[], int start, int end) {
		
		int temp;
		while(start<end) {
			
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			
			start++;
			end--;
		}
		
	}
	int gcd(int a, int b) {
		
		if(b==0) {
			
			return a;
		}
		else {
			
			return gcd(b, a%b);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayRotation obj=new ArrayRotation();
		int arr[]= {1,2,3,4,5,6,7,8,9,10,11,12};
		obj.leftRotate3(arr, 3, arr.length);
		
		Arrays.stream(arr).forEach(e->System.out.print(e+" "));
		
		int arr2[]={1,2,3,4,5,6,7,8,9,10,11,12};
		obj.leftRotate4(arr2, 3, arr.length);
		
		System.out.println();
		
		Arrays.stream(arr2).forEach(e->System.out.print(e+" "));
		

	}
	
	

}
