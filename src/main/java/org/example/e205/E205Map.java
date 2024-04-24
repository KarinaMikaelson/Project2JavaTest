package org.example.e205;

import java.util.HashMap;
import java.util.Map;

/*
Create a HashMap of String.
Add below pair to it .
"Street" = "Patrick ST"
"Suite" = "265"
"City" = "Vienna"
"Zip" = "22180"
"Country" = "United State"
Print all the values in upper case using entrySet
**Output:**
265
22180
PATRICK ST
UNITED STATE
VIENNA
 */
public class E205Map {

    public static void main(String[] args) {

        Map<String,String> addressMap = new HashMap<>();
        addressMap.put("Street","Patrick ST");
        addressMap.put("Suite","265");
        addressMap.put("City","Vienna");
        addressMap.put("Zip","22180");
        addressMap.put("Country","United State");
        for(Map.Entry<String,String > entry: addressMap.entrySet()){
            System.out.println(entry.getValue().toUpperCase());
        }


    }
}
