package org.example.e151;

public class E151Inheritance extends Method{
    public static void main(String[] args) {
        int[][] n = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int sum = sum2D(n);
        System.out.println(sum);
    }
}
class Method{
    public static int sum2D(int [][] arr){
        int sum = 0;
        for(int [] row: arr){
            for(int num:row){
                sum = sum+num;
            }
        }
        return sum;
    }
}
