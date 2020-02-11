package com.Stacks.Problems;

import java.util.Stack;

public class SpecialStack extends Stack<Integer>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;//This is different
	
	Stack<Integer> min=new Stack<>();
	
	void push(int x) {
		
		if(isEmpty()==true) {
			
			super.push(x);
			min.push(x);
		}
		else {
			
			super.push(x);
			int y=min.pop();
			min.push(y);
			if(x<=y) {
				
				min.push(x);
			}
//			else {
//				
//				min.push(y);
//			}
		}
	}
	
	public Integer pop() {
		
		int x=super.pop();
		int y=min.pop();
		
		if(y!=x)
			min.push(y);
		//min.pop();
		return x;
	}
	
	int getMin() {
		
		int x=min.pop();
		min.push(x);
		return x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SpecialStack s=new SpecialStack();
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s.getMin());
		s.push(5);
		System.out.println(s.getMin());

	}

}
