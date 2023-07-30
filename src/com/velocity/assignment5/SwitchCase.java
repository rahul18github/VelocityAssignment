package com.velocity.assignment5;

import java.util.Scanner;

//Write a program to print month of year
public class SwitchCase {
	
	public static void main(String[] args) {
		System.out.println("enter month number");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		
		switch (number) {
		case 1:
			System.out.println("month is : january");
			break;
		case 2:
			System.out.println("month is : feb");
			break;
		case 3:
			System.out.println("month is : march");
			break;
		case 4:
			System.out.println("month is : april");
			break;
		case 5:
			System.out.println("month is : may");
			break;
		case 6:
			System.out.println("month is : jun");
			break;
		case 7:
			System.out.println("month is : july");
			break;

		default:
			System.out.println("enter valid number");
			
		}
		
		
	}
	
}
