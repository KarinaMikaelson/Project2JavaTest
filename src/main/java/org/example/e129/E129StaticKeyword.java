package org.example.e129;

public class E129StaticKeyword {
    static String countryName = "Morocco";
    static String continent = "Africa";
    static void displayValue(){
        System.out.println(countryName+" located on "+continent+" continent");
    }
    public static void main(String[] args) {
        displayValue();
    }
}
