package org.example.e35;

import java.util.Scanner;

public class E35LogicalOperators {
    //Note: When you are done with coding comment these two prints to successfully pass your test

    //System.out.println("Do you need a loan? (true/false)");
    // System.out.println("What is your credit score?");
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Prompt the user with the question: "Do you need a loan?"
        //System.out.print("Do you need a loan?");
        boolean needLoan = scanner.nextBoolean();


        // Check if the user needs a loan
        if (needLoan) {
            // Prompt the user with the question: "What is your credit score?"
            //System.out.print("What is your credit score? ");
            int creditScore = scanner.nextInt();

            // Determine the eligibility based on the credit score
            if (creditScore < 600) {
                System.out.println("The eligibility is Not eligible");
            } else if (creditScore >= 600 && creditScore <= 700) {
                System.out.println("The eligibility is Maybe eligible");
            } else if (creditScore >= 701 && creditScore <= 800) {
                System.out.println("The eligibility is Eligible");
            } else {
               System.out.println("The eligibility is Definitely eligible");
            }
        }else{
            System.out.println("The eligibility is Unknown");
        }

        // Close the scanner
        scanner.close();
    }
}
