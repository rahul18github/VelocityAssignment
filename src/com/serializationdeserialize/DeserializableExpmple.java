package com.serializationdeserialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class DeserializableExpmple {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream file=new FileInputStream("C:\\Users\\RAHUL\\Documents\\serialiazation.txt");
	    ObjectInputStream objectInputStream=new ObjectInputStream(file);
	    
	    Object obj1=objectInputStream.readObject();
	    Object obj2=objectInputStream.readObject();
	    Object obj3=objectInputStream.readObject();
	    
	          Employee emp1=(Employee)obj1;
	          Employee emp2=(Employee)obj2;
	          Employee emp3=(Employee)obj3;
	          
	          System.out.println(emp1);
	          System.out.println(emp2);
	          System.out.println(emp3);
		
	}
	
}
