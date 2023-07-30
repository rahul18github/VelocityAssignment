package com.velocity.assignment10;

import java.util.Scanner;

public class PrimeNo {
	
	public static void main(String[] args) {
		
		System.out.println("enter number");
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		int i;
		for(i=2;i<=num;i++){
			
			if(num%i==0){     // check whether the number is divisible by itself
			   break;
		    }
			
	}
		
	if(i==num){                 
	    System.out.println("prime");
	}else{
		 System.out.println("not Prime");
		
	}
		
		
		
	}

}
