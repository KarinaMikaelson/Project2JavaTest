package org.example.e188;

import java.util.ArrayList;
import java.util.Scanner;

public class E188List {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            int num = scan.nextInt();
            arrayList.add(num);
        }
        for(int value:arrayList){
            System.out.print(value+" ");
        }
        scan.close();
    }
}

