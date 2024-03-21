package org.example.e59;
/*
Write a program that prints the string "Hey, it is year: " and the years between 2011 and 2019.
Must include year 2019 in the output
 */
public class E59ForLoop {
    public static void main(String[] args) {

        String year = "Hey, it is year:";
        for(int i = 2011; i <= 2019; i++){
            System.out.println(year);
            System.out.println(i);
        }
    }
}
