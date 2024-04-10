package org.example.qz;
/*
Question 10 Java Quiz 2_Loops and Arrays ( Class 9 )
 */
public class hd2 {
    public static void main(String[] args) {
        int[] array = { 1, 4, 3, 6, 8, 2, 5 };

        int what = array[0];

        for (int index = 0; index < array.length; index++) {

            if (array[index] > what) {

                what = array[index];

            }

        }

        System.out.println(what);
    }
}
