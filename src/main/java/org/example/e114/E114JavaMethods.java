package org.example.e114;

public class E114JavaMethods {

    public static int add(int num1, int num2){
        return num1 + num2;
    }
    public static int multiply(int num1, int num2){
        return num1 * num2;
    }
    public static int subtract(int num1, int num2){
        return num1 - num2;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 3;
        int resultMultiplication = multiply(num1,num2);
        int resultAddition = add(20,10);
        int resultSubtraction = subtract(30,10);
        System.out.println("Addition "+resultAddition+" ");
        System.out.println("Multiplication "+resultMultiplication+" ");
        System.out.println("Subtraction "+resultSubtraction+" ");
    }

}
