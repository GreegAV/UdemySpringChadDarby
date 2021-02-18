package com.udemy.springstudy.purespring;

import org.springframework.stereotype.Component;

@Component
public class FortuneService implements Fortune {
    @Override
    public String getFortune() {
        return "Good luck!";
    }
}
