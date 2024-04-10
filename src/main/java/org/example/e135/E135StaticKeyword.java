package org.example.e135;

public class E135StaticKeyword {
    static String surround(String s, String search_term){
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char currentChar = s.charAt(i);
            if(currentChar == search_term.charAt(0)){
                result.append('(').append(currentChar).append(')');
            }else{
                result.append(currentChar);
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        System.out.println(surround("abcabcabc","c"));
        System.out.println(surround("technology","o"));
    }
}

