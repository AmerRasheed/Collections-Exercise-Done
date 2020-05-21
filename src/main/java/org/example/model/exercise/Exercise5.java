package org.example.model.exercise;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercise5 {
    /* Create a new hashset and populate it with the days of the week. Lastly, print the set out and pay attention to the order of the elements.*/


    public static void main(String[] args) {


        Set<WeekDays> weekDaysSet = new HashSet<>();
        weekDaysSet.add(WeekDays.Sunday);
        weekDaysSet.add(WeekDays.Monday);
        weekDaysSet.add(WeekDays.Tuesday);
        weekDaysSet.add(WeekDays.Wednesday);
        weekDaysSet.add(WeekDays.Thursday);
        weekDaysSet.add(WeekDays.Friday);
        weekDaysSet.add(WeekDays.Saturday);
        System.out.println(weekDaysSet.size());


            System.out.println(weekDaysSet);

    }


}
