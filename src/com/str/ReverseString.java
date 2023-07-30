package com.str;

public class ReverseString {

	public static void main(String[] args) {
		
		
		String str="Java";
		String revrsestr="";
		
		//char[]ch=str.charAt();
		
		for(int i=0;i<str.length();i++){
			revrsestr=str.charAt(i)+revrsestr;
		}
		
		System.out.println(revrsestr);
		System.out.println(str.charAt(2));
		System.out.println(str.compareTo("Java"));
		System.out.println(str);
		str.concat("language");
		System.out.println(str);
		
		StringBuffer str1=new StringBuffer("java");
		str1.append("language");
		System.out.println(str1);
		
		
		
		
		
		
		
	}

}
