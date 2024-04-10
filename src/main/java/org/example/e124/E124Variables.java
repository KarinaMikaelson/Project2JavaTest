package org.example.e124;

public class E124Variables {
    static String ss = "Welcome To Syntax Technologies";
    void callByObject(){
        System.out.println(ss);
    }

    public static void main(String[] args) {
        //By calling directly
        System.out.println(ss);

        //By using the className
        System.out.println(E124Variables.ss);

        //By creating the object of the class
        E124Variables obj = new E124Variables();
        obj.callByObject();

    }
}
