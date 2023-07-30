package com.array;

public class LargestNumber {

	public static void main(String[] args) {
		
		
		int[] arr={23,34,56,78,45};
		int max=arr[0];
		
		
		for(int i=0;i<arr.length;i++){
			  if(max>arr[i]){
				  max=arr[i];
				  
			  }
			
			
		}
		
		System.out.println(max);
		
		
	}
	
	
}
