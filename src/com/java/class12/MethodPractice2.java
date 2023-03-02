package com.java.class12;
        /* We have a loud talking parrot. Create a function that will tell us if
        we are in trouble or not based on the hour and based on if the parrot is talking.

        The "hour" is the current hour time in the range 0..23.
        We are in trouble if the parrot is talking and the hour is
        before 7 or after 20. Return true if we are in trouble. */

public class MethodPractice2 {
    public static void main(String[] args) {

        boolean a = trouble(6, false);
        System.out.println(a);
    }
        public static boolean trouble(int hour, boolean isParrotTalking){
            if (isParrotTalking) {

                if (hour <= 7 || (hour > 20 && hour <= 24)) {
                    return true;
                } else {
                    return false;
                }
            }
            else {
                    return false;
                }
            }
        }



