package com.java.class32;

class Phone{
    private String model;
    private String brand;
    private String color;
    private int memory;

    public int getMemory(){ // Getter
        return memory;
    }
    public void setMemory(int memory){ //Setter
        this.memory=memory;
    }
}

public class GetterSetterExample {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.setMemory(6000);
        System.out.println(p.getMemory());
    }
}
