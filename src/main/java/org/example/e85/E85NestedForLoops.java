package org.example.e85;
      /*
        Write a  program to print out the pattern:
1 2 3 4 5 6 7
1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
/*
       */
public class E85NestedForLoops {
    public static void main(String[] args) {

        int rows = 7;
        int[][] pattern = new int[rows][];

        // Fill the pattern array
        for (int i = 0; i < rows; i++) {
            pattern[i] = new int[rows - i];
            for (int j = 0; j < rows - i; j++) {
                pattern[i][j] = j + 1;
            }
        }

        // Print the pattern
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < pattern[i].length; j++) {
                System.out.print(pattern[i][j] + " ");
            }
            System.out.println();
        }
    }
}
