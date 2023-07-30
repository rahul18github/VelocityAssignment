package com.serializationdeserialize;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializableExample {
	
	public static void main(String[] args) throws IOException {
		
		Employee emp1=new Employee(101, "nagpur", "engneering");
		Employee emp2=new Employee(102, "Akola", "It");
		Employee emp3=new Employee(103, "nagpur", "Admin");
		
		
		FileOutputStream file=new FileOutputStream("C:\\Users\\RAHUL\\Documents\\serialiazation.txt");
		ObjectOutputStream objectOutputStream=new ObjectOutputStream(file);
		
		objectOutputStream.writeObject(emp1);
		objectOutputStream.writeObject(emp2);
		objectOutputStream.writeObject(emp3);
		
		objectOutputStream.flush();
		objectOutputStream.close();
		
		System.out.println("done");
		
		
	}

}
