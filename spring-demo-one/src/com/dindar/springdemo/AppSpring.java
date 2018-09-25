package com.dindar.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dindar.springdemo.contracts.ICoach;

public class AppSpring {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ICoach coach = context.getBean("myCoach",ICoach.class);
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		System.out.println(coach.getEmailAddress());
		System.out.println(coach.getAddress() );
		context.close();

	}

}
