package com.udemy.springstudy.purespring;

import org.springframework.stereotype.Component;

@Component
public interface Coach {
    public String getWorkout();

    public String getFortune();
}
