package org.example.e171;

public class E171AbstractClass {
    public static void main(String[] args){
        Child child = new Child();
        child.m1();
        child.m1("myString");
    }
}
abstract class Parent{
    abstract void m1();
    void m1(String myString){
        System.out.println("m1 method with parameter");
    }
}
class Child extends Parent{

    @Override
    void m1(){
        System.out.println("m1 without parameters");
    }
}




