package org.example.e101;

import java.util.Scanner;

public class E101StringManipulations {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below

        // Loop through the characters of the word, starting with the first letter
        for (int i = 0; i < word.length(); i += 2) {
            System.out.print(word.charAt(i));
        }
    }
}
