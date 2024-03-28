package org.example.e95;


import java.util.Scanner;

public class E95StringManipulations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("");
        String word = scan.nextLine();
        String result = word.substring(0, word.length()-(3));
        System.out.println("The first 3 letters of "+word+" is "+result);
    }
}
