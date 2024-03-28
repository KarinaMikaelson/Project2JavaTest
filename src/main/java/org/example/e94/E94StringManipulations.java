package org.example.e94;

public class E94StringManipulations {
    public static void main(String[] args) {
        String given = "I love Java classes at Syntax";
        String string1 = given.substring(0,11);
        String string2 = given.substring(11);

        System.out.println(string2.trim());
        System.out.println(string1);


    }
}
