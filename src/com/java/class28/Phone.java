package com.java.class28;


class Iphone extends Phone {
    void callSiri() {
        System.out.println("Iphone can call siri");
    }
    void takeSelfie() {
        System.out.println("Iphone can take selfie");
    }
    Iphone() {
        System.out.println("Parent IPhone ");
    }
}
class IphonePro extends Iphone {
    void rotate() {
        System.out.println("Iphone can rotate");
    }

    void bend() {
        System.out.println("Iphone can bend");
    }

    IphonePro() {
        System.out.println("Child Iphone Pro ");
    }
}

public class Phone {
    void call() {
        System.out.println("Phone is calling");
    }

    void text() {
        System.out.println("Phone is texting");
    }

    Phone() {
        System.out.println("GrandPa Phone");
    }

    public static void main(String[] args) {
        IphonePro newIphone = new IphonePro();
        newIphone.call();
        newIphone.text();
        newIphone.callSiri();
        newIphone.takeSelfie();
        newIphone.rotate();
        newIphone.bend();



    }
}
