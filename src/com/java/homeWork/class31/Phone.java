package com.java.homeWork.class31;
/*Task 1:
        Create a Base Class called Phone (with methods - call(), text(), and repair() )
        Create two child classes AndroidPhone and IPhone & override repair() method from the Phone class
Create another class called ServiceCenter with the method servicePhone()
        Create a MainClass with objects of AndroidPhone, IPhone and ServiceCenter
        Using ServiceCenter class object call servicePhone() method and pass an object of androidPhone or iPhone
        servicePhone() method will call repair() method AndroidPhone or IPhone class based on the object we are passing*/

class Phone {
    void call(){}
    void text(){}
    void repair(){
        System.out.println("Phone repair - Parent");
    }}
class AndroidPhone extends Phone {
    @Override
    void repair(){
        System.out.println("Android repair - Child");
    }}
class IPhone extends Phone{
    @Override
    void repair(){
        System.out.println("Iphone repair - Child");
    }
}class ServiceCenter {
    void servicePhone(IPhone iphone14){
       iphone14.repair();}
    void servicePhone(AndroidPhone Samsung){
       Samsung.repair();}
}