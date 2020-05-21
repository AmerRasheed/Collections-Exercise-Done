package org.example.model.exercise;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercise6 {
    /*6. Create a new hashSet and populate it with the days of the week. Then convert the hashSet to an arrayList.

7. Create a new hashSet and populate it with random names. Then convert the hashSet to an arrayList. Lastly, manually sort the list in alphabetical order and print it out.

8. Create a new hashSet and populate it with random names. Lasty, sort the list in alphabetical order using only a Set or a child of Set. */

    public static void main(String[] args) {

     HashSet<WeekDays> weekDaysHashSet = new HashSet<>();

        weekDaysHashSet.add(WeekDays.Sunday);
        weekDaysHashSet.add(WeekDays.Monday);
        weekDaysHashSet.add(WeekDays.Tuesday);
        weekDaysHashSet.add(WeekDays.Wednesday);
        weekDaysHashSet.add(WeekDays.Thursday);
        weekDaysHashSet.add(WeekDays.Friday);
        weekDaysHashSet.add(WeekDays.Saturday);

        List<WeekDays> weekDaysList = new ArrayList<WeekDays>(weekDaysHashSet);

        System.out.println("Hash set is "+ weekDaysHashSet);

        System.out.println("Array List is "+weekDaysList);

/*

        Set<WeekDays> weekDaysSet = new HashSet<>();
        weekDaysSet.add(WeekDays.Sunday);
        weekDaysSet.add(WeekDays.Monday);
        weekDaysSet.add(WeekDays.Tuesday);
        weekDaysSet.add(WeekDays.Wednesday);
        weekDaysSet.add(WeekDays.Thursday);
        weekDaysSet.add(WeekDays.Friday);
        weekDaysSet.add(WeekDays.Saturday);
        //System.out.println(weekDaysSet.size());
        for(WeekDays s:weekDaysSet) {

            System.out.println(weekDaysSet);

*/
        }
    }

