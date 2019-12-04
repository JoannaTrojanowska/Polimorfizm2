package com.company;

public class Car extends Vehicle {

    public Car() {
        System.out.println("Konstruktor klasy Car");
    }

    @Override
    void go() {
        //super.go();
        System.out.println("Jedz klaso Car");
    }

    void horn(){
        System.out.println("Beep beep");
    }
}


