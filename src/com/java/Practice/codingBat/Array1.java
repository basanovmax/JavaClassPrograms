package com.java.Practice.codingBat;

import java.util.ArrayList;
import java.util.Arrays;



public class Array1 {

	public static void main(String[] args) {
/*        int nums1 [] = {1, 2, 3};
        System.out.println(firstLast6(nums1));*/
		int nums2[] = {3};
		System.out.println(Arrays.toString(makeLast(nums2)));
		System.out.println("============================");
		int nums3[] = {1, 2};
		int nums4[] = {};
		System.out.println(start1(nums3, nums4));
		System.out.println("============start1================");
		int nums5[] = {4, 5};
		int nums6[] = {1, 2, 3};
		System.out.println(start1(nums5, nums6));



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



  /*  Given an int array, return a new array with double the length where its last element is the same as the original array,
  and all the other elements are 0. The original array will be length 1 or more. Note: by default, a new int array contains all 0's.


    makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
    makeLast([1, 2]) → [0, 0, 0, 2]
    makeLast([3]) → [0, 3]*/

	public static int[] makeLast(int[] nums) {
		int[] res = new int[nums.length * 2];
		res[res.length - 1] = nums[nums.length - 1];
		return res;
	}

   /* Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.


    start1([1, 2, 3], [1, 3]) → 2
    start1([7, 2, 3], [1]) → 1
    start1([1, 2], []) → 1*/

	public static int start1(int[] a, int[] b) {
		int count=0;
		if (a.length > 0 && a[0]==1) {
			count++;
		}
		if (b.length > 0 && b[0]==1) {
			count++;
		} return count;
	}


/*	Given 2 int arrays, a and b, return a new array length 2 containing,
as much as will fit, the elements from a followed by the elements from b.
The arrays may be any length, including 0, but there will be 2 or more elements available between the 2 arrays.


	make2([4, 5], [1, 2, 3]) → [4, 5]
	make2([4], [1, 2, 3]) → [4, 1]
	make2([], [1, 2]) → [1, 2]*/

/*	public static int[] make2(int[] a, int[] b) {


		if (a.length>=2){
			return new int nums []  = {a[0], a[1]} ;
		}
		int nums6[] = {1, 2, 3};
	}*/
}



