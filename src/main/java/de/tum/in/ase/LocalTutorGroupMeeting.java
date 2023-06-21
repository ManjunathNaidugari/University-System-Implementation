package de.tum.in.ase;

// TODO: implement according to problem statement
public class LocalTutorGroupMeeting extends TutorGroupMeeting {
    private final String room;

    public LocalTutorGroupMeeting(FixedDateTimeSlot timeSlot, TutorGroup tutorGroup, Skill skillToPractice, String room) {
        super(timeSlot, tutorGroup, skillToPractice);
        this.room = room;
    }

//    public void practice() {
//    }

    public String getRoom() {
        return room;
    }

    @Override
    public void practice() {
        this.getTutorGroup().getTutor().say("Thank you for coming to " + getRoom() + " today.");
        this.getTutorGroup().getStudents().forEach(student -> student.learnSkill(getSkillToPractise()));
        this.getTutorGroup().getTutor().say("See you next time!");
        this.getTutorGroup().getMeetings().remove(this);
    }
}
