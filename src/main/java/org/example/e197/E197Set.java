package org.example.e197;

import java.util.HashSet;
import java.util.Set;

/*
Create a set collection in which you do not want to preserve or sort the order and add below values to it.
Red
Pink
Yellow
White
Black
Print set collection
And get total number of colors available in the set
**Output:**
Original Hash Set: [Red, Pink, White, Yellow, Black]
Size of the Hash Set: 5
 */
public class E197Set {

    public static void main(String[] args) {
        Set<String> collection = new HashSet<>();
        collection.add("Red");
        collection.add("Pink");
        collection.add("Yellow");
        collection.add("White");
        collection.add("Black");
        System.out.println("Original Hash Set: "+collection);
        System.out.println("Size of the Hash Set: "+collection.size());
    }

}
