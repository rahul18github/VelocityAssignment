package com.array;

import java.util.Scanner;

public class NumberofOccurances {
	
	
	public static int count=0;
	
	 NumberofOccurances(String name){
		count++;
	}
	
	
	
	
	public static void main(String[] args) {
		
		double a=2;
		double b=6;
		
		double c=a+b;
		
		System.out.println(c);
		
		System.out.println("");
		
		String num="86";
		int lenth=num.length();
		//System.out.println(lenth);
		
		
		if(lenth!=10){
			
			System.out.println("please enter valid number");
		}else{
			
			System.out.println(num);
			
		}
		
		/*int[] array={1,2,3,4,5,6,75,5,5,5};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		//int num=5;
		int count=0;

		for(int i=0;i<array.length;i++){

		    if(array[i]==num){ 
		        count++;
		        System.out.println(count);
		     }


		}*/

		//System.out.println(count);
		
		//NumberofOccurances num=new NumberofOccurances("rahul");
		NumberofOccurances num1=new NumberofOccurances("raj");
		
		
		System.out.println(count);
		
		
		
		
	}

}
