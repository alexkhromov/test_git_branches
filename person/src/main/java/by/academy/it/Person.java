package by.academy.it;

public class Person {

    private Integer age;
    private String name;
    private String surName;

    public Person( Integer age, String name, String surName ) {

        this.age = age;
        this.name = name;
        this.surName = surName;
    }

    public Integer getAge() {

        return age;
    }

    public void setAge( Integer age ) {

        this.age = age;
    }

    public String getName() {

        return name;
    }

    public void setName( String name ) {

        this.name = name;
    }

    public String getSurName() {

        return surName;
    }

    public void setSurName( String surName ) {

        this.surName = surName;
    }

    public String toString() {

        return "Name: " + name + "\nSurname: " + surName + "\nAge: " + age;
    }
}