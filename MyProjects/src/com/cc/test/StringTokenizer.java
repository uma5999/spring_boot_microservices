package com.cc.test;

public class StringTokenizer {

	public static void main(String[] args) {

		String str = "cogknit semantics private limited umamaheshwarrao";
		String tokens[] = str.split(" ");

		int globalsize = 0;
		String lar = "";
		for (int i = 0; i < tokens.length; i++) {

			String istr = tokens[i];
			int isize = istr.length();
			if (isize > globalsize) {
				globalsize = isize;
				lar = tokens[i];
			}

		}
		System.out.println(lar);
	}

}
