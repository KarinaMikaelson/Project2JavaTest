package org.example.e45;

import java.util.Scanner;

public class E45SwitchStatment {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Input a number between 1-7");
        int number = scan.nextInt();
        String day = String.valueOf(number);
        switch (number){
            case 1:
                day = "Monday";
                 break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = "Invalid";

        }
        System.out.println(day);
    }

}
