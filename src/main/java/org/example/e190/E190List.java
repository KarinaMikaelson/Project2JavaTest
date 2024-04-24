package org.example.e190;

import java.util.LinkedList;
import java.util.List;

/*
Create Linked List that will store first 10 numbers of fibonacci series
Print number from Linked List 1 by 1 all in 1 line
**Output:**
0 1 1 2 3 5 8 13 21 34
 */
public class E190List {
    public static void main(String[] args){
        List<Integer> fibonacciList = new LinkedList<>();
        fibonacciList.add(0);
        fibonacciList.add(1);
        for(int i = 2; i < 10; i++){
            int nextFibonacci = fibonacciList.get(i-1) + fibonacciList.get(i - 2);
            fibonacciList.add(nextFibonacci);
        }
        for(int number: fibonacciList){
            System.out.print(number+" ");
        }
    }

}
