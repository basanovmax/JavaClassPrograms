package com.java.Practice.codingBat;

public class WarmUp2 {
    public static void main(String[] args) {

        System.out.println(stringTimes("Hi", 3));

        System.out.println(frontTimes("Ch", 4));

        System.out.println(countXX("xxxx"));

        System.out.println(doubleX("axxbb"));

        System.out.println(stringSplosion("Code"));

        System.out.println(last2("xaxxaxaxx"));

        int nums1[] = {1, 9, 9, 3, 9};
        System.out.println(arrayCount9(nums1));
        int nums2[] = {1, 1, 2, 1, 2, 3};
        System.out.println(array123(nums2));
        System.out.println("=================");

        System.out.println(stringMatch("xxcaazz", "xxbaaz"));

        System.out.println("=================");
        System.out.println(altPairs("kitten"));
        System.out.println("=================");
        System.out.println(stringYak("pakyak"));
        System.out.println("=================");
        int nums[] = {6, 7, 2, 6};
        System.out.println(array667(nums));
        System.out.println("=================");
        int nums3[] = {1, 1, 1, 2, 2, 2, 1};
        System.out.println(noTriples(nums3));
        System.out.println("=================");
        System.out.println(stringBits("Heeololeo"));
    }

    /* Given a string and a non-negative int n,
        return a larger string that is n copies of the original string.


        stringTimes("Hi", 2) → "HiHi"
        stringTimes("Hi", 3) → "HiHiHi"
        stringTimes("Hi", 1) → "Hi" */
    public static String stringTimes(String str, int n) {
        String result = "";
    /* for (int i = 0; i<n; i++ )
        result += str;
    return result;*/
        int i = 0;
        while (i < n) {
            result += str;
            i++;
        }
        return result;
    }

    /*Given a string and a non-negative int n,
    we'll say that the front of the string is
    the first 3 chars, or whatever is there if
    the string is less than length 3.
    Return n copies of the front;


    frontTimes("Chocolate", 2) → "ChoCho"
    frontTimes("Chocolate", 3) → "ChoChoCho"
    frontTimes("Abc", 3) → "AbcAbcAbc"*/
    public static String frontTimes(String str, int n) {
        String result = "";
        int i = 3;
        if (i > str.length()) {
            i = str.length();
        }
        int j = 0;
        while (j < n) {
            result = result.concat(str.substring(0, i));
            j++;
        }
        return result;
    }

    /*Count the number of "xx" in the given string.
    We'll say that overlapping is allowed, so "xxx" contains 2 "xx".

    countXX("abcxx") → 1
    countXX("xxx") → 2
    countXX("xxxx") → 3*/
    static int countXX(String str) {

        int count = 0;
        int i = 0;
        while (i < str.length() - 1) {
            if (str.substring(i, i + 2).equals("xx"))
                count++;
            i++;
        }
        return count;
    }

  /*  Given a string, return true if the first instance of "x"
  in the string is immediately followed by another "x".

    doubleX("axxbb") → true
    doubleX("axaxax") → false
    doubleX("xxxxx") → true*/

    static boolean doubleX(String str) {
        int i = str.indexOf("x");
        if (i == -1) return false; // no "x" at all
        if (i + 1 >= str.length()) return false; // check i+1 in bounds?
        return str.substring(i + 1, i + 2).equals("x");
    }
    /*Given a non-empty string like
    "Code" return a string like "CCoCodCode".

    stringSplosion("Code") → "CCoCodCode"
    stringSplosion("abc") → "aababc"
    stringSplosion("ab") → "aab"*/

    public static String stringSplosion(String str) {
        int i = 0;
        String result = "";
        while (i < str.length()) {
            result = result.concat(str.substring(0, i + 1));
            i++;
        }
        return result;
    }
    /*Given a string, return the count of the
    number of times that a substring length 2
    appears in the string and also as the last
    2 chars of the string, so "hixxxhi" yields 1
    (we won't count the end substring).

    last2("hixxhi") → 1
    last2("xaxxaxaxx") → 1
    last2("axxxaaxx") → 2*/

    public static int last2(String str) {
        if (str.length() < 2) return 0;

        String end = str.substring(str.length() - 2);
        // Note: substring() with 1 value goes through the end of the string
        int count = 0;

        // Check each substring length 2 starting at i
        for (int i = 0; i < str.length() - 2; i++) {
            String sub = str.substring(i, i + 2);
            if (sub.equals(end)) {  // Use .equals() with strings
                count++;
            }
        }

        return count;
    }

    /*Given an array of ints,
    return the number of 9's in the array.

    arrayCount9([1, 2, 9]) → 1
    arrayCount9([1, 9, 9]) → 2
    arrayCount9([1, 9, 9, 3, 9]) → 3*/
    public static int arrayCount9(int[] nums) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9) {
                count++;
            }
        }
        return count;
    }

    /*Given an array of ints, return true if
    one of the first 4 elements in the array is a 9.
    The array length may be less than 4.

    arrayFront9([1, 2, 9, 3, 4]) → true
    arrayFront9([1, 2, 3, 4, 9]) → false
    arrayFront9([1, 2, 3, 4, 5]) → false*/
    public static boolean arrayFront9(int[] nums) {
        int end = nums.length;
        if (end > 4)
            end = 4;

        for (int i = 0; i < end; i++) {
            if (nums[i] == 9) {
                return true;
            }
        }
        return false;
    }

    /*Given an array of ints, return true if
    the sequence of numbers 1, 2, 3 appears in
    the array somewhere.


    array123([1, 1, 2, 3, 1]) → true
    array123([1, 1, 2, 4, 1]) → false
    array123([1, 1, 2, 1, 2, 3]) → true*/
    public static boolean array123(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
                return true;
            }
        }
        return false;
    }

    /*Given 2 strings, a and b, return the number
    of the positions where they contain the same
    length 2 substring. So "xxcaazz" and "xxbaaz"
    yields 3, since the "xx", "aa", and "az" substrings
    appear in the same place in both strings.

    stringMatch("xxcaazz", "xxbaaz") → 3
    stringMatch("abc", "abc") → 2
    stringMatch("abc", "axc") → 0*/
    public static int stringMatch(String a, String b) {
        int count = 0;
        int min = Math.min(a.length(), b.length());
        for (int i = 0; i < min - 1; i++) {
            if (a.substring(i, i + 2).equals(b.substring(i, i + 2))) {
                count++;
            }
        }
        return count;

    }

    /*Given a string, return a version where
    all the "x" have been removed. Except an
    "x" at the very start or end should not be removed.


    stringX("xxHxix") → "xHix"
    stringX("abxxxcd") → "abcd"
    stringX("xabxxxcdx") → "xabcdx"*/
  /*  public static String stringX(String str) {
    String result = "";
    for (int i = 0; i < str.length(); i++){
        if (str.charAt(0)=='x' || str.endsWith("x")){
            str.substring(0,str.charAt(i))
            //
        }
    }return str;
    }*/

    /*Given a string, return a string made of the chars
    at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".


    altPairs("kitten") → "kien"
    altPairs("Chocolate") → "Chole"
    altPairs("CodingHorror") → "Congrr"*/
    public static String altPairs(String str) {
        String result = "";


        for (int i = 0; i < str.length(); i += 4) {
            int end = i + 2;
            if (end > str.length()) {
                end = str.length();
            }
            result = result + str.substring(i, end);
        }
        return result;
    }

    /*Suppose the string "yak" is unlucky. Given a string, return a
    version where all the "yak" are removed, but the "a" can be any char.
    The "yak" strings will not overlap.


    stringYak("yakpak") → "pak"
    stringYak("pakyak") → "pak"
    stringYak("yak123ya") → "123ya"*/

    public static String stringYak(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (i + 2 < str.length() && str.charAt(i) == 'y' && str.charAt(i + 2) == 'k') {
                i = i + 2;
            } else {
                result = result + str.charAt(i);
            }
        }
        return result;
    }

    /* Given an array of ints, return the number of times
    that two 6's are next to each other in the array.
    Also count instances where the second "6" is actually a 7.


     array667([6, 6, 2]) → 1
     array667([6, 6, 2, 6]) → 1
     array667([6, 7, 2, 6]) → 1*/
    public static int array667(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 6) {
                if (nums[i + 1] == 6 || nums[i + 1] == 7)
                    count++;
            }
        }
        return count;
    }


/*    Given an array of ints, we'll say that a triple
is a value appearing 3 times in a row in the array.
Return true if the array does not contain any triples.


    noTriples([1, 1, 2, 2, 1]) → true
    noTriples([1, 1, 2, 2, 2, 1]) → false
    noTriples([1, 1, 1, 2, 2, 2, 1]) → false*/

    public static boolean noTriples(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == nums[i + 1] && nums[i] == nums[i + 2]) {
                return false;
            }
        }
        return true;
    }

/*    Given an array of ints, return true if it
contains a 2, 7, 1 pattern: a value, followed by the value plus 5,
followed by the value minus 1. Additionally the 271 counts even if
the "1" differs by 2 or less from the correct value.


    has271([1, 2, 7, 1]) → true
    has271([1, 2, 8, 1]) → false
    has271([2, 7, 1]) → true*/

/*    public boolean has271(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 2 && nums[i + 1] == 7 && nums[i + 2] == 1 || nums[i + 2] == 2 || nums[i + 2] == 3) {
                return true;
            }
        }
        return false;
    }*/



    /*Given a string, return a new string made
    of every other char starting with the first,
    so "Hello" yields "Hlo".


    stringBits("Hello") → "Hlo"
    stringBits("Hi") → "H"
    stringBits("Heeololeo") → "Hello"*/
        public static String stringBits (String str){
            String result = "";
            for (int i = 0; i < str.length(); i += 2) {
                result = result + str.charAt(i);
            }
            return result;
        }


    }




