package com.dindar.springdemo;

import com.dindar.springdemo.contracts.ICoach;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICoach coach = new FootballCoach(new HappyFortuneService());
		System.out.println(coach.getDailyWorkout());
	}

}
