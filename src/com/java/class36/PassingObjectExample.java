package com.java.class36;
class Person{
	String name;
	int age;
	String phoneNumber;
}
public class PassingObjectExample {
	public static void main(String[] args) {
		Person aizhan = new Person();
		Person dana = new Person();
		Person madina = new Person();

		printObjectData(aizhan);
		printObjectData(dana);
		printObjectData(madina);
	}

	public static void printObjectData(Person per){
		System.out.println(per.age);
		System.out.println(per.name);
		System.out.println(per.phoneNumber);
	}
}
