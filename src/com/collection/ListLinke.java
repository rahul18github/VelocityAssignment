package com.collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListLinke {

	public static void main(String[] args) {
		
		LinkedList<Integer>list=new LinkedList<Integer>();
		
		list.add(10);
		list.add(34);
		list.add(89);
		list.addFirst(1);
		list.addLast(56);
		list.removeLast();
		
		/*for(Integer linked:list){
			System.out.println(linked);
		}
		*/
		
		ListIterator<Integer> listIterator = list.listIterator();
		
		/*while(listIterator.hasNext()){
			System.out.println(listIterator.next());
		}*/
		
		while(listIterator.hasPrevious()){
			System.out.println(listIterator.previous());
		}
		
		
	}
	
}
