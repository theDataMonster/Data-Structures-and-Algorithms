package com.dynamicProgramming.example;

public class LongestCommonSubsequenceDP {
	
	static int lcs(char[] x,char[] y, int m, int n)
	{
		int val[][]=new int[m+1][n+1];
		
		for(int i=0;i<=m; i++)
		{
			for(int j=0; j<=n; j++)
			{
				if(i==0 || j==0)
				{
					val[i][j]=0;
				}
				else if(x[i-1]==y[j-1])
				{
					val[i][j]=val[i-1][j-1]+1;
				}
				else
				{
					val[i][j]=Math.max(val[i-1][j], val[i][j-1]);
				}
			}
		}
		return val[m][n];
	}
	
	public static void main(String[] args) {
		
		String s1="AGGTAB";
		String s2="GXTXAYB";
		
		char[] x=s1.toCharArray();
		char[] y=s2.toCharArray();
		int m=x.length;
		int n=y.length;
		
		System.out.println("LCS result="+lcs(x,y,m,n));
		
	}

}
