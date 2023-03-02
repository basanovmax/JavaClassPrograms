package com.java.class23;

import java.util.Arrays;

public class HomeWork23_4 {
    public static void main(String[] args) {
        /*4. Write a program to sort array elements in ascending order
        Input: 5 2 8 7 1
        Output: 1 2 5 7 8*/
        int nums[] = {5, 2, 8, 7, 1};
        int res = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                Arrays.sort(nums);
                res = res + nums[i];
            }
            System.out.print(nums[i] + " ");
        }
    }
}

