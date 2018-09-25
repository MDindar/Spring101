package com.dindar.springdemo;

import com.dindar.springdemo.contracts.ICoach;
import com.dindar.springdemo.contracts.IFortuneService;

public class BaseballCoach implements ICoach {
	
	private IFortuneService _fortuneService;
	
	private String emailAddress;
	private String address;
	
	public BaseballCoach(IFortuneService fortuneService) {
		this._fortuneService= fortuneService;
	}
	@Override
	public String getDailyWorkout(){
		return "getDailyWorkout from a baseball coach";
	}
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "get daily fortune from : " + _fortuneService.getFortune();
	}
	
	public void setEmailAddress(String emailAddress) {
		System.out.println("inside setEmailAddress method");
		this.emailAddress = emailAddress;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void doStartup(){
		System.out.println("inside do startup");
	}
	
	public void doDestroy() {
		System.out.println("inside do Destroy");
	}

}
