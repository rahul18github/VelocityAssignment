package com.velocity.assignment5;

//.write a program to check whether year is leap year or not. (If else stmt
public class LeapYear {

	public static void main(String[] args) {
	
		
		int year = 2000;

	    // Implementing our algorithm.
	    if (year % 400 == 0) {
	      System.out.println(year + " is a leap year.");
	    } 
	    else if (year % 100 == 0) {
	      System.out.println(year + " is not a leap year.");
	    } 
	    else if (year % 4 == 0) {
	      System.out.println(year + " is a leap year.");
	    } 
	    else {
	      System.out.println(year + " is not a leap year.");
	    }
	    
	  }
		
}
	 

