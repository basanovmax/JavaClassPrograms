package com.java.Practice;

public class practice1 {
    public static void main(String[] args) {

        int[] mas = new int[]{1, 2, 3};
        multiElements(mas, 10);
        for (int i = 0; i < mas.length; i++) {
            System.out.println(mas[i] + ", ");
        }

        int word = getStrLength("Maxim");
        System.out.println(word);


        String result = "  AniMal  ".trim().toLowerCase().replace('a','A');

        System.out.println(result);

        String str = "Hello World!";
        String str1 = "I am from Seattle";
        System.out.println("Length of str = " + str.length());
        System.out.println("Length of str1 = " + str1.length());
    }

    public static void multiElements(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= value;

            System.out.print(array[i]+ ", ");
        }
    }

    public static int getStrLength (String str) {
        int strLength = str.length();
        return strLength;
    }


}
