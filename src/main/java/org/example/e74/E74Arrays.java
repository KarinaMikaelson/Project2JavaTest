package org.example.e74;

import java.util.Scanner;


public class E74Arrays {
    public static void main(String[]args){

        int [] numbers = new int[5];
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            numbers[i] = scan.nextInt();
        }
        for( int n:numbers){
            System.out.println(n *10);
        }
        scan.close();
    }
}
