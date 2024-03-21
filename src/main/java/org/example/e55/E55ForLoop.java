package org.example.e55;
/*
Create a for loop that prints out even numbers from 10 to 0
Must not include the number 0 in the output
 */
public class E55ForLoop {
    public static void main(String[] args) {

        for(int i=10; i>0; i--){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
