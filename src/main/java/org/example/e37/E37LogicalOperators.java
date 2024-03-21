package org.example.e37;

import java.util.Scanner;

public class E37LogicalOperators {
    //Note: When you are done with coding comment these two prints to successfully pass your test

    //System.out.println("Are you thirsty?");
    // System.out.println("Are you sleepy?");

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //System.out.println("Are you thirsty?");
        boolean isThirsty = scan.nextBoolean();
        //System.out.println("Are you sleepy?");
        boolean isSleepy = scan.nextBoolean();

        String drink = "nothing";
        if(isThirsty && !isSleepy){
            drink = "water";
            System.out.println("Looks like you need to drink "+drink);
        }else if(isThirsty && isSleepy){
            drink = "coffee";
            System.out.println("Looks like you need to drink "+drink);
        }else if(!isThirsty && isSleepy){
            drink = "tea";
            System.out.println("Looks like you need to drink "+drink);
        }else {
            System.out.println("Looks like you need to drink " + drink);
        }
    }

}
