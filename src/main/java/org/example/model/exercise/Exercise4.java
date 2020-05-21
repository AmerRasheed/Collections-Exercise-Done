package org.example.model.exercise;

import java.util.ArrayList;
import java.util.List;

public class Exercise4 {

    //Lists Require sublist
    //create a new list out of the first three elements of the first list using a subList.
    // Create a new list and populate it with the days of the week. Then create a new list out of the first three elements of the first list using a subList.
    public static void main(String[] args) {


        List<WeekDays> days = new ArrayList<>();


        days.add(WeekDays.Sunday);
        days.add(WeekDays.Monday);
        days.add(WeekDays.Tuesday);
        days.add(WeekDays.Wednesday);
        days.add(WeekDays.Thursday);
        days.add(WeekDays.Friday);
        days.add(WeekDays.Saturday);

        List another = days.subList(0,3);

        System.out.println(another);  //Output Sunday, Monday, Tuesday

    }}
