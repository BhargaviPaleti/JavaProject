package springDemo;

public class CricketCoach implements Coach {
    private String emailAddress;
    private String team;
    
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	private FortuneService fortuneService;
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice for fast bowling";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}


	
}
