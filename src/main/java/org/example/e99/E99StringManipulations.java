package org.example.e99;

import java.util.Scanner;

public class E99StringManipulations {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("");
            String input = scan.nextLine();
            String processed = input.replaceAll("\\s","").toLowerCase();
            StringBuilder st = new StringBuilder(processed);
            st.reverse();
            String reversedString = st.toString();

            if(processed.equals(reversedString)){
                System.out.println("In:true");
            }else{
                System.out.println("In:false");
            }
    }
}

