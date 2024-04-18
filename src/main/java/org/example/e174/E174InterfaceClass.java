package org.example.e174;
/*
Create an Interface  MyInterface which has two un-implemented method - m1 & m2
Now , create a Class which will implement the MyInterface .
We are expecting the output as below
**Output:**
implementation of method1
implementation of method2
 */
public class E174InterfaceClass{

    public static void main(String[] args) {
        Child obj = new Child();
        obj.m1();
        obj.m2();
    }
}
interface MyInterface{
     void m1();
     void m2();
}
class Child implements MyInterface {
    @Override
    public void m1(){
        System.out.println("implementation of method1");
    }
    @Override
    public void m2(){
        System.out.println("implementation of method2");
    }
}