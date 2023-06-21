package de.tum.in.ase;

// TODO: implement according to problem statement
public abstract class Person {
    protected String name;
    protected int age;
    protected String tumId;

    protected Person(String name, int age, String tumId) {
        this.name = name;
        this.age = age;
        this.tumId = tumId;
    }

    protected final void say(String s) {
        System.out.println(name + " said: " + s);
    }

}

