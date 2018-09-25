package com.dindar.springdemo;

import com.dindar.springdemo.contracts.IFortuneService;

public class HappyFortuneService implements IFortuneService {
	
	@Override
	public String getFortune(){
		return "message from happy fortune service";
	}
}
