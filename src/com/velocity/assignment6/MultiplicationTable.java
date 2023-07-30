package com.velocity.assignment6;

//Design method void multiplication (int no) and print the multiplication table. ( Example enter the no=5
//then output like
//5*1=5.......5*10=50)

public class MultiplicationTable {
	
	public static void main(String[] args) {
		
		int num =5;
		for(int i=1;i<=10;i++){
			int result=num*i;
			System.out.println(num+"*"+i+"="+result);
		}
		
	}

}
