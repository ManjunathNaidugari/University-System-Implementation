package de.tum.in.ase;

// TODO: implement according to problem statement
public class VirtualTutorGroupMeeting extends TutorGroupMeeting {
    private final String url;

    public VirtualTutorGroupMeeting(FixedDateTimeSlot timeSlot, TutorGroup tutorGroup, Skill skillToPractice, String url) {
        super(timeSlot, tutorGroup, skillToPractice);
        this.url = url;
    }

//    public void practice() {
//    }

    @Override
    public void practice() {
        this.getTutorGroup().getTutor().say("Thank you for joining using " + getUrl() + " today.");
        setSkillToPractise(getSkillToPractise());
        this.getTutorGroup().getStudents().forEach(student -> {
            student.learnSkill(this.getSkillToPractise());
        });
        this.getTutorGroup().getTutor().say("See you next time!");
        this.getTutorGroup().getMeetings().remove(this);
    }

    public String getUrl() {
        return url;
    }
}
