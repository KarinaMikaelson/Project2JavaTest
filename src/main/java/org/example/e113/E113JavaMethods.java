package org.example.e113;

public class E113JavaMethods {
    static int hours;
    static int minutes;
    public static void printTime(){
        System.out.println(hours+":"+minutes);
    }
    public static void main(String[] args) {
        E113JavaMethods time = new E113JavaMethods();
        time.hours = 11;
        time.minutes = 30;
        time.printTime();
    }
}

