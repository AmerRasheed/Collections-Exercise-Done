package org.example.model.exercise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exercise2 {public static void main(String[] args) {


    List<WeekDays> days = new ArrayList<>();
    days.add(WeekDays.Friday);
    days.add(WeekDays.Saturday);
    days.add(WeekDays.Monday);
    days.add(WeekDays.Monday);
    days.add(WeekDays.Tuesday);
    days.add(WeekDays.Wednesday);
    days.add(WeekDays.Thursday);

    Iterator<WeekDays> roziterate = days.iterator();  // day ARRAY (OBJECT) will be used by iterator. FOR iterating
  /*  System.out.println("Weekdays before removal");
    while (roziterate.hasNext()) {
        WeekDays another = roziterate.next();
        System.out.println(another);
    }

    System.out.println("Weekdays after removal");
*/
    while (roziterate.hasNext()){
        WeekDays another = roziterate.next();
        if(another.equals(WeekDays.Thursday))
            roziterate.remove();
        else System.out.println(another);
    }

    System.out.println("Re-locate the weekday back to its own position");





    }

}

