package com.velocity.assignment4;

//1. Write the java program to design method for addition of two number which returns int results to that
//method and result should be print into main method.

public class Addition {

	
	public int add(int a,int b){
		return a+b;
	}
	
	public static void main(String[] args) {
		
		Addition addition=new Addition();
		
		int result=addition.add(4, 5);
		
		System.out.println("addition of two nuumber is :"+result );
		
		
	}
}
