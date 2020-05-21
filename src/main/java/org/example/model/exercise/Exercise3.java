package org.example.model.exercise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exercise3 {
    //List
    //Problem inserting Thursday to its original position
    //Create a new list and populate it with the days of the week excluding THURSDAY. Lastly, insert the weekday THURSDAY into the right position in the list
    public static void main(String[] args) {


        List<WeekDays> days = new ArrayList<>();


        days.add(WeekDays.Sunday);
        days.add(WeekDays.Monday);
        days.add(WeekDays.Tuesday);
        days.add(WeekDays.Wednesday);
        days.add(WeekDays.Thursday);
        days.add(WeekDays.Friday);
        days.add(WeekDays.Saturday);

        System.out.println(days);
        days.remove(4);
        System.out.println("\n");
        System.out.println("After Removal");
        System.out.println("\n");

        System.out.println(days);



        System.out.println("Re-locate the weekday back to its own position");


        days.add(WeekDays.Thursday);

        System.out.println(days);


    }

}
