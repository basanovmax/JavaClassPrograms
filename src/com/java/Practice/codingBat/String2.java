package com.java.Practice.codingBat;

public class String2 {
    public static void main(String[] args) {

        System.out.println(doubleChar("The"));

        System.out.println(countHi("abc hi ho"));

        System.out.println(catDog("1cat1cadodog"));

        System.out.println(countCode("codexxcode"));

        System.out.println(endOther("Hiabc", "abc"));

        System.out.println(xyzThere("abcxy"));

        System.out.println(bobThere("bbc"));
        System.out.println("=====================");
        System.out.println(prefixAgain("abXYabc", 1));
        System.out.println("=====================");
        System.out.println(xyzMiddle("AAxyzBB"));
        System.out.println("=====================");
        System.out.println(getSandwich("breadAbread"));
        System.out.println("=====================");
        System.out.println(oneTwo("1234567890"));
        System.out.println("=====================");
        System.out.println(zipZap("zipXzap"));
        System.out.println("=====================");
        /*        System.out.println(starOut("sm***eil*ly"));*/
        System.out.println("=====================");
        /*        System.out.println(plusOut("12xy34", "xy"));*/
/*        System.out.println(wordEnds("XY123XY", "XY"));*/
    }

   /* Given a string, return a string where for every char in the original, there are two chars.


    doubleChar("The") → "TThhee"
    doubleChar("AAbb") → "AAAAbbbb"
    doubleChar("Hi-There") → "HHii--TThheerree" */

    public static String doubleChar(String str) {
        String result = "";
        int i = 0;

        while (i < str.length()) {
            result += str.charAt(i) + str.charAt(i);
            i++;
        }
        return result;
    }


    /* Return the number of times that the string "hi" appears anywhere in the given string.


    countHi("abc hi ho") → 1
    countHi("ABChi hi") → 2
    countHi("hihi") → 2 */

    public static int countHi(String str) {
        int res = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equalsIgnoreCase("hi")) {
                res++;
            }
        }
        return res;
    }

    /*Return true if the string "cat" and "dog" appear the same number of times in the given string.


    catDog("catdog") → true
    catDog("catcat") → false
    catDog("1cat1cadodog") → true */

    public static boolean catDog(String str) {
        int dog = 0;
        int cat = 0;


        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).compareToIgnoreCase("cat") == 0)
                cat++;
            if (str.substring(i, i + 3).compareToIgnoreCase("dog") == 0)
                dog++;
        }
        return dog == cat;


    }

    /* Return the number of times that the string
    "code" appears anywhere in the given string,
    except we'll accept any letter for the 'd',
    so "cope" and "cooe" count.


    countCode("aaacodebbb") → 1
    countCode("codexxcode") → 2
    countCode("cozexxcope") → 2 */
    public static int countCode(String str) {
        int i;
        int count = 0;
        String co = "co";
        String e = "e";

        if (str.length() < 4)
            return 0;

        for (i = 0; i < (str.length() - 3); i++) {
            if (co.compareToIgnoreCase(str.substring(i, i + 2)) == 0 && e.compareToIgnoreCase(str.substring(i + 3, i + 4)) == 0)
                count++;
        }
        return count;
    }

    /* Given two strings, return true if either of the strings
    appears at the very end of the other string,
    ignoring upper/lower case differences (in other words,
    the computation should not be "case sensitive").
    Note: str.toLowerCase() returns the lowercase version of a string.


    endOther("Hiabc", "abc") → true
    endOther("AbC", "HiaBc") → true
    endOther("abc", "abXabc") → true*/

    public static boolean endOther(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        return a.endsWith(b) || b.endsWith(a);
    }

    /* Return true if the given string contains an appearance of "xyz"
    where the xyz is not directly preceeded by a period (.).
    So "xxyz" counts but "x.xyz" does not.


    xyzThere("abcxyz") → true
    xyzThere("abc.xyz") → false
    xyzThere("xyz.abc") → true */

    public static boolean xyzThere(String str) {

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("xyz")) {
                if (i == 0) {
                    return true;
                } else if (str.charAt(i - 1) != '.') {
                    return true;
                }
            }
        }
        return false;
    }
    /* Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.


    bobThere("abcbob") → true
    bobThere("b9b") → true
    bobThere("bac") → false*/

    public static boolean bobThere(String str) {
        int i;
        for (i = 0; i < str.length() - 2; i++) {

            if (str.substring(i, i + 1).compareTo("b") == 0 && str.substring(i + 2, i + 3).compareTo("b") == 0) {
                //if (str.charAt(i) == 'b' && str.charAt(i+2) == 'b')
                return true;
            }
        }
        return false;
    }
    /* We'll say that a String is xy-balanced if for all the 'x'
    chars in the string, there exists a 'y' char somewhere
    later in the string. So "xxy" is balanced, but "xyx" is not.
    One 'y' can balance multiple 'x's.
    Return true if the given string is xy-balanced.


    xyBalance("aaxbby") → true
    xyBalance("aaxbb") → false
    xyBalance("yaaxbb") → false

    public static boolean xyBalance(String str) {
        int i;
        for (i=0; i< str.length(); i++)
    if (str.substring(i,str.length()-2).contains("x") && str.substring(i + 1,str.length()-1).contains("y")){
        return true;
    } return false; */

    /* Given two strings, a and b, create a bigger string made
    of the first char of a, the first char of b, the second char
    of a, the second char of b, and so on. Any leftover chars go
    at the end of the result.


    mixString("abc", "xyz") → "axbycz"
    mixString("Hi", "There") → "HTihere"
    mixString("xxxx", "There") → "xTxhxexre"*/

    /*public static String mixString(String a, String b) {
        int i;
        String res = "";
        if (a.length() >= b.length()) {
            for (i = 0; i < a.length() - 1; i++) {


            }

        }
        else if (b.length() > a.length()) {
            for (i = 0; i < b.length() - 1; i++) {

    }*/


/*    Given a string, consider the prefix string made of the first
N chars of the string. Does that prefix string appear somewhere else
in the string? Assume that the string is not empty and that N is
in the range 1..str.length().


    prefixAgain("abXYabc", 1) → true
    prefixAgain("abXYabc", 2) → true
    prefixAgain("abXYabc", 3) → false*/

    public static boolean prefixAgain(String str, int n) {
        //prefixAgain("abXYabc", 2) → true.

        for (int i = 1; i <= str.length() - n; i++) {
            if (str.substring(0, n).equals(str.substring(i, i + n))) {
                return true;
            }
        }
        return false;
    }

    /*Given a string, does "xyz" appear in the middle of the string?
    To define middle, we'll say that the number of chars to the left
    and right of the "xyz" must differ by at most one.


    xyzMiddle("AAxyzBB") → true
    xyzMiddle("AxyzBB") → true
    xyzMiddle("AxyzBBB") → false*/
    public static boolean xyzMiddle(String str) {

        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i).equals("x")) {

            }

        }
        return true;
    }

    /*A sandwich is two pieces of bread with something in between.
    Return the string that is between the first and last appearance
    of "bread" in the given string, or return the empty string ""
    if there are not two pieces of bread.


    getSandwich("breadjambread") → "jam"
    getSandwich("xxbreadjambreadyy") → "jam"
    getSandwich("xxbreadyy") → ""*/
    public static String getSandwich(String str) {
        String result = "";
        if (str.length() > 12) {
            for (int i = 0; i < str.length() - 4; i++) {
                if (str.substring(i, i + 5).equals("bread")) {
                    return str.substring(i + 5, str.lastIndexOf('b'));
                }
            }
        }
        return result + 1;
    }

    /*   Given a string, compute a new string by moving the first char
    to come after the next two chars, so "abc" yields "bca".
    Repeat this process for each subsequent group of 3 chars,
    so "abcdef" yields "bcaefd". Ignore any group of fewer than 3 chars at the end.


       oneTwo("abc") → "bca"
       oneTwo("tca") → "cat"
       oneTwo("tcagdo") → "catdog"*/
    public static String oneTwo(String str) {
        String result = "";
        for (int i = 0; i < str.length() - 2; i += 3) {
            result = result + str.substring(i + 1, i + 3) + str.substring(i, i + 1);

        }
        return result;
    }


    /*Look for patterns like "zip" and "zap" in the string -- length-3,
    starting with 'z' and ending with 'p'. Return a string where for all such words,
    the middle letter is gone, so "zipXzap" yields "zpXzp".


    zipZap("zipXzap") → "zpXzp"
    zipZap("zopzop") → "zpzp"
    zipZap("zzzopzop") → "zzzpzp" */
    public static String zipZap(String str) {
        String result = "";
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.charAt(i) == 'z' && str.charAt(i + 3) == 'p') {
                result = result + str.substring(i, i + 1);
            }
        }
        return result;

    }

 /* Given a string and a non-empty word string, return a version of the original
 String where all chars have been replaced by pluses ("+"), except for appearances of
 the word string which are preserved unchanged.


plusOut("12xy34", "xy") → "++xy++"
plusOut("12xy34", "1") → "1+++++"
plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"*/

/*    public static String plusOut(String str, String word) {
    String result = "";
    for (int i = 0;i < str.length(); i++){
        if (str.startsWith(word, i)){
            result = result + str.replace(0,str.substring(i)),"+");
        }

        }return result;
    }*/

/*    Given a string and a non-empty word string, return a string made of each char
just before and just after every appearance of the word in the string.
Ignore cases where there is no char before or after the word,
and a char may be included twice if it is between two words.


    wordEnds("abcXY123XYijk", "XY") → "c13i"
    wordEnds("XY123XY", "XY") → "13"
    wordEnds("XY1XY", "XY") → "11"*/

/*    public static String wordEnds(String str, String word) {
        String res = "";
        int sLen = str.length();
        int wLen = word.length();
        for (int i = 0; i < sLen-wLen+1; i++) {
        String tmp = str.substring(i,i+wLen);
            }
        } return res;
    }*/
}












