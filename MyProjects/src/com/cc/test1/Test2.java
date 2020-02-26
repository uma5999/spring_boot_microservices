package com.cc.test1;

public class Test2 {
	public static void main(String[] args) {

		A a = new A();
		a.m1();
	}
}

interface Hello {

	default void m1() {
		System.out.println("i am from interface Hello m1()");
	}
}

interface Hai {
	default void m1() {
		System.out.println("i am from interface Hai m1()");
	}
}

class A implements Hello, Hai {

}