package com.java.Practice.codingBat;

import java.util.ArrayList;

public class Array1 {

    public static void main(String[] args) {
        int nums1 [] = {1, 2, 3};
        System.out.println(firstLast6(nums1));


    }

    /*Given an array of ints, return true if 6 appears as
        either the first or last element in the array.
        The array will be length 1 or more.


        firstLast6([1, 2, 6]) → true
        firstLast6([6, 1, 2, 3]) → true
        firstLast6([13, 6, 1, 2, 3]) → false

         */
    public static boolean firstLast6(int[] nums) {
        return (nums[0] == 6) || (nums[nums.length - 1] == 6);
    }

    /*Given an array of ints, return true
    if the array is length 1 or more, and the
    first element and the last element are equal.


     sameFirstLast([1, 2, 3]) → false
    sameFirstLast([1, 2, 3, 1]) → true
    sameFirstLast([1, 2, 1]) → true*/

    public static boolean sameFirstLast(int[] nums) {
        return nums.length > 1 && nums[0] == nums[nums.length - 1];
    }

    /*Given 2 arrays of ints, a and b, return true if they have the
    same first element or they have the same last element.
    Both arrays will be length 1 or more.


    commonEnd([1, 2, 3], [7, 3]) → true
    commonEnd([1, 2, 3], [7, 3, 2]) → false
    commonEnd([1, 2, 3], [1, 3]) → true*/

    public static boolean commonEnd(int[] a, int[] b) {
        return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
    }

    /*
    Given an array of ints length 3, return the sum of all the elements.

    sum3([1, 2, 3]) → 6
    sum3([5, 11, 2]) → 18
    sum3([7, 0, 0]) → 7*/

}

