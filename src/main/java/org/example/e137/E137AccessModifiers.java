package org.example.e137;

public class E137AccessModifiers {
    private static String name;
    protected static String city;
    public static String nameOfSchool;
    static int batch;
    static void displayDetails(String name, String city, String nameOfSchool, int batch){
        System.out.println("My name is "+name+" and I live in "+city+". I study at "+nameOfSchool+" in batch "+batch);
    }
    public static void main(String[] args) {
        displayDetails("John","Miami","Syntax",9);
    }
}

