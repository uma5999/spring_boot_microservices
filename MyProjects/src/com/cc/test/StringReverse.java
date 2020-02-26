package com.cc.test;

public class StringReverse {

	public static void main(String[] args) {

		String str = "india";

		char ch[] = str.toCharArray();
		int size = ch.length;
		System.out.println("Size is-->" + size);

		for (int i = size - 1; i >= 0; i--) {
			System.out.println(ch[i]);
		}

	}

}
