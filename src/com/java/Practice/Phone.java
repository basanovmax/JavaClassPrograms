package com.java.Practice;

class PhoneMain{
    public static void main(String[] args) {
        Phone phone = new Phone();
        AndroidPhone android = new AndroidPhone();
        Iphone iphone = new Iphone();
        ServiceCenter service = new ServiceCenter();


        service.servicePhone(iphone);
        service.servicePhone(android);
        service.servicePhone(phone);

    }
}
class Phone {
    void call(){
    }
    void text(){
    }
    void repair(){
        System.out.println("Phone repair Parent");
    }
}
class AndroidPhone extends Phone{
    @Override
    void repair(){
        System.out.println("AndroidPhone repair Child");
    }
}
class Iphone extends Phone{
    @Override
    void repair(){
        System.out.println("Iphone repair Child");
    }
}
class ServiceCenter {
    void servicePhone(Iphone pro){
        pro.repair();
        System.out.println("Service");
    }

    void servicePhone(AndroidPhone Zzz){
        Zzz.repair();
        System.out.println("Service");
    }
    void servicePhone(Phone Zzz){
        Zzz.repair();
        System.out.println("Service");
    }

}
