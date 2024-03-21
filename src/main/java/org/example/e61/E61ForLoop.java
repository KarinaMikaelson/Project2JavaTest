package org.example.e61;
/*
Write a program that uses for loop to prints multiplication of number 3 from 1 to 10
 */
public class E61ForLoop {
    public static void main(String[] args) {

        for(int i = 1; i <= 10; i++){
            int result = 3* i;
            System.out.println("3*"+i+"="+result);
        }
    }
}
