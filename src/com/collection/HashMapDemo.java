package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer, String>map=new HashMap<>();
		
		map.put(1, "It");
		map.put(2, "Admin");
		map.put(3, "Department");
		
		//for each loop
		/*Set<Integer> key = map.keySet();
		for(Integer i:key){
			System.out.println("key :"+i);
			System.out.println("value :"+map.get(i));
			
		}*/
		
		//for iterator
		Set<Integer> key = map.keySet();
		System.out.println(key);
		
		
		Iterator<Integer> itr = key.iterator();
		//System.out.println(itr);
		
		while(itr.hasNext()){
			Integer next = itr.next();
			System.out.println("key :"+next);
			System.out.println("value :"+map.get(next));
		}
		
	}
	
}
