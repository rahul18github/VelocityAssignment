package com.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class CopyArraylist {
	
	public static void main(String[] args) {
		
		ArrayList<Integer>list=new ArrayList<Integer>();
		
		list.add(10);
		list.add(89);
		list.add(90);
		
		ArrayList<Integer>list1=new ArrayList<Integer>();
		
		list1.add(34);
		list1.add(34);
		
		list1.addAll(list);
		
		HashSet<Integer>li=new HashSet<>(list1);
		
		/*Iterator<Integer> iterator = list1.iterator();
			
		
		
		
		
		while(iterator.hasNext()){
			System.out.println(iterator.next());
			
		}*/
		
		for(Integer or:li){
		
			System.out.println(or);
		}
		
	}

}
