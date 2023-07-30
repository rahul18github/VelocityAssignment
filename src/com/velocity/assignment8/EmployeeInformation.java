package com.velocity.assignment8;

import java.util.Scanner;

/*Design the class as EmployeeInformation which takes the input for multiple employees from user and
Design method public void getUserInput(),*/

public class EmployeeInformation {
	
	
	public void getUserInput(){
		
		Employee employee=new Employee();
		
	
		System.out.println("enter first name");
		Scanner sc=new Scanner(System.in);
		employee.firstName=sc.nextLine();
		
		System.out.println("enter last name");
		employee.lastName=sc.nextLine();

		System.out.println("enter city");
		employee.city=sc.nextLine();

		System.out.println("enter mobile number");
		employee.mobileNumber=sc.nextLong();

	   
		//the input to getEmployeeInformation() metho
		
		
		getEmployeeInformation(employee.firstName,employee.lastName,employee.city,employee.mobileNumber,employee.country);
		
	}

	private void getEmployeeInformation(String firstName,String lastName,String city,long mobilenumber,String country) {
		// TODO Auto-generated method stub
		
		System.out.println("Student Information :");
		System.out.println("First name :"+firstName);
		System.out.println("Last name :"+lastName);
		System.out.println("City :"+city);
		System.out.println("Mbile number :"+mobilenumber);
		System.out.println("Country :"+country);
		
	}
	
	public static void main(String[] args) {
		
		EmployeeInformation employee=new EmployeeInformation();
		
		System.out.println("enter the number of Student");
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		
		for(int i=1;i<num;i++){
			
			System.out.println("enter Student Details");
			employee.getUserInput();
		}
		
		
		
		//employee.getUserInput();
		
		
		
		
		
		
	}
	

}
