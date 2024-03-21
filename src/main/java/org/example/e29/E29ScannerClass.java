package org.example.e29;


import java.util.Scanner;

public class E29ScannerClass {
    public static void main(String[] args) {

        Scanner value = new Scanner(System.in);
        System.out.println("Please enter first number");
        int x = value.nextInt();
        System.out.println("Please enter second number");
        int y = value.nextInt();
        if((x * y) > 0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
