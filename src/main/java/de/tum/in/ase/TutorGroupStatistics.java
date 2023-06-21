package de.tum.in.ase;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class TutorGroupStatistics {
	private TutorGroupStatistics() {
	}

	public static double averageDuration(Stream<TutorGroupMeeting> meetingStream) {
		return meetingStream.mapToLong(tutorGroupMeeting -> tutorGroupMeeting.timeSlot.getDuration().getSeconds()).average().orElse(0);
	}

	public static Set<Skill> repeatedSkills(Stream<TutorGroupMeeting> meetings) {
		List<Skill> skillsList = meetings.map(TutorGroupMeeting::getSkillToPractise).toList();

		Set<Skill> repeatedSkills = new HashSet<>();
		for (Skill skill : skillsList) {
			if (Collections.frequency(skillsList, skill) > 1) {
				repeatedSkills.add(skill);
			}
		}
		return repeatedSkills;
	}

	public static Set<Student> studentsWithSpecificSkill(TutorGroup tutorGroup, Skill skill) {
		return tutorGroup.getStudents().stream().filter(student -> student.getSkills().contains(skill)).collect(Collectors.toSet());
	}
}
