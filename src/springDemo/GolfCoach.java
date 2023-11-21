package springDemo;

public class GolfCoach implements Coach {
 private FortuneService fortuneService;
 
 public GolfCoach() {
	 System.out.println("GolfCoach defalut constructor");
  }
	public GolfCoach(FortuneService fortuneService){
		
		System.out.println("Paramaterized golfCoach constructor");
	
	this.fortuneService = fortuneService;
}

	@Override
	public String getDailyWorkout() {		
		return "Practise for golf";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
