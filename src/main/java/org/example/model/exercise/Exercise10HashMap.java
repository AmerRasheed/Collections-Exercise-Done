package org.example.model.exercise;

import java.util.HashMap;
import java.util.Map;

public class Exercise10HashMap {
//10. Create a new hashMap of type <Integer,String> and populate it with elements containing an id(Integer) and a car brand(String).
// Lastly, print out only the keys.




    public static void main(String[] args) {


        Map<Integer, String> cars = new HashMap<>();

        String st1="Suzuki";
        String st2="Chevrolet";
        String st3="Mazda";

        cars.put(1,st1);
        cars.put(2,st2);
        cars.put(3,st3);

       System.out.println(cars.keySet());  // Outputs [1, 2, 3]

        //
        // for(String s: cars.get(i))
  //for(int i=0;i<3;i++)
    for(Integer c:cars.keySet())
    {
        System.out.println(cars);
    }
    }
}


