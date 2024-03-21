package org.example.e83;

public class E83NestedForLoops {
    public static void main(String[] args) {

        int rows = 5;
        int colums = 10;
        int [][] pattern = new int[rows][colums];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < colums; j++){
                pattern[i][j] = (i+1)*(j+1);
            }

        }
        for(int i = 0; i < rows; i++){
            for(int j =0; j < colums; j++){
                System.out.print(pattern[i][j]+" ");
            }
            System.out.println();
        }

    }
}
