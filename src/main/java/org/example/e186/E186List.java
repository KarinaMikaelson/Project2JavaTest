package org.example.e186;
import java.util.ArrayList;
public class E186List {
    public static void main(String[] args){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(111);
        arrayList.add(222);
        arrayList.add(333);
        arrayList.add(444);
        arrayList.add(555);
        arrayList.add(666);
        System.out.println(arrayList);
        arrayList.removeAll(arrayList);
        System.out.println(arrayList);
    }

}
