package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
                // Creating a HashMap
                Map<String, Integer> numberMapping = new HashMap<>();

                // Adding key-value pairs to a HashMap
                numberMapping.put("One", 1);
                numberMapping.put("Three", 3);
                numberMapping.put("Two", 2);

                // Add a new key-value pair only if the key does not exist in the HashMap, or is mapped to `null`
                numberMapping.put("Four", 4);

                System.out.println(numberMapping);

    }
}
