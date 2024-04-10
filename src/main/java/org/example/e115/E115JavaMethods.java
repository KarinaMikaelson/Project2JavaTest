package org.example.e115;
/*
Create a method that will accept a String as a parameter and return new String all in upper case
Call method
TEST
 */
public class E115JavaMethods {
    public static String toUpperCase(String input){
        return input.toUpperCase();
    }
    public static void main(String[] args) {
        String original = "tEsT";
        String upperCase = toUpperCase(original);
        System.out.println(upperCase);
    }
}
