package de.tum.in.ase;

import java.time.DayOfWeek;
import java.time.LocalTime;

// TODO: implement according to problem statement
public class WeeklyTimeSlot extends TimeSlot {
    private final DayOfWeek dayOfWeek;

    public WeeklyTimeSlot(DayOfWeek dayOfWeek, LocalTime startTime, LocalTime endTime) {
        super(startTime, endTime);
        this.dayOfWeek = dayOfWeek;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }
}
