package com.str;

public class StringDemo {
	
public static void main(String[] args) {
		
		String s1 = "velocity";
		String s2 = new String("velocity");
		//s2=s1;
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	
	/*String str = "velocity";
	String s="velocity";
	System.out.println(str==s);
	System.out.println(str.length());
	System.out.println(str.charAt(4));
	System.out.println(str.compareTo("velocity"));
	System.out.println(str.concat("pune"));
	System.out.println(str);
	System.out.println(str.hashCode());
	System.out.println(str.toLowerCase());
	System.out.println(str.toUpperCase());*/
	
	
	/*String originalStr = "Hello";
	String reversedStr = "";
	int count=0;

	for (int i = 0; i < originalStr.length(); i++) {
		for (int j = i+1; j < originalStr.length(); j++){
			   if(originalStr.charAt(i)==originalStr.charAt(j)){
				   count++;
				     System.out.println(originalStr.charAt(j)+"="+count);
			   }
			
		}
	 
	}*/

	
	
	

	}


}
