package de.tum.in.ase;

import java.time.LocalDate;
import java.time.LocalTime;

// TODO: implement according to problem statement
public class FixedDateTimeSlot extends TimeSlot {
	private final LocalDate date;

	public FixedDateTimeSlot(LocalDate localDate, LocalTime startTime, LocalTime endTime) {
		super(startTime, endTime);
		this.date = localDate;
	}

	public LocalDate getDate() {
		return date;
	}
}
