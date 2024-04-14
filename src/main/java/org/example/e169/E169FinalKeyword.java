package org.example.e169;

public class E169FinalKeyword {
    public static final double avgElements(int[] arr){
        int sum = 0;
        for(int num:arr){
            sum = sum + num;
        }
        return (double) sum/arr.length;
    }
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 3, 3};
        System.out.println(avgElements(arr));
    }
}
