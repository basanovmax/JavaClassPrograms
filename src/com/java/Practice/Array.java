package com.java.Practice;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        String[] friendsArray = new String[4];
        String[] friendsArray2 = {"Max", "Bator", "Bair", "Zorik"};

        ArrayList<String> friendsArrayList = new ArrayList<>();
        ArrayList<String> friendsArrayList1 = new ArrayList<>(Arrays.asList("Max", "Bator", "Bair", "Zorik"));

        System.out.println("====================");

        int list[] = {78, 8, 7, -2, 14, 3};

        for (int i = 0; i < list.length / 2; i++) {
            int j = list.length - 1 - i;
            swap(list, i, j);
        }

        System.out.println("====================");
        System.out.println(reverse("Mississippi"));
        System.out.println("====================");

        Point [] points = new Point[3];
        points[0] = new Point(1,2);
        points[1] = new Point(3,4);
        points[2] = new Point(5,6);

        Point point[] = {new Point(1,2), new Point(3,4), new Point(5,6)};


    }

    public static void swap(int[] list, int i, int j) {
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }

    public static String reverse(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            result = text.charAt(i) + result;
        } return result;
    }
    public static void rotateLeft(int list[]){
        int first = list[0];
        for(int i = 0; i < list.length-1;i++){
            list[i]=list[i+1];
        }
        list[list.length-1]=first;
    }
}
