package org.example.e140;
/*
Create the maxLength method that will accept String array of words and return the word with the largest length.
Method should be visible only within same package!
**Output:**
this is long
 */
public class E140AccessModifiers {
    public static void main(String[] args) {
        String[] arr= {"hey","yolo", "hi","this is long"};
        System.out.println(maxLength(arr));

    }
    static String maxLength(String[] names){
        int size = names.length;
        String longestName = names[0];
        for(int i = 1 ; i < size ; i++){
            if(names[i].length() > longestName.length()){
                longestName = names[i];
            }
        }
        return longestName;
    }
}

