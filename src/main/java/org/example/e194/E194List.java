package org.example.e194;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
Create a method that takes a list as a paramter removes an element if it starts with letter
A from given List and return new List then in the main method print that list.
**Output:**
[USA, Kazakhstan, Pakistan, Russia]
 */
public class E194List {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("USA");
        list.add("Kazakhstan");
        list.add("Pakistan");
        list.add("Russia");
        List<String> modifiedList = new ArrayList<>(list);
        System.out.println(modifiedList);

    }
    private static List<String> removeElementStartingWithA(List<String> list){
        List<String > modifiedList = new ArrayList<>();
        for(String element:list){
            if(!element.startsWith("A")){
                modifiedList.add(element);
            }

        }
        return modifiedList;
    }
}
