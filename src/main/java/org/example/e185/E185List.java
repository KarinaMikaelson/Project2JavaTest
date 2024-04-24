package org.example.e185;

import java.util.ArrayList;
public class E185List {
    public static void main(String[] args){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(111);
        arrayList.add(111);
        arrayList.add(111);
        arrayList.add(999);
        arrayList.add(999);
        arrayList.add(999);
        for(Integer i:arrayList){
            System.out.println(i);
        }
    }

}
