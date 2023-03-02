package com.java.class29;

class Drinks {

}

class HotDrinks {
    HotDrinks() {
        System.out.println("Hot Drinks");
    }
}

class Tea extends HotDrinks {
    Tea() {
        this("original");   // this has to be first statement only
        System.out.println("Prep Tea");
    }

    Tea(String flavour) {
        this("Masala", true); // this has to be first statement only
        System.out.println("Prep Tea with " + flavour);
    }

    Tea(String flavour, boolean withSugar) {
        System.out.println("Prep Tea with " + flavour);
    }
}

public class ThisAndSuperWithConstructor {
    public static void main(String[] args) {

        Tea tea = new Tea();
    }
}

