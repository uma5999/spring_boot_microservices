package com.cc.test;

import com.cc.interfaces.Foo;

public class MyFunctional {
	public static void main(String[] args) {

		Hello3 h = new Hello3();
		h.m1();
	}
}

class Hello3 implements Foo {

	{

		sum(10, 20);
	}

	public void m1() {
		System.out.println("m1 method");
	}

	public void print() {

	}

}