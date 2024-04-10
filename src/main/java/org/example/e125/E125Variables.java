package org.example.e125;

public class E125Variables{
    static int number;

    public static void main(String[] args) {
        number = 200;
        E125Variables obj = new E125Variables();
        obj.number = 200;
        System.out.println(E125Variables.number);
        System.out.println(obj.number);
    }
}
