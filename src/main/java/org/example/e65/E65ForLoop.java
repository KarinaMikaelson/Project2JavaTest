package org.example.e65;
/*
Write a for loop that will print out a series of numbers
starting at one less than x and ending at 0.
 */
import java.util.Scanner;

public class E65ForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //System.out.print("In:");
        int x = input.nextInt();
        for(int i = x-1; i >= 0; i--){
            System.out.print(i+" ");
        }

    }
}
