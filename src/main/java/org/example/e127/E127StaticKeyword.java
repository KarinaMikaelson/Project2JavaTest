package org.example.e127;

public class E127StaticKeyword {
    void printNonStatic(){
        System.out.println("Programming is amazing.");
    }
    static void printStatic(){
        System.out.println("Java is awesome.");
    }
    public static void main(String[] args) {
        //non-static
        E127StaticKeyword obj = new E127StaticKeyword();
        obj.printNonStatic();

        //static
        printStatic();
    }
}