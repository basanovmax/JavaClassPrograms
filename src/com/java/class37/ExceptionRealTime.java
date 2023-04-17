package com.java.class37;

public class ExceptionRealTime {
	public static void main(String[] args) {
		method1();
	}
	static void method1(){
		try {
			method2();
		}catch (ClassNotFoundException e){

		}
	}
	static void method2() throws ClassNotFoundException{
		method3();
	}
	static void method3() throws ClassNotFoundException {
		method4();
	}
	static void method4() throws ClassNotFoundException{

	}
}
