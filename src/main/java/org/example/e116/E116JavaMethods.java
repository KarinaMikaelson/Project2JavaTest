package org.example.e116;

public class E116JavaMethods {
    public static boolean bothEven(int num1, int num2){
        return num1 % 2 == 0 && num2 % 2 == 0;
    }
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 4;
        boolean result = bothEven(num1,num2);
        System.out.println(result);
    }
}


