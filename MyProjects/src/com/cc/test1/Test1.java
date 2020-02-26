package com.cc.test1;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test1 {
	public static void main(String[] args) {

		Hello5 h1 = new Hello5();
		h1.m2();

	}
}

class Hello5 {
	void m1() {
		int b = 1 / 0;
		System.out.println(b);
	}

	void m2() {
		System.out.println("i am m2 from Hello5");
		try {
			throw new StudentNotFoundException("student not found");
		} catch (Exception e) {
			System.out.println("Exception from m2-Hello5");
		}
	}

	void m3() {
		try {
			FileReader file = new FileReader("somefile.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}

class StudentNotFoundException extends RuntimeException {

	String name;

	public StudentNotFoundException(String name) {
		super();
		this.name = name;
	}
}