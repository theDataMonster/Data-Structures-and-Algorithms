package com;

import java.util.HashMap;

//Length of longest increasing subsequence whose adjacent elements differ by 1
public class LongestIncreasingSubsequence {

	public static void longestSubsequence(int[] a, int n) {
		
		HashMap<Integer,Integer> mp=new HashMap<>();
		
		int dp[]=new int[n];
		
		int maximum=Integer.MIN_VALUE;
		
		int index=-1;
		
		for(int i=0;i<n;i++) {
			
			if(mp.get(a[i]-1)!=null)
			{
				int lastIndex=mp.get(a[i]-1)-1;
				
				dp[i]=1+dp[lastIndex];
				
			}
			else
				dp[i]=1;
			mp.put(a[i],i+1);
			
			if(maximum< dp[i])
			{
				maximum=dp[i];
				index=i;
			}
				
		}
		
		for(int curr=a[index]-maximum+1; curr<=a[index]; curr++)
			System.out.print(curr+ " ");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {3, 10, 3, 11, 4, 5, 6, 7, 8, 12};
		
		longestSubsequence(a,a.length);

	}

}
