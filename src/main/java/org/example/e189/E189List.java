package org.example.e189;

import java.util.LinkedList;
import java.util.List;

public class E189List {

    public static void main(String[] args){
        List<Integer> linkedList = new LinkedList<>();
        for(int i = 50; i < 100;i++){
            linkedList.add(i);
        }
        linkedList.removeIf(x-> x % 3  != 0);
        System.out.println(linkedList);
    }

}