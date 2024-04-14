package org.example.e149;
/*
Create Three classes (Main, A, B):
Have a method that prints out the following
For A: "Class A"
For B: "Class B"
Make B extend A
From your Main class create an object of the B class and call the methods.
**Output:**
Class A
Class B
 */
public class E149Inheritance {
    public static void main(String[] args) {
        A a = new A();
        a.print();
        B b = new B();
        b.print();
    }
}
class A{
    public void print(){
        System.out.println("Class A");
    }
}
class B extends A{
    @Override
    public void print(){
        System.out.println("Class B");
    }

}