package com.tw.polymorphism.methodOverlodding;

public
class Megha {
    public void m1(int a){
        System.out.println("hello 1");
    }
//    public void m1(int a,int b){
//        System.out.println("hello 2");
//    }
    public void m1(int a,float b){
        System.out.println("hello 3");
    }
    public void m1(float a,int b){
        System.out.println("hello 4");
    }
    public float m1(float a, float b){
      return a+b;
    }
     public static void m1(){
         System.out.println("hello 5");
     }
    public static
    void main(String[] args) {
        Megha megha = new Megha();
        megha.m1(10F,10);
    }
}
