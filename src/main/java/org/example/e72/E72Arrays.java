package org.example.e72;

import java.util.Scanner;

public class E72Arrays {
    public static void main(String[] args) {

        String[] days = new String[7];
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < 7; i++){
            System.out.println("Please enter day "+(i+1)+" of the week");
            days[i] = scan.nextLine();
        }
        for(String d: days){
            System.out.println(d);
        }

    }
}

