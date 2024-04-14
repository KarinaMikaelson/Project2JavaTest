package org.example.e157;

public class E157SuperKeyword {
    public static void main(String[] args) {
        Child child = new Child();
        child.m2();
    }
}
class Parent{
    public void m1(){
        System.out.println("m1 method in parent class");
    }
}
class Child extends Parent{
    public void m1(){
        System.out.println("m1 method in child class");
    }
    public void m2(){
        m1();
        super.m1();
    }
}


