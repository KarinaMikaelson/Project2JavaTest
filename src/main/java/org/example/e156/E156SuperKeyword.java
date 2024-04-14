package org.example.e156;

public class E156SuperKeyword {
    public static void main(String[] args) {
        B b = new B();
        b.display();
    }
}
class A{
    int i=10;
}
class B extends A{
    int i=20;
    public void display(){
        System.out.println(i);
        System.out.println(super.i);
    }
}

