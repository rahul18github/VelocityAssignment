package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class GenericString {
	
	
	public ArrayList<String> getarrayList(){
		
		ArrayList<String>list=new ArrayList<String>();
		
		list.add("shdab");
		list.add("sameer");
		
		
		return list;
	}
	
	
	public static void main(String[] args) {
		
		/*ArrayList<String>list=new ArrayList<String>();
		
		list.add("rahul");
		list.add("twinkle");
		list.add("samir");
		
		for(String s:list){
			
			System.out.println(s);
		}
		
		System.out.println(list.size());
		System.out.println(list.contains("rahul"));
		
		Collections.sort(list);
		
		System.out.println(list);*/
		
		GenericString gen=new GenericString();
		
	        ArrayList<String> arrayList = gen.getarrayList();
	        
	        for(String s:arrayList){
	        	
	        	System.out.println(s);
	        }
		
		
	}

}
