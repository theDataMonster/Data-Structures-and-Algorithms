package com;

import java.util.HashMap;

//Program to print an array with sum as the given sum

public class SubarrayWithTheGivenSum {
	
	public static void subArraySum(int[] arr,int n, int sum) {
		
		int curr_sum = 0;
		int start =0;
		int end= -1;
		
		HashMap<Integer,Integer> hashMap=new HashMap<>();
		
		for(int i=0;i< n;i++) {
			
			curr_sum+=arr[i];
			
			if(curr_sum-sum==0) {
				
				start=0;
				end=i;
				break;
			}
			
			if(hashMap.containsKey(curr_sum-sum)) {
				
				start=hashMap.get(curr_sum-sum)+1;
				end=i;
				break;
			}
			hashMap.put(curr_sum, i);
			
		}
		
		if(end==-1)
			System.out.println("Does not exist");
		else
			System.out.println("Sum found between "+start+" to "+end);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {10,2,-2,-20,10};
		
		int n=arr.length;
		
		int sum=-10;
		
		subArraySum(arr,n,sum);

	}

}
