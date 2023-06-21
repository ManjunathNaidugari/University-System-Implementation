package de.tum.in.ase;

// TODO: implement according to problem statement
public class Instructor extends Person {
    public Instructor(String name, int age, String tumId) {
        super(name, age, tumId);
    }

    public void teach(String s) {
        say("Please learn \"" + s + "\"");
    }

//    public static void main(String[] args) {
//        Instructor i = new Instructor("name",2,"tum");
//        i.teach("s");
//    }

}
