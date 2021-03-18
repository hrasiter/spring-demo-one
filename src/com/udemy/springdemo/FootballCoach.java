package com.udemy.springdemo;

public class FootballCoach implements Coach {

	private FortuneService fortuneService;
	
	
	public FootballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Take 10 penalties.";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Hey Alex: " + fortuneService.getFortune();
	}

}
