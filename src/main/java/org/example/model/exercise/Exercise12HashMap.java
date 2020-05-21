package org.example.model.exercise;

import java.util.HashMap;
import java.util.Map;

public class Exercise12HashMap {
    public static void main(String[] args) {
//12. Create a new class and call it Car. Add fields for Id,Brand and Model + getters and setters Create a new hashMap of type <Integer,Car> and populate it with elements containing an id(Integer) and a car object(Car).
// Lastly, print out only the car's brand.

        Map<Integer, String> cars = new HashMap<>();
        car car1= new car("Volvo",2019);
        car car2= new car("BMW",2004);
        car car3 = new car("Renu",2006);

        cars.put(car1.getCarId(),car1.getCarBrand());   // Accessing map cars with parameters (key k, value v)
        cars.put(car2.getCarId(),car2.getCarBrand());
        cars.put(car3.getCarId(),car3.getCarBrand());

        System.out.println(cars.get(1));
        System.out.println(cars.get(2));
        System.out.println(cars.get(3));

      /*  for(car c:cars)                               // I cannot print values with loop unlike keys down there
            System.out.println(c.getCarBrand());*/

     //   System.out.println(cars);
        for(Integer c: cars.keySet())
            System.out.println(c);

    }
}


