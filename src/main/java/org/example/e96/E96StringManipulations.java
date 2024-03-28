package org.example.e96;

import java.util.Scanner;

public class E96StringManipulations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any programming language");
        String language = scan.nextLine();
        if(language.equals("Java")){
            System.out.println(language+" is a programming language");
        }else if(language.equals("C")){
            System.out.println(language+" is a procedural programming language");
        }else if(language.equals("C++")){
            System.out.println(language+" is a middle-level programming language");
        }else{
            System.out.println("Doesn't match any programming language");
        }
    }
}




