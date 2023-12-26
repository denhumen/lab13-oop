package ua.edu.ucu.apps.task1;

import java.time.LocalDate;

import lombok.Getter;

public class MyFacebookUser implements User{

    @Getter
    private FacebookUser facebookUser;

    public MyFacebookUser(FacebookUser facebookUser){
        this.facebookUser = facebookUser;
    }

    @Override
    public String getEmail() {
        return facebookUser.getUserMail();
    }

    @Override
    public String getCountry() {
        return facebookUser.getCountry();

    }

    @Override
    public LocalDate getLastActiveDate() {
        return facebookUser.getLastActiveTime();
    }
    
}
