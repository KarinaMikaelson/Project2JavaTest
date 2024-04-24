package org.example.e187;

import java.util.ArrayList;

public class E187List {
    public static void main(String[] args){
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("hi");
        arrayList.add("yo");
        arrayList.add("sup");
        arrayList.add("yolo");
        arrayList.add("boop");

        arrayList.remove(4);
        arrayList.remove(2);
        arrayList.remove(0);
        for(String i:arrayList){
            System.out.print(i+" ");
        }
    }

}
