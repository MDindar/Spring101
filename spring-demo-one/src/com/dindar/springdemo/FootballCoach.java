package com.dindar.springdemo;

import com.dindar.springdemo.contracts.ICoach;
import com.dindar.springdemo.contracts.IFortuneService;

public class FootballCoach implements ICoach {
	private IFortuneService fortuneService;
	public FootballCoach(IFortuneService fortuneService) {
		// TODO Auto-generated constructor stub
		this.fortuneService= fortuneService;
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "getDailyWorkout from FootballCoach";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "get daily fortune from  " + this.fortuneService.getFortune() ;
	}
	@Override
	public String getEmailAddress() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getAddress() {
		// TODO Auto-generated method stub
		return null;
	}

}
