package com.java.class38;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
	public static void main(String[] args) {
		List<Integer> listOfNum = new ArrayList<>();
		//Store data into the list
		listOfNum.add(40);
		listOfNum.add(60);
		listOfNum.add(50);
		listOfNum.add(65);
		listOfNum.add(2,3);

		for (int i=0; i<listOfNum.size();i++){
			System.out.println(listOfNum.get(i));
		}

		for (int data : listOfNum){
			System.out.println(data);
		}


		System.out.println(listOfNum);
	}
}


