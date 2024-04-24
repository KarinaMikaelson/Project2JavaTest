package org.example.e201;

import java.util.HashMap;
import java.util.Map;

/*
Create a Map in which you do not need to preserve the order of the entries
Add below pair to it .
"Street" = "Patrick ST"
"Suite" = "265"
"City" = "Vienna"
"Zip" = "22180"
"Country" = "United State"
Find how many entries are inside the map
Remove all entires from the Map
Find the Map size again
**Output:**
5
0
 */
public class E201Map {

    public static void main(String[] args) {
        Map<String,String> valuesMap = new HashMap<>();
        valuesMap.put("Street","Patrick ST");
        valuesMap.put("Suite","265");
        valuesMap.put("City","Vienna");
        valuesMap.put("Zip","22180");
        valuesMap.put("Country","United State");
        System.out.println(valuesMap.size());
        valuesMap.clear();
        System.out.println(valuesMap.size());
    }
}
