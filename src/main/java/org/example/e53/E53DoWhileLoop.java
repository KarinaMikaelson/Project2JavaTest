package org.example.e53;

public class E53DoWhileLoop {
    public static void main(String[] args) {

        int num = 20;
        do{
            if( num % 2 == 0){
                System.out.println(num);
            }
            num--;
        }while(num > 0);
    }
}
