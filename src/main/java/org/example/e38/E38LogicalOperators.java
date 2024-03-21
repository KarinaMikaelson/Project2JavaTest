package org.example.e38;

import java.util.Scanner;

public class E38LogicalOperators {
    //Note: When you are done with coding comment these two prints to successfully pass your test
    // System.out.println("Is it weekend?");
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //System.out.println("Is it weekend?");
        boolean isWeekend = scan.nextBoolean();
        String subject = "manual testing";
        if(isWeekend){
            subject = "Java";
            System.out.println("Today you will be learning "+subject);
        }else{
            System.out.println("Today you will be learning "+subject);
        }
    }
}
