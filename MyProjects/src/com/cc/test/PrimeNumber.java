package com.cc.test;

public class PrimeNumber {

	public static void main(String[] args) {

		int a = 7;
		System.out.println(a % 2);

		int count = 0;
		for (int i = 2; i <= a; i++) {
			if (a % i == 0)
				count++;

		}
		if (count == 1) {
			System.out.println("it is");
		} else {
			System.out.println("it is not");
		}

	}

}
