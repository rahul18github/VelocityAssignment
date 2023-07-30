package com.velocity.assignment4;

public class SubtractMethod {

	public int add(int a,int b){
		return a-b;
	}
	
	public static void main(String[] args) {
		
		SubtractMethod addition=new SubtractMethod();
		int result=addition.add(6, 5);
		
		System.out.println("Subtraction of two nuumber is :"+result );
		
		
	}
	
}
