package org.example.e76;

public class E76Arrays {
    public static void main(String[] args) {
     //please write code from here
        double [][] array2D = {
                {1.4, 2.0, 3.3, 2.0},
                {4.0, 1.5, 6.1, 1.0},
                {1.2, 3.1, 4.0, 1.6}
        };
       for (double[] row : array2D){
           for(int i = 0; i < row.length; i++){
               row[i]= row[i]*2;
           }
       }
       for(double [] row:array2D){
           for(double n:row){
               System.out.print(n +" ");
           }
           System.out.println();
       }

    }
}
