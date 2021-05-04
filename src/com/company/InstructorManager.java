package com.company;

public class InstructorManager extends UserManager{


    public void addToCourse(Instructor instructor){
        System.out.println(instructor.getFirstName() + " isimli kulanıcı yeni bir kurs ekledi");
    }
    public void removeToCourse(User user){
        System.out.println(user.getFirstName() + " isimli kulanıcı kursu sildi.");
    }
}
