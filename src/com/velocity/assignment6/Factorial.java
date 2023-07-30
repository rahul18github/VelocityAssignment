package com.velocity.assignment6;

import java.util.Scanner;

//4. Design method int fact orial(int no) which returns int value to that method. print the results into main
//method (Example enter no as 5, factorial means 5*4*3*2*1 then output is 120)

public class Factorial {
	
	public static void main(String[] args) {
		
		/*int fact=1;
		int num=5;
		
		for(int i=1;i<=num;i++){             //5=5*4*3*2*1
			fact=fact*i;
		}
		System.out.println(fact);
		
	}*/
		
		
       /* int i =1;
        int num=12;
		
		while(i<=num){                      //12=1,2,3,4,6,12
		
			if(num%i==0) {
				System.out.println(i);
				
			}
			i++;
		
		}
	*/
		
		int n,
        cubeSum = 0, num, r;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number=");
        n = sc.nextInt();
        num = n;
        while (num > 0)
        {
            r = num % 10;
            cubeSum = cubeSum + (r * r * r);
            num = num / 10;
        }
        if (n == cubeSum)
        {
            System.out.println("Armstrong Number");
        }
        else
        {
            System.out.println("Not Armstrong Number");
        }
    }

		
}
	