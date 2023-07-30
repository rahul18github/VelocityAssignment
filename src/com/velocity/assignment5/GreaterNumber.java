package com.velocity.assignment5;

import java.util.Scanner;

//Write the program to check whether the no is greater than 100.
public class GreaterNumber {

	
	public static void main(String[] args) {
		
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		if(num>100){
			System.out.println("the number is greater than 100");
		}else if(num>=100){
			System.out.println("the number is equal to 100");
		}else{
			System.out.println("the number is less than 100");
		}
	}
}
