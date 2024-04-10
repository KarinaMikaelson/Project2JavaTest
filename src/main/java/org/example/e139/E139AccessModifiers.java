package org.example.e139;

public class E139AccessModifiers {
    public static String alphabetical(String str){
       StringBuilder result = new StringBuilder();
       for(int i = 0; i < str.length(); i++){
           if(i == 0 || str.charAt(i) > str.charAt(i - 1)){
               result.append(str.charAt(i));
           }
       }
       return result.toString();
    }
    public static void main(String[] args) {
        System.out.println(alphabetical("hello"));
        System.out.println(alphabetical("software"));
        System.out.println(alphabetical("language"));
    }
}


