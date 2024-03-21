package org.example.e57;
/*
Create a for loop that prints out odd numbers from 5 to 22
Must not include the number 22 in the output
 */
public class E57ForLoop {
    public static void main(String[] args) {

        for(int i = 5; i <= 22; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}
