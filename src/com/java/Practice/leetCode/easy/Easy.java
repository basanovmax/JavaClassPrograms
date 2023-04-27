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
		System.out.println("=================");
		System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
		System.out.println("=================");
		int nums3[] = {2, 2, 1, 1, 1, 2, 2};
		System.out.println(majorityElement(nums3));
		System.out.println("=================");
		System.out.println(strStr("abc", "c"));
		System.out.println("=================");
		int nums4[] = {1,3,5,6};
		System.out.println(searchInsert(nums4, 7));
		System.out.println("=================");
		System.out.println(addDigits(38));


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

	// 58. Length of Last Word
/*    Given a string s consisting of words and spaces, return the length of the last word in the string.
    A word is a maximal  substring consisting of non-space characters only.

    Example 1:
Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:
Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
Example 3:
Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.*/

	public static int lengthOfLastWord(String s) {
		String x = s.trim();
		int result = 0;

		for (int i = 0; i < x.length(); i++) {
			if (x.charAt(i) == ' ') {
				System.out.println("if " + result);
				result = 0;
			} else
				result++;
			System.out.println("else " + result);
		}
		return result;
	}

	/*169. Majority Element
	Given an array nums of size n, return the majority element.
	The majority element is the element that appears more than ⌊n / 2⌋ times.
	You may assume that the majority element always exists in the array.
	Example 1:
Input: nums = [3,2,3]
Output: 3
Example 2:
Input: nums = [2,2,1,1,1,2,2]
Output: 2*/

	public static int majorityElement(int[] nums) {
		int max = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (max < nums[i]) {
				max = nums[i];
			} else {
				return max;
			}
		}
		return max;
	}

	public static int[] getConcatenation(int[] nums) {
		int[] ans = new int[nums.length * 2];
		for (int i = 0; i < nums.length; i++) {
			ans[i] = nums[i];
			ans[i + nums.length] = nums[i];
		}
		return ans;
	}

	//28. Find the Index of the First Occurrence in a String
/*	Given two strings needle and haystack, return the index of the
	first occurrence of needle in haystack, or -1 if needle is not part of haystack.*/
	public static int strStr(String haystack, String needle) {
		int l1 = haystack.length(), l2 = needle.length();
		if (l1 < l2) {
			return -1;
		} else if (l2 == 0) {
			return 0;
		}
		for (int i = 0; i <= l1 - l2; i++) {
			if (haystack.substring(i, i + l2).equals(needle)) {
				return i;
			}
		}
		return -1;
	}

	/*35. Search Insert Position
	Given a sorted array of distinct integers and a target value,
	return the index if the target is found. If not, return the index where
	it would be if it were inserted in order.
	You must write an algorithm with O(log n) runtime complexity.*/
	public static int searchInsert(int[] nums, int target) {
		int i;
		for (i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				return i;
			} else {
				if (nums[i] > target) {
					return i;
				}
			}
		}
		return i;
	}
	/*258. Add Digits
	Given an integer num, repeatedly add all its digits until
	the result has only one digit, and return it.
	Example 1:
Input: num = 38
Output: 2
Explanation: The process is
38 --> 3 + 8 --> 11
11 --> 1 + 1 --> 2
Since 2 has only one digit, return it.*/
	public static int addDigits(int num) {
	return (num-1)%9+1;
	}
}