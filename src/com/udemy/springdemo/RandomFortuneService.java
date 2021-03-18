package com.udemy.springdemo;

import java.util.concurrent.ThreadLocalRandom;

public class RandomFortuneService implements FortuneService {

	private String fortunes[] = new String[3];
	
	public RandomFortuneService() {
		fortunes[0] = "You've done it.";
		fortunes[1] = "Get out of here.";
		fortunes[2] = "You will be caught.";
	}
	@Override
	public String getFortune() {
		//int randomNumber = (int)(Math.random() * 3);
		int randomNumber = ThreadLocalRandom.current().nextInt(0, 3);
		
		System.out.println("Random number: " + randomNumber);
		
		return fortunes[randomNumber];
	}

}
