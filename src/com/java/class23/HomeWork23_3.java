package com.java.class23;

public class HomeWork23_3 {
    public static void main(String[] args) {
       /* 3. Program to print the elements of an array present in the odd position
        Input: 45, 65, 85, 24, 45, 85, 34, 65, 45, 85
        Output: 65, 24, 85, 65, 85*/

        int nums[] = {45, 65, 85, 24, 45, 85, 34, 65, 45, 85};

        for (int i = 0; i <nums.length;i++){
            if (i%2==1){
                System.out.print(nums[i] + " ");
            }
        }
    }
}
