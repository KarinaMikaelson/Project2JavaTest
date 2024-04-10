package org.example.e120;

public class E120Variables {

    int year;
    String schoolName;
    int batch;
    public static void main(String[] args) {
        E120Variables s = new E120Variables();
        s.year = 2020;
        s.schoolName = "Syntax";
        s.batch = 6;
        System.out.println("I am a student of batch "+s.batch+" studying at "+s.schoolName+" in the year of "+s.year);


    }
}