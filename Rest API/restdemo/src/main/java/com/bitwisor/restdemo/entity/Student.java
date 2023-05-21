package com.bitwisor.restdemo.entity;

public class Student {
    String firstName;
    String lastNamel;

    public Student(String firstName, String lastNamel) {
        this.firstName = firstName;
        this.lastNamel = lastNamel;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastNamel() {
        return lastNamel;
    }

    public void setLastNamel(String lastNamel) {
        this.lastNamel = lastNamel;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastNamel='" + lastNamel + '\'' +
                '}';
    }
}
