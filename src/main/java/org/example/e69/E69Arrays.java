package org.example.e69;
/*
Write a program that creates an array of strings with the following values{"This",
"is", "array", "of", "strings"} and prints all values in one line.

 */
public class E69Arrays {
    public static void main(String[] args) {

        String[] strings = {"This", "is", "array", "of", "strings"};
        // Print all values in one line
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i]+" ");
        }
    }
}
