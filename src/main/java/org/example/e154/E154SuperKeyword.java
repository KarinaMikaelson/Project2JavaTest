package org.example.e154;

public class E154SuperKeyword {
    public static void main(String[] args) {
        Child child = new Child();
        Child child1 = new Child(10);
    }
}
class Parent{
    public Parent(){
        System.out.println("Parent Constructor without argument");
    }
    public Parent(int number){
        System.out.println(number);
    }
}
class Child extends Parent{
    public Child(){
        System.out.println("Child Constructor without argument");
    }
    public Child(int number){
        super(number);
    }
}
