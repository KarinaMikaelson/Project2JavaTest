package org.example.e104;

import java.util.Scanner;

public class E104StringManipulations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        System.out.print("");

        for (int i = 0; i < arr.length; i++) {
        String name = input.nextLine();
            while (name.length() < 3) {
                System.out.println("Name must be at least 3 characters long.");
                name = input.nextLine();
            }
            arr[i] = name;
        }
        for (String name : arr) {
            System.out.println(name.substring(0, 3));
        }
    }
}





