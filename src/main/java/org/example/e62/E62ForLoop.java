package org.example.e62;
/*
Using for loop Print 1 to 10 Numbers except 5 and 6
 */
public class E62ForLoop {
    public static void main(String[] args) {

        for(int i = 1; i <=10; i++){
            if(i !=5 && i != 6){
                System.out.println(i);
            }
        }
    }
}
