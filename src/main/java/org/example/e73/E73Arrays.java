package org.example.e73;

import java.util.Scanner;

public class E73Arrays {
    public static void main(String[] args){

        int [] numbers = new int [5];
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < 5; i ++){
            numbers[i] = scan.nextInt();
        }
        for(int i = numbers.length - 1; i >= 0; i--){
            System.out.println(numbers[i]);
        }
        scan.close();
    }

}