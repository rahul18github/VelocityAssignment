package com.velocity.assignment5;

import java.util.Scanner;

//write a program to check the number is positive or negative.

public class PositiveNegative {
	
	
	public static void main(String[] args) {
		
		System.out.println("enter the number");
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		
		if(num>=0){
			System.out.println("number is positive ");
		}else{
			System.out.println("number is negative ");
		}
	}

}
