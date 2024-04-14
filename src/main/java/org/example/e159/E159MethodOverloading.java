package org.example.e159;

public class E159MethodOverloading {
    public static int subtract(int a, int b){
        return a - b;
    }
    public static int subtract(int a, int b, int c){
        return a - b - c;
    }
    public static int subtract(int a, int b, int c, int d){
        return a - b - c - d;
    }
    public static void main(String[] args) {
        System.out.println(subtract(50,5,3,2));
        System.out.println(subtract(50,15,5));
        System.out.println(subtract(30,10));
    }
}



