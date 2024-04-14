package org.example.e162;

public class E162MethodOverloading {
    static void m1(){
        System.out.println("static method without parameter");
    }
    static void m1(int num){
        System.out.println("static method with int parameter");
    }
    public static void main(String[] args) {
        E162MethodOverloading obj = new E162MethodOverloading();
        obj.m1();
        obj.m1(2);
    }
}


