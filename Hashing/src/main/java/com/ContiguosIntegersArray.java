package com;

import java.util.HashSet;
import java.util.Set;

//program to check if an array only contains consecutive integers where duplicates are allowed
public class ContiguosIntegersArray {
	
	static Boolean areElementsContiguous(int arr[], int n) {
		
		Set<Integer> us=new HashSet<>();
		
		for(int i=0; i<n; i++) {
			
			us.add(arr[i]);
		}
		
		int count=1;
		
		int curr_ele=arr[0]-1;
		
		while(us.contains(curr_ele)==true) {
			
			count++;
			
			curr_ele--;
		}
		
		curr_ele= arr[0]+1;
		
		while(us.contains(curr_ele)==true) {
			
			count++;
			
			curr_ele++;
		}
		
		return (count==us.size());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {5,2,3,6,4,4,6,6};
		
		if(areElementsContiguous(arr,arr.length))
			System.out.println("Yes");
		else
			System.out.println("No");

	}

}
