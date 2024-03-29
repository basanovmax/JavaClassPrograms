package com.java.Practice.codingBat;

import java.util.Arrays;

public class Array2 {
	public static void main(String[] args) {
		int sum[] = {1, 2, 2, 1};
		System.out.println(sum13(sum));
		System.out.println("==================");
		int sum1[] = {2, 1, 2};
		System.out.println(has22(sum1));
		System.out.println("==================");
		int sum2[] = {2, 3, 2, 2, 4, 2, 2};
		System.out.println(sum28(sum2));
		System.out.println("==================");
		int sum3[] = {1, 1};
		System.out.println(more14(sum3));
		System.out.println("==================");

		/*System.out.println(fizzArray(4));*/
		System.out.println("==================");
		int sum4[] = {4, 4, 1, 2, 2};
		System.out.println(either24(sum4));
		System.out.println("==================");
		int sum5[] = {1, 2, 3};
		int sum6[] = {2, 3, 10};
		System.out.println(matchUp(sum5, sum6));
		int sum7[] = {2, 7, 2, 2, 7, 2};
		System.out.println(has77(sum7));
		System.out.println("==================");
		int sum8[] = {10, 3, 5, 6};
		System.out.println(bigDiff(sum8));
		System.out.println("==================");
		int sum9[] = {2, 1, 3, 5};
		System.out.println(modThree(sum9));
		System.out.println("==================");
		int sum10[] = {1, 3, 1, 3, 1, 3, 4, 3};
		System.out.println(haveThree(sum10));
		System.out.println("==================");
		int sum11[] = {1, 2, 4};
		System.out.println(tripleUp(sum11));
		System.out.println("==================");
		int sum12[] = {1, 2, 4, 1};
		System.out.println(Arrays.toString(pre4(sum12)));
		System.out.println("==================");



	}

  /*  Return the sum of the numbers in the array,
  returning 0 for an empty array. Except the number
  13 is very unlucky, so it does not count and numbers
  that come immediately after a 13 also do not count.


        sum13([1, 2, 2, 1]) → 6
        sum13([1, 1]) → 2
        sum13([1, 2, 2, 1, 13]) → 6*/

	public static int sum13(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 13) {
				sum += nums[i];
				if (i > 0 && nums[i - 1] == 13) {
					sum -= nums[i];
				}
			}
		}
		return sum;
	}

    /*Return the sum of the numbers in the array,
    except ignore sections of numbers starting with a 6
    and extending to the next 7 (every 6 will be followed
    by at least one 7). Return 0 for no numbers.


    sum67([1, 2, 2]) → 5
    sum67([1, 2, 2, 6, 99, 99, 7]) → 5
    sum67([1, 1, 6, 7, 2]) → 4
    public static int sum67(int[] nums) {
        int sum = 0;
        int sum1 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 6 && nums[i] != 7) {
                sum += nums[i];
            }
            if (nums[i] == 6) {
                sum = sum + nums[i];
            }
            if (nums[i] == 7) {
                sum1 = sum1 + nums[i + 1];
            }return sum + sum1;
        }return sum;*/


	/*Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.


			has22([1, 2, 2]) → true
			has22([1, 2, 1, 2]) → false
			has22([2, 1, 2]) → false*/
	public static boolean has22(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 2 && nums[i + 1] == 2) {
				return true;
			}
		}
		return false;
	}


    /*Given an array of ints, return true if the array contains no 1's and no 3's.


            lucky13([0, 2, 4]) → true
            lucky13([1, 2, 3]) → false
            lucky13([1, 2, 4]) → false*/

	public static boolean lucky13(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1 || nums[i] == 3) {
				return false;
			}
		}
		return true;
	}

	/*   Given an array of ints, return true if
	the sum of all the 2's in the array is exactly 8.


	   sum28([2, 3, 2, 2, 4, 2]) → true
	   sum28([2, 3, 2, 2, 4, 2, 2]) → false
	   sum28([1, 2, 3, 4]) → false*/
	public static boolean sum28(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 2)
				sum += 2;
		}
		return sum == 8;
	}

	/*    Given an array of ints, return true if
	the number of 1's is greater than the number of 4's


		more14([1, 4, 1]) → true
		more14([1, 4, 1, 4]) → false
		more14([1, 1]) → true */
	public static boolean more14(int[] nums) {
		int count1 = 0;
		int count4 = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				count1++;
			}
			if (nums[i] == 4) {
				count4++;
			}
		}
		return count1 > count4;
	}


	/*Given a number n, create and return a new int array of length n,
	containing the numbers 0, 1, 2, ... n-1. The given n may be 0, in
	which case just return a length 0 array. You do not need a separate
	if-statement for the length-0 case; the for-loop should naturally execute 0
	times in that case, so it just works. The syntax to make a new int array is:
	new int[desired_length]   (See also: FizzBuzz Code)


	fizzArray(4) → [0, 1, 2, 3]
	fizzArray(1) → [0]
	fizzArray(10) → [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]*/
	public static String[] fizzArray(int n) {
		String a[] = new String[n];
		for (int i = 0; i < n; i++) {
			a[i] = String.valueOf(i);
		}
		return a;
	}


    /*Given an array of ints, return true if every element is a 1 or a 4.

        only14([1, 4, 1, 4]) → true
        only14([1, 4, 2, 4]) → false
        only14([1, 1]) → true*/
/*    public static boolean only14(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 1 &&  || nums[i] == 4) {

        return true;
            }
        }return false;
    }*/

	/*Given an array of ints, return true if the array
	contains a 2 next to a 2 or a 4 next to a 4, but not both.


	either24([1, 2, 2]) → true
	either24([4, 4, 1]) → true
	either24([4, 4, 1, 2, 2]) → false*/
	public static boolean either24(int[] nums) {
		boolean has22 = false;
		boolean has44 = false;
		for (int i = 0; i < nums.length - 1; i++) {

			if (nums[i] == 2 && nums[i + 1] == 2) {
				has22 = true;
			}
			if (nums[i] == 4 && nums[i + 1] == 4) {
				has44 = true;
			}
		}
		return has22 != has44;
	}

    /*Given arrays nums1 and nums2 of the same length,
    for every element in nums1, consider the corresponding
    element in nums2 (at the same index). Return the count of
    the number of times that the two elements differ by 2 or less, but are not equal.


            matchUp([1, 2, 3], [2, 3, 10]) → 2
            matchUp([1, 2, 3], [2, 3, 5]) → 3
            matchUp([1, 2, 3], [2, 3, 3]) → 2*/

	public static int matchUp(int[] nums1, int[] nums2) {
		int count = 0;
		int i = 0;
		int num1 = nums1[i] - nums2[i];
		int num2 = nums1[i] - nums2[i];
		for (i = 0; i < nums1.length; i++) {
			if (num1 < 2 || num2 < 2 && nums1[i] != nums2[i]) {
				count++;
			}
		}
		return count;
	}


   /* Given an array of ints, return true if the array contains
   two 7's next to each other, or there are two 7's separated by
   one element, such as with {7, 1, 7}.


    has77([1, 7, 7]) → true
    has77([1, 7, 1, 7]) → true
    has77([1, 7, 1, 1, 7]) → false*/

	public static boolean has77(int[] nums) {

		for (int i = 0; i < nums.length - 1; i++) {

			if (nums[i] == 7 && nums[i + 1] == 7) {
				return true;
			}
			for (int j = 0; j < nums.length - 2; j++)
				if (nums[j] == 7 && nums[j + 2] == 7) {
					return true;
				}
		}
		return false;

	}

	/*  Given an array length 1 or more of ints, return the difference between
	the largest and smallest values in the array. Note: the built-in Math.min(v1, v2)
	and Math.max(v1, v2) methods return the smaller or larger of two values.


		bigDiff([10, 3, 5, 6]) → 7
		bigDiff([7, 2, 10, 9]) → 8
		bigDiff([2, 10, 7, 2]) → 8  */
	public static int bigDiff(int[] nums) {
		int dif = 0;
		int max = 0;
		int min = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums.length > 0) {
				max = Math.max(nums[i], nums[i + 1]);
				if (max > nums[i]) {
					max = nums[i];
				}
				System.out.println("max " + max);
/*                min = Math.min(nums[i],nums[i+1]);
                System.out.println("min " +min );*/
			}
		}
		return max;
	}


    /*Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.


    modThree([2, 1, 3, 5]) → true
    modThree([2, 1, 2, 5]) → false
    modThree([2, 4, 2, 5]) → true*/

	public static boolean modThree(int[] nums) {
		for (int i = 0; i < nums.length - 2; i++) {
			if (nums[i] % 2 == 0 && nums[i + 1] % 2 == 0 && nums[i + 2] % 2 == 0) {
				return true;
			} else if (nums[i] % 2 == 1 && nums[i + 1] % 2 == 1 && nums[i + 2] % 2 == 1) {
				return true;
			}
		}
		return false;
	}

	/*   Given an array of ints, return true if the value 3 appears
	in the array exactly 3 times, and no 3's are next to each other.


	   haveThree([3, 1, 3, 1, 3]) → true
	   haveThree([3, 1, 3, 3]) → false
	   haveThree([3, 4, 3, 3, 4]) → false*/
	public static boolean haveThree(int[] nums) {
		int counter = 0;
		for (int i = 0; i <= nums.length - 1; i += 2) {
			if (nums[i] == 3) {
				counter++;
				if (counter == 3) {
					return true;
				}
			}
		}
		return false;
	}


	/* Return true if the array contains, somewhere, three increasing adjacent
	numbers like .... 4, 5, 6, ... or 23, 24, 25.


	 tripleUp([1, 4, 5, 6, 2]) → true
	 tripleUp([1, 2, 3]) → true
	 tripleUp([1, 2, 4]) → false*/
	public static boolean tripleUp(int[] nums) {
		for (int i = 0; i < nums.length - 2; i++) {
			if (nums[i] + 1 == nums[i + 1] && nums[i + 1] + 1 == nums[i + 2]) {
				return true;
			}
		}
		return false;
	}

	/*Array-2 > pre4
	Given a non-empty array of ints, return a new array containing
	the elements from the original array that come before the first 4 in the original array.
	The original array will contain at least one 4. Note that it is valid in java to create an array of length 0.


		pre4([1, 2, 4, 1]) → [1, 2]
		pre4([3, 1, 4]) → [3, 1]
		pre4([1, 4, 4]) → [1]*/
	public static int[] pre4(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 4) {
				break;
			}
			count++;
		}
		int result[] = new int[count];
		for (int i = 0; i < count; i++) {
			result[i] = nums[i];
		}
		return result;
	}

}













