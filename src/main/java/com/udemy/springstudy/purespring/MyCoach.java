package com.udemy.springstudy.purespring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyCoach implements Coach {

    @Autowired
    private Fortune fortune;

    @Override
    public String getWorkout() {
        return "Train hard!";
    }

    public String getFortune(){
        return fortune.getFortune();
    }
}
