package org.example.e68;

import java.util.Arrays;
import java.util.HashSet;

/*
Write a program that creates an array with the following values{s, a, y,  b, n, c, t,  d, a, e, x}
Print the values so the output should look like below
syntax
 */
public class E68Arrays {
    public static void main(String[] args) {
        //ive changed second letter to skip 1 letter
        char[] letters = {'s', 'k', 'y','b','n', 'c', 't',  'd', 'a', 'e', 'x'};
        for(char i = 0; i < letters.length; i +=2){
            System.out.print(letters[i]);
        }

       // char [] ch = {'s','a','y','b','n','c','t','d','e','x'};
          //  System.out.print(ch[0]+""+ch[2]+""+ch[4]+""+ch[6]+""+ch[1]+""+ch[9]);

    }
}
