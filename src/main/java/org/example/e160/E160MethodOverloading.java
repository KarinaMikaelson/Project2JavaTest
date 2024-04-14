package org.example.e160;

public class E160MethodOverloading {
    public static void display(int years){
        System.out.println(years);
    }
    public static void display(String school){
        System.out.println(school);
    }
    public static void display(double salary){
        System.out.println(salary);
    }
    public static void main(String[] args){
        E160MethodOverloading obj = new E160MethodOverloading();
        obj.display(100);
        obj.display("Syntax Technologies");
        obj.display(100.09);
    }
}

