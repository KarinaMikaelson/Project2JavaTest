package org.example.e155;

public class E155SuperKeyword {
    public static void main(String[] args) {
        C c = new C();
    }
}
class A{
    A(){
        System.out.println("I");
    }
}
class B extends A{
    B(){
        System.out.println("am");
    }
}
class C extends B{
    C(){
        System.out.println("a tester");
    }
}

