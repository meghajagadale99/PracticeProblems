package com.tw.abstraction;

public
 abstract class Bank {
    public abstract
    void m1();

    public
    void m2() {
        System.out.println("Hello");
    }
}
class Kotak extends Bank{
    @Override
    public
    void m1() {
        System.out.println("Child class m1");
    }

    public void m3(){
        System.out.println("M3");
    }
}
class Test extends Bank{

    @Override
    public
    void m1() {
        System.out.println("Megha");
    }

    public static
    void main(String[] args) {
        Bank bank=new Test();
        bank.m1();
        bank.m2();
        Kotak kotak = new Kotak();
        kotak.m1();
        kotak.m2();
        kotak.m3();
        Bank bank1=new Kotak();
        bank1.m2();
        bank1.m1();
        Bank bank2 = new Test();
        bank2.m1();
        bank2.m2();
    }
}