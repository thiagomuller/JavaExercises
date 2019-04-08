package com.thiagomuller;

public class MyApp {

	public static void main(String[] args) {

		// create the object
		// com.thiagomuller.Coach theCoach = new com.thiagomuller.BaseballCoach();
		Coach theCoach = new TrackCoach();
		
		// use the object
		System.out.println(theCoach.getDailyWorkout());
	}

}
