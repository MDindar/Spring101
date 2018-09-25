package com.dindar;

import org.springframework.stereotype.Component;

import com.dindar.contracts.IFortune;

@Component
public class GoodFortune implements IFortune {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "good fortune";
	}
	
}
