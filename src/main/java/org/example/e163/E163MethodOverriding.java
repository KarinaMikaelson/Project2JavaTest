package org.example.e163;

public class E163MethodOverriding {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.method();
        Child child = new Child();
        child.method();
    }
}
class Parent{
    public void method(){
        System.out.println("Parent method");
    }
}
class Child extends Parent{
    public void method(){
        System.out.println("Child method");
    }
}
