package de.tum.in.ase;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// TODO: implement according to problem statement
public class TutorGroup {
    private final String id;
    private final WeeklyTimeSlot timeSlot;
    private final Person tutor;
    private final Set<Student> students;
    private final List<TutorGroupMeeting> meetings;

    public TutorGroup(String id, WeeklyTimeSlot weeklyTimeSlot, Person person) {
        this.id = id;
        this.timeSlot = weeklyTimeSlot;
        this.tutor = person;
        students = new HashSet<>();
        meetings = new ArrayList<>();
    }

    void addMeeting(TutorGroupMeeting newTutorGroupMeeting) {
        meetings.add(newTutorGroupMeeting);
    }

    public void register(Student newStudent) {
        students.add(newStudent);
    }

    public void completeTutorGroup(String str) {
        if (meetings.isEmpty()) {
            students.forEach(student -> student.acquireKnowledge(str));
        } else {
            System.out.println("Tutor group with the id " + id + " still has " + meetings.size() + " unfinished meetings.");
        }
    }

    public String getId() {
        return id;
    }

    public WeeklyTimeSlot getTimeSlot() {
        return timeSlot;
    }

    public Person getTutor() {
        return tutor;
    }


    public Set<Student> getStudents() {
        return students;
    }

    public List<TutorGroupMeeting> getMeetings() {
        return meetings;
    }


}
