package com.tw.polymorphism.methodOverrding;

public
class Car {
    public void m1(){
        System.out.println("m1");
    }
}
class Bike extends Car{
    public void m1(){
        System.out.println("m2");
    }
}
class Odui extends Bike{
    public void m1(){
        System.out.println("m3");
    }
}
class Test{
    public static
    void main(String[] args) {
        Odui odui = new Odui();
        odui.m1();
        Bike bike = new Bike();
        bike.m1();
        Car car = new Car();
        car.m1();
    }
}