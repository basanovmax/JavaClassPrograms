package com.java.class23;

public class HomeWork23_2 {
    public static void main(String[] args) {
        /*2.  Write a program to find the duplicate elements
        from the array (The element should not be repeated in the output )

        Input: 45, 65, 85, 24, 45, 85, 34, 65, 45, 85
        Output: 45, 65, 85*/
        int nums[] = {45, 65, 85, 24, 45, 85, 34, 65, 45, 85};


        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {

                    System.out.print(nums[i] + " ");
                    break;
                }
            }
        }
    }
}
