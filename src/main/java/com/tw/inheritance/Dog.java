package com.tw.inheritance;

public
class Dog {
    public
    void run() {
        System.out.println("Hello Dog");
    }
}

class Cat extends com.tw.inheritance.Dog {
    public
    void eat() {
        System.out.println("Hello Cat");
    }
}

class Monkey extends Cat {
    public static
    void main(String[] args) {
        Monkey monkey = new Monkey();
        monkey.jump();
        monkey.run();
        monkey.eat();
    }

    public
    void jump() {
        System.out.println("Hello Monkey");
    }
}


