package com.dynamicProgramming.example;

public class RodCutting3 {
	
	public static int rodCutting(int price[], int n) {
		
		if(n==0) {
			return 0;
		}
		
		int max_val=Integer.MIN_VALUE;
		
		for(int i=0;i<n;i++) {
			
			max_val=Math.max(max_val, price[i]+rodCutting(price,n-i-1));
			
		}
		
		return max_val;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
