package com.velocity.assignment7;

import java.util.Scanner;

//Design method public int getReverseNumber(int num) which return int value to that method and
//result print into main method.
public class ReverseNumber {
	
	
	private static int getreverseNumber(int num) {
		// TODO Auto-generated method stub
		int rev;
		
		for(rev=0;num>0;num=num/10){
			rev=rev*10+num%10;
			//num=num/10;
		}
		
		return rev;
	}
	
	private static int getreversebywhile(int num) {
		// TODO Auto-generated method stub
		
		int rev=0;
		
		while(num>0){
			
			rev=rev*10+num%10;
			num=num/10;       //qu
		}
		return rev;
	}
	
	public static void main(String[] args) {
		
		System.out.println("enter the Number");
		
        Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		int result=getreverseNumber(num);
		System.out.println("reverse number is:"+result);
		
		result=getreversebywhile(num);
		System.out.println("reverse number using while loop is:"+result);
		
	}

	


}
