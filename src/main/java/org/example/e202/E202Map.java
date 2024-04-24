package org.example.e202;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/*
Create Map in which we want to store keys in Ascending order
Add the below values
1 item = apple
2 item = banana
3 item = pear
4 item = tomato
5 item = mango
6 item: kiwi
Extract all keys and it values and print them in the format below:
**Output:**
Key is 1 item and values is apple
Key is 2 item and values is banana
Key is 3 item and values is pear
Key is 4 item and values is tomato
Key is 5 item and values is mango
Key is 6 item and values is kiwi
 */
public class E202Map {
    public static void main(String[] args){
        Map<String, String> groceryMap = new TreeMap<>();
        groceryMap.put("1 item","apple");
        groceryMap.put("2 item","banana");
        groceryMap.put("3 item","pear");
        groceryMap.put("4 item","tomato");
        groceryMap.put("5 item","mango");
        groceryMap.put("6 item","kiwi");
        for(Map.Entry<String,String> entry: groceryMap.entrySet()){
            System.out.println("Key is "+entry.getKey()+" and values is "+entry.getValue());
        }
    }
}