package org.example.e204;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/*
Create a Map that will preserve an order of entry objects
Add below pair to it .
"Street" = "Patrick ST"
"Suite" = "265"
"City" = "Vienna"
"Zip" = "22180"
"Country" = "United State"
Print all values using iterator
**Output:**
Patrick ST
265
Vienna
22180
United State
 */
public class E204Map {
    public static void main(String[] args) {

        Map<String,String> addressMap = new LinkedHashMap<>();
        addressMap.put("Street","Patrick ST");
        addressMap.put("Suite","265");
        addressMap.put("City","Vienna");
        addressMap.put("Zip","22180");
        addressMap.put("Country","United State");
        Iterator<Map.Entry<String ,String>> iterator = addressMap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,String > entry = iterator.next();
            System.out.println(entry.getValue());
        }
    }
}
