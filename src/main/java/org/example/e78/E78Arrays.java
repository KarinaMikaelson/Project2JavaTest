package org.example.e78;
/*
Write a program that will print the sum of all elements in 2D array.
**Expected Output:**
-9
 */
public class E78Arrays {
    public static void main(int[][] args) {
        //write the code from here
        int [][] array2d = {
                {1, 2, 3},
                {-4, -5, -6}
        };
        int sum = 0;
        for(int [] row:array2d){
            for(int line:row){
                sum = sum+line;
            }
        }
        System.out.println(sum);
    }
}
