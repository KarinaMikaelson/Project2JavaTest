package org.example.e21;

import java.util.Scanner;

public class E21ScannerClass {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your age ");
        int age=scan.nextInt();
        int newAge=age+10;
        System.out.println("Your age after 10 years is "+newAge);
    }
}

