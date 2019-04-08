package com.thiagomuller;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");

		Coach theCoach = context.getBean("myCoach", Coach.class);

		System.out.println(theCoach.getDailyWorkout());

		System.out.println(theCoach.getDailyFortune());

		CricketCoach cricket = context.getBean("myCricketCoach", CricketCoach.class);

		System.out.println(cricket.getDailyWorkout());
		System.out.println(cricket.getDailyFortune());
		System.out.println(cricket.getEmailAddress());
		System.out.println(cricket.getTeam());


		context.close();
	}

}







