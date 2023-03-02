package com.java.Practice.codingBat;

public class PracticeString1 {
    public static void main(String[] args) {

        System.out.println(conCat("abc", "cat"));

        System.out.println(lastTwo(""));

        System.out.println(seeColor("blu"));

        System.out.println(frontAgain("ed"));

        System.out.println(minCat("Hello", "Hello"));

        System.out.println(extraFront("H"));

        System.out.println(without2("i"));

        System.out.println(deFront("abay"));

        System.out.println(startWord("hadad", "ix"));

        System.out.println(withoutX2("Hi"));

        System.out.println(withoutX("Hxix"));

        System.out.println(hasBad("xba"));

        System.out.println(mixString("abc", "xyz"));

        System.out.println(repeatEnd("Hello", 3));

        System.out.println(repeatFront("Chocolate", 4));

        System.out.println(repeatSeparator("Word", "X", 3));


    }
    /* Given two strings, append them together (known as "concatenation")
    and return the result. However, if the concatenation creates a double-char,
    then omit one of the chars, so "abc" and "cat" yields "abcat".


    conCat("abc", "cat") → "abcat"
    conCat("dog", "cat") → "dogcat"
    conCat("abc", "") → "abc" */

    public static String conCat(String a, String b) {

        if (a.length() > 0 && b.length() > 0 && a.substring(a.length() - 1).equalsIgnoreCase(b.substring(0, 1))) {
            return a.concat(b.substring(1));
        }
        return a.concat(b);
    }

    /* Given a string of any length, return a new string where
    the last 2 chars, if present, are swapped, so “coding” yields “codign”.
    lastTwo(“coding”) → “codign”
    lastTwo(“cat”) → “cta”
    lastTwo(“ab”) → “ba” */

    public static String lastTwo(String str) {
        if (str.length() > 1) {
            String swap1 = str.substring(str.length() - 2, str.length() - 1);
            String swap2 = str.substring(str.length() - 1);
            return str.substring(0, str.length() - 2).concat(swap2).concat(swap1);
        }
        return str;
    }

    /* Given a string, if the string begins with "red" or "blue"
    return that color string, otherwise return the empty string.


    seeColor("redxx") → "red"
    seeColor("xxred") → ""
    seeColor("blueTimes") → "blue" */

    public static String seeColor(String str) {
        String replace = str.replace(str.substring(0, str.length()), "");
        if (str.length() >= 3) {
            if (str.substring(0, 3).equalsIgnoreCase("red")) {
                return str.substring(0, 3);
            } else if (str.length() >= 4 && str.substring(0, 4).equalsIgnoreCase("blue")) {
                {
                    return str.substring(0, 4);
                }
            }
        }
        return replace;
    }

    /* Given a string, return true if the first 2 chars in the
    string also appear at the end of the string, such as with "edited".


    frontAgain("edited") → true
    frontAgain("edit") → false
    frontAgain("ed") → true */
    public static boolean frontAgain(String str) {

        if (str.length() >= 2) {
            if (str.substring(0, 2).equalsIgnoreCase(str.substring(str.length() - 2))) {
                return true;
            }
        }
        return false;
    }

    /* Given two strings, append them together (known as "concatenation")
    and return the result. However, if the strings are different lengths,
    omit chars from the longer string so it is the same length as the shorter
    string. So "Hello" and "Hi" yield "loHi". The strings may be any length.

        minCat("Hello", "Hi") → "loHi"
        minCat("Hello", "java") → "ellojava"
        minCat("java", "Hello") → "javaello"
     */
    public static String minCat(String a, String b) {
        if (a.length() > b.length()) {
            return a.substring(a.length() - b.length()).concat(b);
        } else if (a.length() < b.length()) {
            return a.concat(b.substring(b.length() - a.length()));
        }
        return a.concat(b);
    }

    /*Given a string, return a new string made of 3 copies
    of the first 2 chars of the original string.
    The string may be any length.
    If there are fewer than 2 chars, use whatever is there.


    extraFront("Hello") → "HeHeHe"
    extraFront("ab") → "ababab"
    extraFront("H") → "HHH"*/

    public static String extraFront(String str) {
        if (str.length() >= 2) {
            return str.substring(0, 2).concat(str.substring(0, 2)).concat(str.substring(0, 2));
        }
        return str.concat(str).concat(str);
    }

    /* Given a string, if a length 2 substring appears
    at both its beginning and end, return a string without
    the substring at the beginning, so "HelloHe" yields "lloHe".
    The substring may overlap with itself, so "Hi" yields "".
    Otherwise, return the original string unchanged.


    without2("HelloHe") → "lloHe"
    without2("HelloHi") → "HelloHi"
    without2("Hi") → "" */
    public static String without2(String str) {
        if (str.length() == 2) {
            return str.replace(str, "");
        } else if (str.length() > 2 && str.substring(0, 2).equalsIgnoreCase(str.substring(str.length() - 2))) {
            return str.substring(2);
        }
        return str;
    }

    /* Given a string, return a version without the first 2 chars.
    Except keep the first char if it is 'a' and keep the second
    char if it is 'b'. The string may be any length.
    Harder than it looks.


    deFront("Hello") → "llo"
    deFront("java") → "va"
    deFront("away") → "aay" */

    public static String deFront(String str) {
        if (str.substring(0, 2).equalsIgnoreCase("ab")) {
            return str;
        } else if (str.substring(0, 1).equalsIgnoreCase("a")) {
            return str.substring(0, 1).concat(str.substring(2, str.length()));
        } else if (str.substring(1, 2).equalsIgnoreCase("b")) {
            return str.substring(1);
        }
        return str.substring(2);
    }

    /* Given a string and a second "word" string,
    we'll say that the word matches the string if
    it appears at the front of the string,
    except its first char does not need to match exactly.
    On a match, return the front of the string,
    or otherwise return the empty string.
    So, so with the string "hippo" the word "hi"
    returns "hi" and "xip" returns "hip".
    The word will be at least length 1.


    startWord("hippo", "hi") → "hi"
    startWord("hippo", "xip") → "hip"
    startWord("hippo", "i") → "h" */

    public static String startWord(String str, String word) {

        if (str.substring(0, 1).equalsIgnoreCase(word.substring(0, 1))) {
            return str.substring(0, 1);
        } else if (str.length() > 1 || word.length() > 1 && str.length() > str.length()) {
            if (str.substring(1, word.length()).equalsIgnoreCase(word.substring(1, word.length()))) {
                return str.substring(0, 1).concat(word.substring(1, word.length()));
            }
        }
        return "";

    }

    /* Given a string, if one or both of the first 2 chars
    is 'x', return the string without those 'x' chars,
    and otherwise return the string unchanged.
    This is a little harder than it looks.


    withoutX2("xHi") → "Hi"
    withoutX2("Hxi") → "Hi"
    withoutX2("Hi") → "Hi" */

    public static String withoutX2(String str) {
        if (str.length() == 0) {
            return str;
        } else if (str.length() == 1) {
            return "";
        }
        if (str.substring(0, 1).equalsIgnoreCase(str.substring(1, 2))) {
            return str.substring(2);

        } else if (str.substring(0, 1).equalsIgnoreCase("x")) {
            return str.substring(1);
        } else if (str.substring(1, 2).equalsIgnoreCase("x")) {
            return str.substring(0, 1).concat(str.substring(2));
        }
        return str;
    }

    /* Given a string, if the first or last chars are 'x',
    return the string without those 'x' chars,
    and otherwise return the string unchanged.


    withoutX("xHix") → "Hi"
    withoutX("xHi") → "Hi"
    withoutX("Hxix") → "Hxi" */

    public static String withoutX(String str) {

        if (str.length() == 0) {
            return "";
        } else if (str.length() == 1 && str.equalsIgnoreCase("x")) {
            return "";
        } else if (str.substring(0, 1).equalsIgnoreCase("x") && str.substring(str.length() - 1).equalsIgnoreCase("x")) {
            return str.substring(1, str.length() - 1);
        } else if (str.substring(0, 1).equalsIgnoreCase("x")) {
            return str.substring(1);
        } else if (str.substring(str.length() - 1).equalsIgnoreCase("x")) {
            return str.substring(0, str.length() - 1);
        }
        return str;
    }

    /* Given a string, return true if "bad"
    appears starting at index 0 or 1 in the string,
    such as with "badxxx" or "xbadxx" but not "xxbadxx".
    The string may be any length, including 0.
    Note: use .equals() to compare 2 strings.


    hasBad("badxx") → true
    hasBad("xbadxx") → true
    hasBad("xxbadxx") → false*/
    public static boolean hasBad(String str) {
        if (str.length() > 2 && str.substring(0, 3).equalsIgnoreCase("bad")) {
            return true;
        } else if (str.length() > 3 && str.substring(1, 4).equalsIgnoreCase("bad")) {
            return true;
        }
        return false;
    }

    /*Given two strings, a and b, create a bigger
    string made of the first char of a, the first
    char of b, the second char of a, the second char of b,
    and so on. Any leftover chars go at the end of the result.


    mixString("abc", "xyz") → "axbycz"
    mixString("Hi", "There") → "HTihere"
    mixString("xxxx", "There") → "xTxhxexre"*/
    public static String mixString(String a, String b) {

        String res = "";
        int aLen = a.length();
        int bLen = b.length();
        int max = Math.max(aLen, bLen);

        for (int i = 0; i < max; i++) {
            res += a.charAt(i);
            if (i <= bLen - 1)
                res += b.charAt(i);
        }
        return res;
    }

    /* Given a string and an int n, return a string made of n
    repetitions of the last n characters of the string.
    You may assume that n is between 0 and the length of the string, inclusive.


    repeatEnd("Hello", 3) → "llollollo"
    repeatEnd("Hello", 2) → "lolo"
    repeatEnd("Hello", 1) → "o"*/
    public static String repeatEnd(String str, int n) {
        String res = "";


        for (int i = 0; i < n; i++) {
            res = res + str.substring(str.length() - n);
        }
        return res;

    }

    /* Given a string and an int n,
    return a string made of the first n
    characters of the string, followed by
    the first n-1 characters of the string,
    and so on. You may assume that n is between 0
    and the length of the string, inclusive
    (i.e. n >= 0 and n <= str.length()).


    repeatFront("Chocolate", 4) → "ChocChoChC"
    repeatFront("Chocolate", 3) → "ChoChC"
    repeatFront("Ice Cream", 2) → "IcI" */
    public static String repeatFront(String str, int n) {
        String result = "";

        for (int i = 0; i < n; i++) {
            result += str.substring(0, n - i);
        }
        return result;
    }

    /*Given two strings, word and a separator sep,
    return a big string made of count occurrences of
    the word, separated by the separator string.


    repeatSeparator("Word", "X", 3) → "WordXWordXWord"
    repeatSeparator("This", "And", 2) → "ThisAndThis"
    repeatSeparator("This", "And", 1) → "This"*/
    public static String repeatSeparator(String word, String sep, int count) {

        String result = "";
        if (count == 0) {
            return "";
        } else if (count > 1) {
            for (int i = 1; i < count; i++) {
                result += word + sep;
            }
            return result + word;
        } else
            return word;
    }


}





