package com.luv2code.springdemo;

public class TrackCoach implements Coach {
    private FortuneService fortuneService;
	
	public TrackCoach(FortuneService theFortuneService) {
		 fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just Do It: "+fortuneService.getFortune();
	}

	
	// add initt methood
	
	public void doStartup() {
		System.out.println("inside init methood");
		
	}
	
	
	// add destroy method
	
	public void doDestroy() {
		System.out.println("inside destroy methood");
	}
}










