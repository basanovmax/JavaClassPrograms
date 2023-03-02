package com.java.Practice.leetCode.easy;

import com.java.Practice.Array;
import com.sun.source.tree.BreakTree;

import java.util.Arrays;
import java.util.Locale;

public class Easy {
    public static void main(String[] args) {
        int nums1[] = {4, 1, 2, 1, 2};
        System.out.println(singleNumber(nums1));
        System.out.println("=================");
        System.out.println(isPalindrome("c#dc"));
        System.out.println("=================");
        System.out.println(climbStairs(2));
        System.out.println("=================");
        System.out.println(isPalindrome(121));
        System.out.println("=================");
        int nums2[] = {3, 3};
        System.out.println(Arrays.toString(twoSum(nums2, 6)));


    }
    /*136. Single Number
    Given a non-empty array of integers nums, every element
    appears twice except for one. Find that single one.
    You must implement a solution with a linear runtime
    complexity and use only constant extra space.*/

    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        if (nums.length < 2) {
            return nums[0];
        }
        for (int i = 1; i < nums.length; i += 2) {
            if (nums[i] != nums[i - 1]) {
                return nums[i - 1];
            }
        }
        return nums[nums.length - 1];
    }

    /* 125. Valid Palindrome
    A phrase is a palindrome if, after converting all uppercase letters
    into lowercase letters and removing all non-alphanumeric characters,
    it reads the same forward and backward. Alphanumeric characters include
    letters and numbers. Given a string s, return true if it is a palindrome,
    or false otherwise.
 */
    public static boolean isPalindrome(String s) {
        String sTrim = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", " ").replace(" ", "");
        System.out.println(sTrim);
        int i = 0;
        int j = sTrim.length() - 1;
        while (i < j) {
            if (sTrim.charAt(i) != sTrim.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    /*    You are climbing a staircase. It takes n steps to reach the top.
        Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?*/
    public static int climbStairs(int n) {
        int n1 = 0;
        int n2 = 1;
        int n3;
        for (int i = 2; i < n; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        return n2;
    }

    public static boolean isPalindrome(int x) {
        int rev = 0;
        int b = x;
        while (x > 0) {
            rev = rev * 10 + x % 10;
            x = x / 10;
        }
        if (b == rev) {
            return true;
        }
        return false;
    }

    /*  Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
      You may assume that each input would have exactly one solution, and you may not use the same element twice.
      You can return the answer in any order.

          Example 1:
      Input: nums = [2,7,11,15], target = 9
      Output: [0,1]
      Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

          Example 2:
      Input: nums = [3,2,4], target = 6
      Output: [1,2]
          Example 3:

      Input: nums = [3,3], target = 6
      Output: [0,1]*/
    public static int[] twoSum(int[] nums, int target) {
        int[] sum = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    sum = new int[]{i, j};
                }
            }
        }
        return sum;
    }
 
}