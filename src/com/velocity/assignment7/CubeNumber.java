package com.velocity.assignment7;

import java.util.Scanner;


//2. Design method public int getNumberCube(int num), return int value to that method and result should
//be into main method.

public class CubeNumber {
	
	
	
	public static void main(String[] args) {
		
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		
		int result=getCubeNumber(num);
		
		System.out.println("cube is :"+result);
		
	}

	private static int getCubeNumber(int num) {
		// TODO Auto-generated method stub
		
		int result=num*num*num;
		
		return result;
	}

}
