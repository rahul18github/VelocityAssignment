package com.velocity.assignment5;

import java.util.Scanner;

//Write the program to print the square of any number.
public class SquareNumber {
	
	public static void main(String[] args) {
		
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		int result=num*num;
		
		System.out.println(result);
	}

}
