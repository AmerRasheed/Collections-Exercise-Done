package org.example.model.exercise;

import java.util.HashMap;
import java.util.Map;

public class Exercise11HashMap {
    ////11. Create a new hashMap of type <Integer,String> and populate it with elements containing an id(Integer) and a car brand(String).
    //// Lastly, print out only the values.
    public static void main(String[] args) {
        Map<Integer, String> carMap = new HashMap<>();

        String st1 = "Suzuki";
        String st2 = "Chevrolet";
        String st3 = "Mazda";

        carMap.put(1, st1);             // Accessing map carMap with parameters (key k, value v)
        carMap.put(2, st2);
        carMap.put(3, st3);

        System.out.println("Value is "+carMap.get(1));   // 1
        System.out.println(carMap.get(2));               // 2
        System.out.println(carMap.get(3));               //3


        System.out.println(carMap.keySet());  // Outputs [1, 2, 3]
    }
}