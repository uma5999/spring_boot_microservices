package com.cc.test;

import java.security.SecureRandom;

public class NumberReverse {
	public static void main(String[] args) {

		Hello1 h1 = new Hello1();
		String zzz = h1.createRegistrationCode(8);
		System.out.println(zzz);
	}

}

class Hello1 {
	public String createRegistrationCode(int captchaLength) {
		int length = 6;
		StringBuilder generatedToken = new StringBuilder();
		SecureRandom number = new SecureRandom();
		String saltChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		StringBuffer captchaStrBuffer = new StringBuffer();
		java.util.Random rnd = new java.util.Random();

// build a random captchaLength chars salt
		while (captchaStrBuffer.length() < length) {
			int index = (int) (rnd.nextFloat() * saltChars.length());
			captchaStrBuffer.append(saltChars.substring(index, index + 1));
			// generatedToken.append(number.nextInt(9));
		}
		if (false)
			return captchaStrBuffer.toString();
		else
			return createRegistrationCode(8);
	}
}