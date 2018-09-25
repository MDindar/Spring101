package com.dindar;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.dindar.contracts.ICoach;
import com.dindar.contracts.IFortune;

@Component("theFootballCoach")
@Scope("singleton")
public class FootballCoach implements ICoach {
	
	@Autowired
	@Qualifier("goodFortune")
	private IFortune fortune;
	
	/*@Autowired
	public FootballCoach(IFortune fortune) {
		super();
		this.fortune = fortune;
	}*/

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "getDailyWorkout from FootballCoach "+ "--> "+ fortune.getFortune();
	}

	@PostConstruct
	public void myStartup(){
		System.out.println("FootballCoach:: inside myStartup");
	}
	
	@PreDestroy
	public void myDestroy(){
		System.out.println("FootballCoach:: inside myDestroy");
	}
}
