package org.example.e200;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/*
Create A Map that will preserve an order of entry objects
Add below pairs :
"Street" = "Patrick ST"
"Suite" = "265"
"City" = "Vienna"
"Zip" = "22180"
"Country" = "United State"
Print all values of from the map
**Output:**
Patrick ST
265
Vienna
22180
United State
 */
public class E200Map {
    public static void main(String[] args) {
        Map<String,String> addressMap = new LinkedHashMap<>();
        addressMap.put("Street","Patrick ST");
        addressMap.put("Suite","265");
        addressMap.put("City","Vienna");
        addressMap.put("Zip","22180");
        addressMap.put("Country","United State");
        for(String value: addressMap.values()){
            System.out.println(value);
        }
    }
}
