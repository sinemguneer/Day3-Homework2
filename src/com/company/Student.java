package com.company;

public class Student extends User{
    private String lesson;

    public Student() {
    }

    public Student(int id, String firstname, String lastName, String password,String lesson){
        this.setId(id);
        this.setFirstName(firstname);
        this.setLastName(lastName);
        this.setLesson(lesson);

    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }
}
