package org.example.e26;


import java.util.Objects;
import java.util.Scanner;

public class E26ScannerClass {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("In:");
        String name = inp.nextLine();
        //DO NOT CHANGE ABOVE CODE!  Write your code below
        if(name.equals("Chen")){
            System.out.println("teacher");
        }else{
            System.out.println("student");
        }

    }
}
