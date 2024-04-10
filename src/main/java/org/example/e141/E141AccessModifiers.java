package org.example.e141;
/*
Create the maxValue method that will accept int array and return the maximum value in the array.
Method should be visible every class in any package
**Output:**
22
 */
public class E141AccessModifiers {
    public static int maxValue(int [] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];

        return max;
    }

    public static void main(String[] args) {
        int [] arr = {12, 3, 16, 22};
        System.out.println(maxValue(arr));
    }
}


