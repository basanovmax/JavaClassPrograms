package com.java.Practice;

public class WhileDoWhileLoop {
    public static void main(String[] args) {
        int num = 1;
        while (num < 200) {

            System.out.println(num*=2);
        }

        //Palindrome or not

        String pol = "abcaa";
        int i = 0;
        int j = pol.length()-1;

        while(i<j){
            if(pol.charAt(i)!=pol.charAt(j)){
                System.out.println(pol + " is Not palindrome");
                System.exit(0);
            }
            i++;
            j--;
        }System.out.println(pol +  " is Palindrome");


    }
}
