package com.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapCitiesSort {

	public static void main(String[] args) {
		
		ArrayList<String>mhcities=new ArrayList<>();
		
		mhcities.add("puna");
		mhcities.add("mumbai");
		mhcities.add("nashik");
		
		ArrayList<String>krcities=new ArrayList<>();
		
		krcities.add("banglore");
		krcities.add("dharwad");
		krcities.add("hubali");
		
		ArrayList<String>mpcities=new ArrayList<>();
		
		mpcities.add("bhopal");
		mpcities.add("indore");
		mpcities.add("shivtirth");
		
		HashMap<String, ArrayList<String>>states=new HashMap<>();
		
		states.put("MH", mhcities);
		states.put("KR", krcities);
		states.put("MP", mpcities);
		
		HashMap<String, HashMap<String, ArrayList<String>>>country=new HashMap<>();
		country.put("INDIA", states);
		
		Set<String> key = country.keySet();
		Iterator<String> itr = key.iterator();
		
		while (itr.hasNext()) {
			String next = itr.next();
			
			System.out.println("country :"+next);
			HashMap<String, ArrayList<String>> hashMapstate = country.get(next);
			Set<String> statekey = hashMapstate.keySet();
			
			for(String state:statekey){
				
				System.out.println("State :"+state);
				System.out.println(hashMapstate.get(state));
				
			}
			
			
			
		}
		
		
		
		
		

	}

}
