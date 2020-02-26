package com.cc.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SingletionByClonning {
	public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
		new Thread().sleep(0);

		Hello4 s1;
		Hello4 s2;

		Hello4 h1 = Hello4.getHelloIns();
		FileOutputStream fileOut = new FileOutputStream("/home/interview/Desktop/uma/singleton.ser");
		ObjectOutputStream out = new ObjectOutputStream(fileOut);
		out.writeObject(h1);
		out.close();
		fileOut.close();
		System.out.println("Serialized data is saved");

		System.out.println("//////////////////////////////");
		FileInputStream fileIn1 = new FileInputStream("/home/interview/Desktop/uma/singleton.ser");
		FileInputStream fileIn2 = new FileInputStream("/home/interview/Desktop/uma/singleton.ser");
		ObjectInputStream in1 = new ObjectInputStream(fileIn1);
		ObjectInputStream in2 = new ObjectInputStream(fileIn2);
		s1 = (Hello4) in1.readObject();
		s2 = (Hello4) in2.readObject();
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1 == s2);
		in1.close();
		in2.close();
		fileIn1.close();
		fileIn2.close();
	}
}

class Hello4 implements Serializable {

	private static Hello4 helloIns;

	private Hello4() {
	}

	static {
		helloIns = new Hello4();
	}

	synchronized public static Hello4 getHelloIns() {
		return helloIns;
	}

	public Object readResolve() {
		return getHelloIns();
	}
}
