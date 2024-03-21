package org.example.e81;
/*
Write a program that sums all numbers that are on even index and on even row.
for example -3 is both negative and odd
-4
 */
public class E81Arrays {
    public static void main(int[][] args) {
        //write the code from here
        int [][] array2D = {
                {-1, 2, -3},
                {4, -5, 6},
                {-7, 8, -9}
        };
        int sum = 0;
        for(int i = 0; i < array2D.length; i++){
            if(i % 2 == 0){
                for(int j = 0; j < array2D[i].length; j++){
                    if(j % 2 == 0){
                        sum = sum + array2D[i][j];
                    }
                }
            }
        }
          System.out.println(sum);

    }
}
