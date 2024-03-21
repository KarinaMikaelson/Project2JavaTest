package org.example.e79;
/*
Write a program that calculates the sum of elements from each row in a
2D array and adds them into array of integers
For example, if we run rowSums for the following 2D array:
 */
public class E79Arrays {
    public static void main(int[][] args) {
        //please write the code from here
        int [][] array2D = {
                {1,1,2},
                {3,1,2},
                {3,5,3},
                {0,1,2}
        };
        int numRows = array2D.length;
        int[] rowSums = new int[numRows];
        for(int i = 0; i < numRows; i++){
            int sum = 0;
            for(int num: array2D[i]){
                sum = sum + num;
            }
            rowSums[i] = sum;

        }
        for(int sum: rowSums){
            System.out.println(sum);
        }
    }
}

