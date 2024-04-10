package org.example.e117;

public class E117JavaMethods {
    public static int sumEvenToX(int x){
        int sum = 0;
        for(int i = 2; i <= x; i += 2){
            sum = sum + i;
        }
        return sum;


    }
    public static void main(String[] args) {
        System.out.println(sumEvenToX(5));
        System.out.println(sumEvenToX(8));
    }

}
