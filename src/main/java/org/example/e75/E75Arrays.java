package org.example.e75;

public class E75Arrays {
    public static void main(double[][] args) {
        double [][] array2D = {
                {1.4, 2.0, 3.3, 2.0},
                {4.0, 1.5, 6.1, 1.0},
                {1.2, 3.1, 4.0, 1.6}
                };
        for (double[] row : array2D) {
            for (double num : row) {
                System.out.print(num + " ");
            }

            System.out.println();
        }
    }
}






