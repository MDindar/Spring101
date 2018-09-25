package com.dindar;

import org.springframework.stereotype.Component;

import com.dindar.contracts.IFortune;

@Component
public class BadFortune implements IFortune {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "bad fortune";
	}

}
