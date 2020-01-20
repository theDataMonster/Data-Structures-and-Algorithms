package com;

import java.util.HashSet;

//Elements are consecutive integers
public class LongestConsecutiveSubsequence {

	static int findLongestConsecutiveSubseq(int arr[], int n) {
		
		HashSet<Integer> S=new HashSet<Integer>();
		int ans=0;
		
		for(int i=0; i<n; i++) {
			
			S.add(arr[i]);
		}
		
		for(int i=0; i<n; i++) {
			
			if(!S.contains(arr[i]-1)) {
				
				int j=arr[i];
				while(S.contains(j))
					j++;
				
				if(ans<j-arr[i])
					ans=j-arr[i];
			}
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,9,3,10,4,20,2};
		
		System.out.println("Length of longest consecutive seubseq ="+ findLongestConsecutiveSubseq(arr,arr.length));

	}

}
