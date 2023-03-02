package com.java.class24;

import java.util.Arrays;

public class HomeWork24_4 {
    public static void main(String[] args) {
        /*4. Write a program to sort array elements in ascending order using for-each loop
        Input: 5 2 8 7 1
        Output: 1 2 5 7 8*/

        int nums[] = {5, 2, 8, 7, 1};
        Arrays.sort(nums);
        for (int i : nums) {
            System.out.print(i + " ");
            }
        }
    }

