package org.example.e97;

import java.util.Scanner;

public class E97StringManipulations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the browser name to proceed further with execution");
        String input = scan.nextLine();
        String browser = input.substring(0,1).toUpperCase() + input.substring(1).toLowerCase();
        if(browser.equals("Chrome") || browser.endsWith("Firefox")){
            System.out.println("Proceed with "+browser+" browser");
        }else if(browser.equals("Ie")){
            System.out.println("Proceed with "+browser.toUpperCase()+" browser");
        }else{
            System.out.println("Invalid browser");
        }
    }
}