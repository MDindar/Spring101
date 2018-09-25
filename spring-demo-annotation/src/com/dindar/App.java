package com.dindar;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dindar.contracts.ICoach;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		ICoach coach= context.getBean("theFootballCoach",ICoach.class);
		ICoach coach2= context.getBean("baseballCoach",ICoach.class);
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach2.getDailyWorkout());
		context.close();
		
	}

}
