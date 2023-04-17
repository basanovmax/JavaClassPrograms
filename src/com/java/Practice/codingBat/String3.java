package com.java.Practice.codingBat;

public class String3 {
	public static void main(String[] args) {

		System.out.println(maxBlock("abbCCCddBBBxx"));
	}

	/*Given a string, return the length of the largest "block" in the string.
A block is a run of adjacent chars that are the same.


    maxBlock("hoopla") → 2
    maxBlock("abbCCCddBBBxx") → 3
    maxBlock("") → 0*/

	public static int maxBlock(String str) { //maxBlock("abbCCCddBBBxx") → 3
		int count = 0;
		int tmpcount = 1;
		if (str.length() == 0) {
			return 0;
		}
		for (int i = 0; i < str.length(); i++) {

			if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
				tmpcount++;
			}
			else tmpcount=1;
			if (count < tmpcount) {
				count = tmpcount;
			}
		}
		return count;
	}
}

