package com.cc.important;

import java.util.StringTokenizer;

public class MyStringTokenizer {
	public static void main(String[] args) {

		String str = "cogknit semantics pvt ltd";

		StringTokenizer tokenizer = new StringTokenizer(str);
		while(tokenizer.hasMoreTokens()) {
			System.out.println(tokenizer.nextToken());
			
		}

	}
}
