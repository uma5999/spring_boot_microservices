package com.cc.important;

public class Fibonacci {

	public static void main(String[] args) {

		MyHello Hello = new MyHello();
		Hello.m1();

	}
}

class MyHello {

	void m1() {
		int a = 0;
		int b = 1;
		System.out.println(a);
		System.out.println(b);
		for (int i = 0; i <= 5; i++) {
			int c = a + b;
			a = b;
			b = c;
			c = a + b;
			System.out.println(c);
		}

	}
}