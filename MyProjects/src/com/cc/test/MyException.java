package com.cc.test;

public class MyException {
	public static void main(String[] args) {

		boolean status = false;
		try {
//			try {
//
//				int a = 1 / 0;
//			} catch (Exception e) {
//				System.out.println("inside catch block");
//			}

			int a = 2 / 1;
			status = true;
		} catch (Exception e) {
			System.out.println("inside outer####");
		}
		System.out.println("hello world");
		System.out.println(status);

	}
}

@SuppressWarnings("serial")
class CogException extends RuntimeException {
	public CogException(String s) {
		super(s);
	}
}
