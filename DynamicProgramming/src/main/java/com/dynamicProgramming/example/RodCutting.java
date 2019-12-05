package com.dynamicProgramming.example;

public class RodCutting {
	
	static int rodCut(int price[],int n)
	{
		if(n<=0)
		{
			return 0;
		}
		
		int max_val=Integer.MIN_VALUE;
		
		for(int i=0;i<n;i++)
		{
			max_val=Math.max(max_val, price[i]+rodCut(price,n-i-1));
		}
		
		return max_val;
	}
	
	public static void main(String[] args) {
		
		int arr[]= {1,5,8,9,10,17,17,20};
		System.out.println("Max obtainable size="+rodCut(arr,arr.length));
	}

}
