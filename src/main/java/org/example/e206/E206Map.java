package org.example.e206;

import java.util.HashMap;
import java.util.Map;

/*
Create a Hash Map of String pairs
add the follow values
map.put("ONE","AAA");
map.put("TWO","BBB");
map.put("THREE","CCC");
map.put("FOUR","DDD");
map.put("FIVE","EEE");
Using entry set print key and values pairs using loop
Remove below from Map
"ONE"
"FOUR"
Using entry set print key and values pairs using loop
**Output:**
HashMap Before Remove :
FIVE : EEE
ONE : AAA
FOUR : DDD
TWO : BBB
THREE : CCC
------------------
HashMap After Remove :
FIVE : EEE
TWO : BBB
THREE : CCC
 */
public class E206Map {

    public static void main(String[] args) {

        Map<String,String > map = new HashMap<>();
        map.put("ONE","AAA");
        map.put("TWO","BBB");
        map.put("THREE","CCC");
        map.put("FOUR","DDD");
        map.put("FIVE","EEE");
        System.out.println("HashMap Before Remove :");
        for(Map.Entry<String ,String > entry:map.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        System.out.println("------------------");

        map.remove("ONE");
        map.remove("FOUR");
        System.out.println("HashMap After Remove :");
        for(Map.Entry<String,String > entry:map.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

    }

}
