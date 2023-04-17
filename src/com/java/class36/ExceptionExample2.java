package com.java.class36;

public class ExceptionExample2 {
	public static void main(String[] args) {
		String str = null;
		try {
			System.out.println(str.length());
		} catch (ArithmeticException e) {
			System.out.println("Something went wrong");
		} catch (NullPointerException e) {
			System.out.println("Null Pointer");
		}
	}
}
