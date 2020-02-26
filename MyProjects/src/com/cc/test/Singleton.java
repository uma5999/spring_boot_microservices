package com.cc.test;

import java.util.Arrays;
import java.util.List;

public class Singleton {
	public static void main(String[] args) {

		List<Object[]> list = Arrays.<Object[]>asList(new Object[] { "uma", "mahesh", "golakara", "rao" });

		for (Object[] obj : list) {
			for (Object obj1 : obj) {
				System.out.println(obj1);

			}

		}

	}
}
