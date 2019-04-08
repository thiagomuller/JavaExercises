package com.thiagomuller;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleScopeDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanLifeCycleScope-applicationContext.xml");

        Coach theCoach = context.getBean("myCoach", Coach.class);
        Coach alphaCoach = context.getBean("myCoach", Coach.class);
        context.close();
    }
}
