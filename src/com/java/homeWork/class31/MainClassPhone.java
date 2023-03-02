package com.java.homeWork.class31;

public class MainClassPhone {
    public static void main(String[] args) {


    AndroidPhone android = new AndroidPhone();
    IPhone iphone = new IPhone();
    ServiceCenter service = new ServiceCenter();

    service.servicePhone(iphone);
    service.servicePhone(android);
    }

}
