package com.velocity.assignment5;

import java.util.Scanner;

//Write a program to check whether number is even or odd.
public class EvenorOdd {

	public static void main(String[] args) {
		
		System.out.println("enter the number ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		if(num%2==0){
			System.out.println("number is Even ");
		}else{
			System.out.println("number is Odd ");
		}
		
	}
}
