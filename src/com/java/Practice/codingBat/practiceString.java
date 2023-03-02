package com.java.Practice.codingBat;

public class practiceString {
    public static void main(String[] args) {
        String str = "Hello";
        String swap = str.substring(str.length() - 2);
        swap = swap.substring(1).concat(swap.substring(0, 1));
        str = str.substring(0, str.length() - 2).concat(swap);
        System.out.println(swap);

        System.out.println(firstHalf("WooHoo"));

        System.out.println(firstLast("Tommorow"));

        System.out.println(nonStart("Hello", "There"));

        System.out.println(left2("Java"));

        System.out.println(theEnd("Hello", false));

        System.out.println(withouEnd2("Hello"));

        System.out.println(middleTwo("string"));

        System.out.println(twoChars("ab"));

        String str1 = "Hello World";
        System.out.println(str1.charAt(0));
        System.out.println(str1.substring(1, str.length() - 1));
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());

        System.out.println(str1.charAt(4));
        System.out.println(str1.substring(4, 5));

        System.out.println(makeAbba("Hi", "Go"));

        System.out.println(makeTags("i", "Hello"));

        System.out.println(comboString("Hello", "dsdsadds"));

        System.out.println(right2("12345"));

        System.out.println(endsLy("oddly"));

        System.out.println(nTwice("Chocolate", 3));

        System.out.println(middleThree("Solving"));

        System.out.println(atFirst("hi"));

        System.out.println(lastChars("", ""));
    }


    /* Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".


    firstHalf("WooHoo") → "Woo"
    firstHalf("HelloThere") → "Hello"
    firstHalf("abcdef") → "abc" */

    public static String firstHalf(String str) {
        int str1 = str.length() / 2;
        return str.substring(0, str1);
    }

    /* Given a string, return a version without the first and last char,
    so "Hello" yields "ell". The string length will be at least 2.


    withoutEnd("Hello") → "ell"
    withoutEnd("java") → "av"
    withoutEnd("coding") → "odin" */

    public static String firstLast(String withoutEnd) {
        return withoutEnd.substring(withoutEnd.length() - (withoutEnd.length() - 1), withoutEnd.length() - 1);
    }

    /* Given 2 strings, return their concatenation,
    except omit the first char of each. The strings will be at least length 1.


    nonStart("Hello", "There") → "ellohere"
    nonStart("java", "code") → "avaode"
    nonStart("shotl", "java") → "hotlava" */

    public static String nonStart(String a, String b) {
        return a.substring(1).concat(b.substring(1));
    }

    /* Given a string, return a "rotated left 2" version where
    the first 2 chars are moved to the end.
    The string length will be at least 2.


    left2("Hello") → "lloHe"
    left2("java") → "vaja"
    left2("Hi") → "Hi" */

    public static String left2(String str) {
        return str.substring(2, str.length()).concat(str.substring(0, 2));
    }

    /* Given a string, return a string length 1 from its front,
    unless front is false, in which case return
    a string length 1 from its back. The string will be non-empty.


    theEnd("Hello", true) → "H"
    theEnd("Hello", false) → "o"
    theEnd("oh", true) → "o" */

    public static String theEnd(String str, boolean front) {
        if (front == true) {
            return str.substring(0, 1);
        } else {
            return str.substring(str.length() - 1);
        }
    }

    /* Given a string, return a version without
    both the first and last char of the string.
    The string may be any length, including 0.


    withouEnd2("Hello") → "ell"
    withouEnd2("abc") → "b"
    withouEnd2("ab") → "" */
    public static String withouEnd2(String str) {
        if (str.length() <= 2) {
            return str;
        }
        return str.substring(0, str.length()-2);
    }
    //str.substring(str.length()-2).concat(

    /*Given a string of even length, return a string made of
    the middle two chars, so the string "string" yields "ri".
    The string length will be at least 2.


    middleTwo("string") → "ri"
    middleTwo("code") → "od"
    middleTwo("Practice") → "ct" */
    public static String middleTwo(String str) {
        int half = str.length() / 2;
        return str.substring(half - 1, half + 1);
    }

     /*Homework 3:
        Given a string of any length, return a new string where
        the last 2 chars, if present, are swapped, so “coding” yields “codign”.
        lastTwo(“coding”) → “codign”
        lastTwo(“cat”) → “cta”
        lastTwo(“ab”) → “ba” */

    public static String twoChars(String str) {
        String swap1 = str.substring(str.length() - 2, str.length() - 1);
        String swap2 = str.substring(str.length() - 1);
        return str.substring(0, str.length() - 2).concat(swap2).concat(swap1);
    }


    /*Given two strings, a and b, return the result of
    putting them together in the order abba,
    e.g. "Hi" and "Bye" returns "HiByeByeHi".


    makeAbba("Hi", "Bye") → "HiByeByeHi"
    makeAbba("Yo", "Alice") → "YoAliceAliceYo"
    makeAbba("What", "Up") → "WhatUpUpWhat" */
    public static String makeAbba(String a, String b) {
        return a.concat(b).concat(b).concat(a);
    }

    /* The web is built with HTML strings like "<i>Yay</i>"
    which draws Yay as italic text. In this example,
    the "i" tag makes <i> and </i> which surround the word "Yay".
    Given tag and word strings, create the HTML string with tags
    around the word, e.g. "<i>Yay</i>".


    makeTags("i", "Yay") → "<i>Yay</i>"
    makeTags("i", "Hello") → "<i>Hello</i>"
    makeTags("cite", "Yay") → "<cite>Yay</cite>" */
    public static String makeTags(String tag, String word) {
        String quote = "<";
        String quote1 = "</";
        String quoteBack = ">";
        return quote.concat(tag).concat(quoteBack).concat(word).concat(quote1).concat(tag).concat(quoteBack);
    }

    /*Given 2 strings, a and b, return a string of the form short+long+short,
    with the shorter string on the outside and the longer string on the inside.
    The strings will not be the same length, but they may be empty (length 0).


    comboString("Hello", "hi") → "hiHellohi"
    comboString("hi", "Hello") → "hiHellohi"
    comboString("aaa", "b") → "baaab" */

    public static String comboString(String a, String b) {
        if (a.length() > b.length()) {
            return b.concat(a).concat(b);
        }
        return a.concat(b).concat(a);
    }

    /* Given a string, return a "rotated right 2" version
    where the last 2 chars are moved to the start.
    The string length will be at least 2.

    right2("Hello") → "loHel"
    right2("java") → "vaja"
    right2("Hi") → "Hi" */

    public static String right2(String str) {
        if (str.length() > 2) {


            return str.substring(str.length()-2).concat(str.substring(0,str.length()-2));
        }
        return str;
    }

    /* Given a string, return true if it ends in "ly".


    endsLy("oddly") → true
    endsLy("y") → false
    endsLy("oddy") → false */

    public static boolean endsLy(String str) {
    if(str.length()>=2 && str.endsWith("ly")){
        return true;
    }
    return false;
    }

    /* Given a string and an int n, return a string made
    of the first and last n chars from the string.
    The string length will be at least n.


    nTwice("Hello", 2) → "Helo"
    nTwice("Chocolate", 3) → "Choate"
    nTwice("Chocolate", 1) → "Ce" */
    public static String nTwice(String str, int n) {
    return str.substring(0,n).concat(str.substring(str.length()-n));
    }

    /* Given a string of odd length,
    return the string length 3 from its middle,
    so "Candy" yields "and".
    The string length will be at least 3.


middleThree("Candy") → "and"
middleThree("and") → "and"
middleThree("solving") → "lvi"*/
    public static String middleThree(String str) {
        if(str.length()>3){
            int middle = str.length()/2;
            return str.substring(middle-1,middle+2);
        }
    return str;
    }
    /*Given a string, return a string length
    2 made of its first 2 chars.
    If the string length is less than 2,
    use '@' for the missing chars.


atFirst("hello") → "he"
atFirst("hi") → "hi"
atFirst("h") → "h@"*/

    public static String atFirst(String str) {
        if (str.length() >= 2) {
            return str.substring(0, 2);
        }
        else if(str.length() == 0){
            return str.concat("@@");
        }
        return str.concat("@");
    }

    /*Given 2 strings, a and b, return a new string
    made of the first char of a and the last char
    of b, so "yo" and "java" yields "ya".
    If either string is length 0, use '@' for its missing char.


lastChars("last", "chars") → "ls"
lastChars("yo", "java") → "ya"
lastChars("hi", "") → "h@" */
    public static String lastChars(String a, String b) {
    if(a.length()==0 && b.length()>0 ){
        return a.replace("","@").concat(b.substring(b.length()-1));
    }
    else if (a.length()>0 && b.length()==0){
        return a.substring(0,1).concat(b.replace("", "@"));
    }
    else if (a.length()==0 && b.length()==0) {
        return a.replace("", "@").concat(b.replace("", "@"));
    }
        return a.substring(0,1).concat(b.substring(b.length()-1));
    }

}
