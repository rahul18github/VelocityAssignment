package com.velocity.assignment7;

import java.util.Scanner;

//Design method to print factors of given number( Enter no = 6 then factors should be displayed like
//1,2,3,6.
public class Factor {

	
	public static void main(String[] args) {
		
		System.out.println("enter tyhe number"); 
        Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		int i=1;
		
		/*while(i<=num){
			
			if(num%i==0){
				System.err.println(i);
			}
			
			i++;
		}*/
		
		for(i=1;num>=i;i++){
			
			if(num%i==0){
				System.err.println(i);
			}
			
		}
		
		
		
	}
	
}
