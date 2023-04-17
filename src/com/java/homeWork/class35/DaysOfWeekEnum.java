package com.java.homeWork.class35;

import java.util.Scanner;

import static com.java.homeWork.class35.DaysOfWeek.MONDAY;
import static com.java.homeWork.class35.DaysOfWeek.WEDNESDAY;

enum DaysOfWeek {
	SUNDAY (0),	MONDAY (1), TUESDAY (2), WEDNESDAY (3),	THURSDAY (4),	FRIDAY (5),	SATURDAY (6);
	int value;
	DaysOfWeek(int value){
		this.value=value;
	}
}
public class DaysOfWeekEnum{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Type number of week day from 0-6");
		int dayOfWeek = input.nextInt();
		if (dayOfWeek>=0 && dayOfWeek <=6) {
			switch (dayOfWeek) {
				case 0:
					System.out.println("It's " + DaysOfWeek.SUNDAY);
					break;
				case 1:
					System.out.println("It's " + DaysOfWeek.MONDAY);
					break;
				case 2:
					System.out.println("It's " + DaysOfWeek.TUESDAY);
					break;
				case 3:
					System.out.println("It's " + DaysOfWeek.WEDNESDAY);
					break;
				case 4:
					System.out.println("It's " + DaysOfWeek.THURSDAY);
					break;
				case 5:
					System.out.println("It's " + DaysOfWeek.FRIDAY);
					break;
				case 6:
					System.out.println("It's" + DaysOfWeek.SATURDAY);
					break;
			}
		} else System.out.println("Incorrect number of weekday");
	}
}

