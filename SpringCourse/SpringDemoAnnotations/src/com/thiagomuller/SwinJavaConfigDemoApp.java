package com.thiagomuller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class SwinJavaConfigDemoApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        SwinCoach theCoach = context.getBean("swinCoach", SwinCoach.class);

        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getFileInfo());
        context.close();
    }
}
