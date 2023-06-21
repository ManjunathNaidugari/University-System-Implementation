package de.tum.in.ase;

import java.time.Duration;
import java.time.LocalTime;

// TODO: implement according to problem statement
public abstract class TimeSlot {
	protected LocalTime startTime;
	protected LocalTime endTime;

	protected TimeSlot(LocalTime startTime, LocalTime endTime) {
		this.startTime = startTime;
		this.endTime = endTime;
	}

	protected Duration getDuration() {
		return Duration.between(startTime, endTime);
	}
}
