package com.dindar;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.dindar.contracts.ICoach;
import com.dindar.contracts.IFortune;

@Component
@Scope("prototype")
public class BaseballCoach implements ICoach {
	
	@Value("${foo.email}")
	private String email;
	
	
	//field injection
	@Autowired
	@Qualifier("badFortune")
	private IFortune fortune;
	
	
	//constructor injection
/*	@Autowired
	public BaseballCoach(IFortune fortune) {
		super();
		this.fortune = fortune;
	}*/

	//setter inejction
	/*@Autowired
	public void setFortune(IFortune fortune) {
		this.fortune = fortune;
	}*/
	
	// method inejction
	/*@Autowired
	public void doMethodInejction(IFortune fortune) {
		System.out.println("inside doMethodInjection");
		this.fortune = fortune;
	}
	*/
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "getDailyWorkout from baseball coach" + "--> "+ fortune.getFortune() +" --- loading from properties file :" + this.email ;
	}

/*	public IFortune getFortune() {
		return fortune;
	}*/
	
	


}
