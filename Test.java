package com.demo.Serialize;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class Demo implements java.io.Serializable
	{
		public int a;
		public String b;
		
		public Demo(int a,String b) {
			
			this.a=a;
			this.b=b;
		}
		
	}

public class Test {
	
	public static void main(String [] args) throws IOException {
		
	   Demo object = new Demo(1,"geekforgeek");
	   String fileName="D:\\aurelia-project\\demo-project\\file.ser";
	   
	   FileOutputStream file=new FileOutputStream(fileName);
	   ObjectOutputStream out=new ObjectOutputStream(file);
	   out.writeObject(object);
	   
	   file.close();
	   out.close();
	   
	   System.out.println("Object has been serialized");
		
	}
	
}
