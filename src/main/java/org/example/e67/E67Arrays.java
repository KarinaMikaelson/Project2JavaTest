package org.example.e67;
/*
Write a program that creates an array of integers that stores the
following values: 45, 78, 12, 67, 55, 89, 23, 77, 88
Print only values that stored with even index including 0.
 */
public class E67Arrays {
    public static void main(String[] args) {

        int [] values= {45, 78, 12, 67, 55, 89, 23, 77, 88};
        for(int i = 0; i < values.length ; i+=2){
                System.out.print(values[i]+" ");
        }

    }
}

