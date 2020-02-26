package com.cc.test;

public class PatternsProg {

	public static void main(String[] args) {

		String str = "cccogknitttt";
		System.out.println("--");
		char ch[] = str.toCharArray();
		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count++;
				}
			}
//			count = 0;

			if (count > 1) {
				System.out.println(ch[i] + "is repeated'" + count + "'times");
			}
		}

	}

}
