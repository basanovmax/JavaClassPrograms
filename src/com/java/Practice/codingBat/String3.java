package com.java.Practice.codingBat;

import static java.lang.Character.isDigit;

public class String3 {
	public static void main(String[] args) {

		System.out.println(maxBlock("abbCCCddBBBxx"));
		System.out.println("============================");

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

/*	Given a string, return a string where every appearance of the lowercase word "is" has been replaced with "is not".
The word "is" should not be immediately preceeded or followed by a letter --
so for example the "is" in "this" does not count. (Note: Character.isLetter(char) tests if a char is a letter.)


	notReplace("is test") → "is not test"
	notReplace("is-is") → "is not-is not"
	notReplace("This is right") → "This is not right"*/
	/*public static String notReplace(String str) {
	String res= "";
	for (int i = 0; i < str.length(); i++){
		if ()


		if (str.startsWith("is", i)){
			res = res + str.substring(0,i) + str.substring(i,i+2) + (" not ") + str.substring(i+2);
		}
	}return res;
}*/


}

