package org.example.e44;

import java.util.Scanner;

public class E44SwitchStatment {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your favorite car make");
        String carMake = scan.nextLine();
        switch (carMake.toLowerCase()){
            case "bmw":
                carMake = "german car";
                break;
            case "toyota":
                carMake = "japanese car";
                break;
            case "maserati":
                carMake = "italian car";
                break;
            default:
                carMake = "unknown";
        }
        System.out.println("Your favorite car is "+carMake);
    }
}
