package org.example.e196;

import java.util.LinkedHashSet;
import java.util.Set;

/*
Create a Set and below values to it.
[third, first, second]
Print HashSet and then remove all the elements from Hashset and print it again.
**Output:**`
[third, first, second]
[]
 */
public class E196Set {
    public static void main(String[] args) {

        Set<String> objects = new LinkedHashSet<>();
        objects.add("third");
        objects.add("first");
        objects.add("second");
        System.out.println(objects);
        objects.removeAll(objects);
        System.out.println(objects);
    }
}
