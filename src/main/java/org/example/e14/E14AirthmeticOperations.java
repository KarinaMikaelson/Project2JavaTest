package org.example.e14;

public class E14AirthmeticOperations {
    public static void main(String[] args) {

        int num1=26;
        int num2=12;
        int num3=4;
        int num4=18;
        int num5=14;
        int num6=6;
        int result1=(num1+num2)-num3;
        int result2=(num4*num5)/num6;
        int blank3=(result2%result1);
        System.out.print(result2+" modded by "+result1+" is "+blank3);
    }
}
