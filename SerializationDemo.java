package com.serializationDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable{
	/**
	 * default generated serialVersionUID
	 */
	private static final long serialVersionUID = -6461729065350447458L;
	int a=1;
	int b=2;
	final int c=3;
	static int d=4;
	transient int e=5;
	transient final int f=6;
	transient static int g=7;
}

public class SerializationDemo {

	public static void main(String[] args) throws Exception {

		Dog d1=new Dog();
		
		//Serializing the DOg Class
		FileOutputStream fos=new FileOutputStream("abc.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d1);
		
		//Deserializing the Dog Class from the file
		FileInputStream fis = new FileInputStream("abc.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dog d2=(Dog) ois.readObject();
		
		System.out.println(d2.a+"\n"+d2.b+"\n"+d2.c+"\n"+d2.d+"\n"+d2.e+"\n"+d2.f+"\n"+d2.g);
		
		
	}

}
