package com.collection;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapPractice {
	
	public static void main(String[] args) {
		
		ArrayList<String>deptlist=new ArrayList<String>();
		
		deptlist.add("teacher");
		deptlist.add("accountant");
		deptlist.add("admin");
		
		ArrayList<String>fieldlist=new ArrayList<String>();
		
		fieldlist.add("civil");
		fieldlist.add("mechanical");
		fieldlist.add("electrical");
		
		ArrayList<String>shift=new ArrayList<String>();
		
		shift.add("first shift");
		shift.add("second shift");
		shift.add("third shift");
		
		HashMap<String, ArrayList<String>>funct=new HashMap<>();
		
		funct.put("department", deptlist);
		funct.put("field", fieldlist);
		funct.put("shift", shift);
		
		
		
		
		
		
		
		
	}

}
