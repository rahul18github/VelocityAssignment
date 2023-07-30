package com.velocity.assignment5;

//write a program to find out maximum number among three number(if else if ladder statement
public class MaximumNumber {
	
	public static void main(String[] args) {
		
		int a=10;
		int b=40;
		int c=30;
		
		if(a>b && a>c){
			System.out.println(a+" is greater");
		}else if(b>c && b>a){
			System.out.println(b+" is greater");
		}else{
			System.out.println(c+" is greater");
		}
		
	}

}
