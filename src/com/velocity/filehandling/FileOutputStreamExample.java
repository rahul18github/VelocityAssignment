package com.velocity.filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutputStreamExample {
	
	public static void main(String[] args) {
		
		
		try {
			FileOutputStream fileOutputStream=new FileOutputStream("C:\\Users\\RAHUL\\Documents\\filehandle.txt");
			fileOutputStream.write(95);
			String name="learnung java";
			byte[] code=name.getBytes();
			fileOutputStream.write(code);
			fileOutputStream.close();
			System.out.println("done");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
