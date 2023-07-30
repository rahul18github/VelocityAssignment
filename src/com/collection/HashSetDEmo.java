package com.collection;

import java.util.HashSet;

public class HashSetDEmo {

	
	public static void main(String[] args) {
		
		HashSet<Integer>set=new HashSet<Integer>();
		
		
		set.add(10);
		set.add(10);
		set.add(10);
		set.add(10);
		set.add(null);
		set.add(null);
		
		System.out.println(set);
		
		
	}
	
}
