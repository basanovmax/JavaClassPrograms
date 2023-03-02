package com.java.class05;

public class IncrementDecrementExamples {
    public static void main(String[] args) {


        double gasPrice = 3.99;
        gasPrice++;
        System.out.println(gasPrice);

        int num = 1;
        int y = num++;
        System.out.println(num);
        System.out.println(y);

        int x = 1;
        int w = ++x;
        System.out.println(w);
        System.out.println(x);

        int z = 10;
        int r = z++;
        System.out.println(r); //10
        System.out.println(z); //10

        System.out.println(z++); //11
        System.out.println(z); //12

        // post increment/
        int u = 11;
        int q = u++; // q = 12; u = 12;
        int t = q++; // t= 11
        System.out.println(u);
        System.out.println(q);
        System.out.println(t);


        int ab = 50;
        int ac = ab++; // ac=50, ab=51;
        int ad = ++ab; //ad = 52, ab = 52;
        System.out.println(ad++); //52
        System.out.println(++ab); //53

        System.out.println(ab++); //53
        System.out.println(ab++); //54

        int var1 = 20;
        System.out.println(var1++); //print 20; var1 = 21
        System.out.println(++var1); //print 22; var1 = 22;

        int var2 = var1++; //var2 = 22, var1 = 23;
        int var3 = ++var1; //var3= 24, var1 = 24;

        System.out.println(var1); //24
        System.out.println(var2); //22
        System.out.println(var3);//24
    }
}
