package com.company;

public class SportCar extends Car {

    public SportCar() {
        System.out.println("Konstruktor klasy SportCar");
    }

    @Override
    void go() {
        //super.go();

        System.out.println("Jedz klaso SportCar");
    }

    void turbo(){
        System.out.println("Bardzo głośny ryk silnika");
    }
}
