package org.example.e193;

import java.util.LinkedList;
import java.util.List;

/*
Create Linked List that will store Integer Objects
Add the values below:
111
222
333
444
555
666
Create a logic to calculate sum of the all the values in list.
Print the result of sum.
**Output:**
Result of sum is 2331
 */
public class E193List {

    public static void main(String[] args) {

        List<Integer> objects = new LinkedList<>();
        objects.add(111);
        objects.add(222);
        objects.add(333);
        objects.add(444);
        objects.add(555);
        objects.add(666);
        int sum = 0;
        for(int i = 0; i < objects.size(); i++){
            sum = sum + objects.get(i);
            //System.out.println(sum);
        }
        System.out.println("Result of sum is "+sum);
    }
}