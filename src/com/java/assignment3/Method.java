package com.java.assignment3;

public class Method {
	
	
	
	public String getStudentName(String name){
	
		return name;
	}
	
	public static void main(String[] args) {
		
		//Design the separate method as String getStudentName (String name) which return student name and print it.
		
		Method method=new Method();
		
		String name=method.getStudentName("Rahul");
		
		System.out.println("Student Name :"+name);
		
		/*int num=2;
		
		for(int i=1;i<=10;i++){
			
			int result=num*i;
			
			System.out.println(result);
		}*/
            
		
	}

}
