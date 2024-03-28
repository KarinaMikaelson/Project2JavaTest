package org.example.e110;

public class E110JavaMethods {
    void newLine(){
        System.out.println("newLine method implementation");
    }
    void displayLine(){
        System.out.println("displayLine method implementation");
    }

    public static void main(String[] args) {
        E110JavaMethods str = new E110JavaMethods();
        str.newLine();
        str.displayLine();
    }
}
