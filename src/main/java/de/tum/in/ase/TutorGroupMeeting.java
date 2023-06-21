package de.tum.in.ase;

// TODO: implement according to problem statement
public abstract class TutorGroupMeeting {
    protected FixedDateTimeSlot timeSlot;
    protected Skill skillToPractise;
    protected TutorGroup tutorGroup;

    protected TutorGroupMeeting(FixedDateTimeSlot timeSlot, TutorGroup tutorGroup, Skill skillToPractice) {
        this.timeSlot = timeSlot;
        this.skillToPractise = skillToPractice;
        this.tutorGroup = tutorGroup;
    }

    protected abstract void practice();

    public FixedDateTimeSlot getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(FixedDateTimeSlot timeSlot) {
        this.timeSlot = timeSlot;
    }

    public Skill getSkillToPractise() {
        return skillToPractise;
    }

    public void setSkillToPractise(Skill skillToPractice) {
        this.skillToPractise = skillToPractice;
    }

    public TutorGroup getTutorGroup() {
        return tutorGroup;
    }

    public void setTutorGroup(TutorGroup tutorGroup) {
        this.tutorGroup = tutorGroup;
    }
}
