package de.tum.in.ase;

import java.util.HashSet;
import java.util.Set;

// TODO: implement according to problem statement
public class Student extends Person {
    private final String matriculationNumber;

    private final int semester;

    private final Set<String> knowledge;

    private final StudyLevel studyLevel;

    private final Set<Skill> skills;

    public Student(String name, int age, String tumId, String matriculationNumber, StudyLevel studyLevel, int semester) {
        super(name, age, tumId);
        this.matriculationNumber = matriculationNumber;
        this.semester = semester;
        this.knowledge = new HashSet<>();
        this.studyLevel = studyLevel;
        this.skills = new HashSet<>();
    }

    public void learnSkill(Skill newSkill) {
        skills.add(newSkill);
    }

    public void acquireKnowledge(String s) {
        knowledge.add(s);
    }

    public String getMatriculationNumber() {
        return matriculationNumber;
    }

    public int getSemester() {
        return semester;
    }

    public Set<String> getKnowledge() {
        return knowledge;
    }

    public StudyLevel getStudyLevel() {
        return studyLevel;
    }

    public Set<Skill> getSkills() {
        return skills;
    }

}
