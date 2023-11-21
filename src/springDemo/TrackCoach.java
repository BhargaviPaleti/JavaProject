package springDemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach() {}
	
	public TrackCoach(FortuneService fortuneService) {
	
	this.fortuneService = fortuneService;
	}

	public String  getDailyWorkout() {
		return "add extra workouts";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}
	
	
	public void domystartupMethod(){
		
		System.out.println("TrackCoach: inside method for startup");
	}
	
	public void doMyCleanupMethod() {
		
		System.out.println("TrackCoach: inside method for destroy/cleanup");
	}
}
