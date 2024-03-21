package org.example.e30;


import java.util.Scanner;

public class E30ScannerClass {
    public static void main(String[] args) {
        Scanner month = new Scanner(System.in);
        //DO NOT CHANGE ABOVE CODE!  Write your code below
        System.out.println("Please enter month number");
        int number = month.nextInt();
        if(number == 1){
            System.out.println("January");
        }else if(number == 2){
            System.out.println("February");
        }else if(number == 3){
            System.out.println("March");
        }else if(number == 4) {
            System.out.println("April");
        }else if(number == 5) {
            System.out.println("May");
        }else if(number == 6) {
            System.out.println("June");
        }else if(number == 7) {
            System.out.println("July");
        }else if(number == 8) {
            System.out.println("August");
        }else if(number == 9) {
            System.out.println("September");
        }else if(number == 10) {
            System.out.println("October");
        }else if(number == 11) {
            System.out.println("November");
        }else if(number == 12) {
            System.out.println("December");
        }else{
            System.out.println("Invalid");
        }
    }
}
