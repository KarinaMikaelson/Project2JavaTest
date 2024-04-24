package org.example.e192;

import java.util.LinkedList;
import java.util.List;

/*
Create an Linked List that will store all prime numbers from 1 to 100
Step 1. Create a method that will identify whether number is prime or not
Step 2. Add all prime numbers into Linked List
Print Linked List:
**Output:**
[2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97]```
 */
public class E192List {
    public static void main(String[] args) {
        List<Integer> primeNumbers = new LinkedList<>();
        for(int i = 2; i < 100; i++){
            if(isPrime(i)){
                primeNumbers.add(i);
            }
        }
        System.out.println(primeNumbers);

    }
    private static boolean isPrime(int number){
        if(number <= 1){
            return false;
        }
        for(int i =2; i<= Math.sqrt(number);i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}
