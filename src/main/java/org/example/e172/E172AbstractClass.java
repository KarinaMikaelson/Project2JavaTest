package org.example.e172;
/*
Create a Parent Class in which you will have 1 implemented method m2 and 1 unimplemented method m1
Make Main class to be a derived class from Parent.
In main method execute both methods
**Output:**
Child class providing implementation
Parent class providing implementation
 */
public class E172AbstractClass extends Parent {
    @Override
    void m1(){
        System.out.println("m1 without parameters");
    }
    public static void main(String[] args){
        E172AbstractClass c = new E172AbstractClass();
        c.m1();
        c.m2();

    }
}
abstract class Parent{
    abstract void m1();
    void m2(){
        System.out.println("m1 method with parameter");
    }

}





