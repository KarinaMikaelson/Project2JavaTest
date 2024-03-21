package org.example.e28;

import java.util.Scanner;

public class E28ScannerClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the length");
        int length = scan.nextInt();
        System.out.println("Please enter the width");
        int width = scan.nextInt();
        if(length == width){
            System.out.println("The shape of your object is square");
        }else{
            System.out.println("The shape of your object is rectangle");
        }
    }
}
