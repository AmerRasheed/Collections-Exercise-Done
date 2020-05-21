package org.example.model.exercise;

import java.time.temporal.WeekFields;
import java.util.Comparator;

public enum WeekDays implements Comparator {
    Sunday(0),
    Monday(1),
    Tuesday(2),
    Wednesday(3),
    Thursday(4),
    Friday(5),
    Saturday(6);

    private int value;

    WeekDays(int value) {
        this.value = value;
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}
