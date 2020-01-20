package com;

import java.util.HashMap;

//Longest subarray sum divisible by K
public class LongestSubarraySumByK {
	
	static int longSubarraySumDivByK(int arr[], int n, int k) {
		
		HashMap<Integer, Integer> um=new HashMap<Integer, Integer>();
		
		int mod_arr[]=new int[n];
		int max=0;
		int curr_sum=0;
		
		for(int i=0;i< n; i++) {
			
			curr_sum+=arr[i];
			
			mod_arr[i]=((curr_sum% k) + k) % k;
			
		}
		
		for(int i=0; i< n; i++) {
			
			if(mod_arr[i] ==0) {
				
				max=i+1;
			}
			
			else if(um.containsKey(mod_arr[i]) == false)
				um.put(mod_arr[i], i);
			else
				if(max<(i - um.get(mod_arr[i])))
					max=i-um.get(mod_arr[i]);
		}
		
		
		return max;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {2,7,6,1,4,5};
		int k=3;
		
		System.out.println("Length= "+ longSubarraySumDivByK(arr, arr.length, k));

	}

}
