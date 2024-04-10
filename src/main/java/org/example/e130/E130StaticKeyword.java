package org.example.e130;
/*
Complete the mystery method so that it takes in an integer array as a parameter,
and then modifies each element based on whether it's even or odd.
If the number is even, divide it by 2. If it's odd, multiply it by 10.
Output:
10 1 30 2 50
 */
public class E130StaticKeyword {
    static void mysteryMethod(int [] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                arr[i] = arr[i] /2;
            }else{
                arr[i] = arr[i] * 10;
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};
        mysteryMethod(arr);
        for(int num:arr){
        System.out.print(num+" ");
        }
    }
}
