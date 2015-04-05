package by.academy.it;

public class Person {

    private int age;
    private String name;
    private String surName;

    public Person( int age, String name, String surName ) {

        this.age = age;
        this.name = name;
        this.surName = surName;
    }

    public String toString() {

        return "Name: " + name + "\nSurname: " + surName + "\nAge: " + age;
    }
}