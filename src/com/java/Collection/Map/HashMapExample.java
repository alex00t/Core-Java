package com.java.Collection.Map;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> map = new HashMap<>();

        // Add key-value pairs to the map
        map.put("apple", 10);
        map.put("banana", 5);
        map.put("orange", 7);

        // Retrieve values using keys
        int appleQuantity = map.get("apple");
        int bananaQuantity = map.get("banana");

        System.out.println("Apple quantity: " + appleQuantity);
        System.out.println("Banana quantity: " + bananaQuantity);

        // Check if a key exists
        boolean containsKey = map.containsKey("orange");
        System.out.println("Contains key 'orange': " + containsKey);

        // Remove a key-value pair
        map.remove("orange");

        // Iterate over the map
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
