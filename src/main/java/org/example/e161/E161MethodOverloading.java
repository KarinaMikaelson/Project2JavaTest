package org.example.e161;

public class E161MethodOverloading {
    private static void m1(){
        System.out.println("private m1 method ");
    }
    private static void m1(int number){
        System.out.println("private m1 method with int parameter");
    }
    public static void main(String[] args) {
        E161MethodOverloading obj = new E161MethodOverloading();
        obj.m1();
        obj.m1(0);
    }
}


