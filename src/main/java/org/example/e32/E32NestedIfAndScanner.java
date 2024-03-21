package org.example.e32;
/*
If age is above 25, then check if a user entered F then the output should be "Woman" otherwise it should say "Man"
If age is below 25, then check if a user entered F then the output should be "Girl" otherwise it should say "Boy"
 */
import java.util.Scanner;

public class E32NestedIfAndScanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your gender: M or F");
        char gender = scan.next().charAt(0);
        System.out.println(gender);
        System.out.println("Please enter your age");
        int age = scan.nextInt();

        if(age >= 25){
            if(gender == 'F'){
                System.out.println("Woman");
            }else{
                System.out.println("Man");
            }
        }else{
            if(gender == 'M'){
                System.out.println("Boy");
            }else{
                System.out.println("Girl");
            }
        }

    }
}
