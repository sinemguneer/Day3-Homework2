package com.company;

public class StudentManager extends UserManager{
    public void joinToCourse(Student student){
        System.out.println(student.getFirstName() + student.getLastName() + " isimli kullanıcı kursa katıldı.");
    }
}
