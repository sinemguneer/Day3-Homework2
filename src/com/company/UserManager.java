package com.company;

public class UserManager {


    public void logIn(User user){
        System.out.println(user.getFirstName() +" "+ user.getLastName() + " isimli kullanıcı giriş yaptı.");
    }
    public void signUp(User user){
        System.out.println(user.getFirstName() +" "+ user.getLastName() + " isimli kullanıcı kayıt oldu.");
    }

}
