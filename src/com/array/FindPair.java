package com.array;

public class FindPair {
	
	public static void main(String[] args) {
		             //0  1  2  3  4  5
		int [] array={1, 5, 7, -1, 5,7};
		int sum=6;
		int count=0;
		int len=array.length;
		
		for(int i=0;i<=array.length-1;i++){
			  for(int j=i+1;j<=array.length-1;j++){
				   if(array[i]+array[j]==sum){
					   count++;
					   System.out.println(array[i]+" "+array[j]);
				   }
				  
				  
			  }
			
		}
		
		 System.out.println(count);
	}

}
