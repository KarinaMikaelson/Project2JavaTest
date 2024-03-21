package org.example.e80;

public class E80Arrays {
    public static void main(int[] args) {
        // please write code from here
        int [] array = {-3, 4, -1, -8, 9, -7};
        int count = 0;
        for(int num:array){
            if(num < 0 && num % 2 != 0){
                count++;
            }
        }System.out.print(count);
    }
}
