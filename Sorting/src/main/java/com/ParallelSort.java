package com;

import java.util.Arrays;

public class ParallelSort {
	
	private static final int BASE_ARRAY_SIZE=10000;
	
	public static double[] generateArray(int size)
	{
		if(size<0 || size> Integer.MAX_VALUE)
		{
			return null;
		}
		
		double[] result=new double[size];
		
		for(int i=0;i<size;i++)
		{
			result[i]=Math.random();
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		for(int i=1;i<10000;i*=10)
		{
			int size=BASE_ARRAY_SIZE*i;
			
			double[] arr1=generateArray(size);
			
			double[] arr2=Arrays.copyOf(arr1, arr1.length);
			System.out.println("Array size:"+ size);
			
			long startTime=System.currentTimeMillis();
			Arrays.sort(arr1);
			long endTime=System.currentTimeMillis();
			
			System.out.println("Time taken in serial: "+(endTime-startTime)+" ms.");
			
			startTime=System.currentTimeMillis();
			Arrays.parallelSort(arr2);
			endTime=System.currentTimeMillis();
			
			System.out.println("Time taken in parallel: "+(endTime-startTime)+" ms.");
		}
		
	}

}
