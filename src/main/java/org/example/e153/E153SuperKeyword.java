package org.example.e153;

public class E153SuperKeyword {
    public static void main(String[] args) {
        Child child = new Child();
    }
}
class Parent{
    public Parent(){
        System.out.println("This is Parent constructor");
    }
}
class Child extends Parent{
    public Child(){
        super();
    }
}
