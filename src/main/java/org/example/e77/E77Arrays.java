package org.example.e77;
/*
Write a program that prints the highest value in the array.
input [5,4,8]
Output: 8
 */

public class E77Arrays {
    public static void main(int[] args) {
        //write code from here
        int [] array = {5, 4, 8};
        int maxNum = 0;
        for(int i = 1; i < array.length; i++){
            if(array[i]>maxNum){
                maxNum = array[i];
            }
        }
        System.out.print(maxNum);
    }
}