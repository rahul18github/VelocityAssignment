package com.velocity.assignment4;

public class MultiplicationMethod {

	
	public int add(int a,int b){
		return a*b;
	}
	
	public static void main(String[] args) {
		
		MultiplicationMethod mul=new MultiplicationMethod();
		
		int result=mul.add(4, 5);
		System.out.println("multiplication of two nuumber is :"+result );
		
		
	}
	
	
}
