package com.luv2code.springdemo;

public class CricketCoach implements Coach{
    private String emailAddress;
    private String team;
	private FortuneService fortuneService;
	
	public CricketCoach() {
		System.out.println("CricketCoach : inside no-args constructor");
	}
	@Override
	public String getDailyWorkout() {
		return "Practise fast bowlling 15m ";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach : inside setter method - setFortuneService");

		this.fortuneService = fortuneService;
	}
	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach : inside setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}
	public void setTeam(String team) {
		System.out.println("CricketCoach : inside setter method - setTeam");
		this.team = team;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public String getTeam() {
		return team;
	}

}
