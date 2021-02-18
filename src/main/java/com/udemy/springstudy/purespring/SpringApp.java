package com.udemy.springstudy.purespring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Coach theCoach = context.getBean("myCoach", Coach.class);

        System.out.println(theCoach.getWorkout());
        System.out.println(theCoach.getFortune());
    }
}
