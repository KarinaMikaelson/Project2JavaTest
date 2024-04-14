package org.example.e168;

public class E168FinalKeyword {
    public static void main(String[] args){
        E168FinalKeyword instance = new E168FinalKeyword();
        System.out.println(instance.reverseString("hello"));
    }
    public final String reverseString(String str){
        return new
                StringBuilder(str).reverse().toString();
    }
}


