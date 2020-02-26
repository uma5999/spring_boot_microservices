package com.cc.important;

import java.security.SecureRandom;

public class Otp {
	public static void main(String[] args) {

		Hello1 h = new Hello1();
		System.out.println(h.getOtp(4));

		SecureRandom number = new SecureRandom();
		System.out.println(number.nextInt(7));

	}
}

class Hello1 {
	public StringBuilder getOtp(int size) {
		// int size = 4;
		StringBuilder sb = new StringBuilder();
		SecureRandom number = new SecureRandom();// SecureRandom.getInstance("SHA1PRNG");

		for (int i = 0; i < size; i++) {
			sb.append(number.nextInt(9));
		}
		return sb;
	}
}