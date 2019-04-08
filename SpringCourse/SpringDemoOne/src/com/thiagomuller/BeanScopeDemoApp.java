package com.thiagomuller;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        Coach theCoach = context.getBean("myCoach", Coach.class);
        Coach alphaCoach = context.getBean("myCoach", Coach.class);
        boolean result = (theCoach == alphaCoach);
        System.out.println("Are the two beans pointing to the same object: " + result);
        System.out.println("\nMemory location for the object theCoach " + theCoach);
        System.out.println("\nMemory location for the object alphaCoach " + alphaCoach);
    }
}
