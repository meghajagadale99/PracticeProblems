package com.tw.inheritance;

public
class Vehicle {
    public
    void park() {
        System.out.println("Hello Park The Car");
    }
}

class Car extends Vehicle {
    public
    void start() {
        System.out.println("Hello Engine");
    }
}

class Bike extends Vehicle {
    public
    void stop() {
        System.out.println("Hello Engine");
    }

    public static
    void main(String[] args) {
        Bike bike = new Bike();
        bike.stop();
        bike.park();
        Car car = new Car();
        car.start();
        car.park();
        Vehicle vehicle = new Vehicle();
        vehicle.park();
    }

}
