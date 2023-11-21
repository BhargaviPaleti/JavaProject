package springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjection {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext obj= new ClassPathXmlApplicationContext("Beans.xml");
		
		CricketCoach theCoach = obj.getBean("CricketCoach",CricketCoach.class);
		
		System.out.println("\nString method for CrickrtCoach: " + theCoach.getDailyWorkout());
		
		System.out.println("\nsetter method for CricketCoach: " + theCoach.getDailyFortune());
		
		System.out.println("\nsetter method for emailAddress: "+ theCoach.getEmailAddress());
		
		System.out.println("\nsetter method for Team: "+ theCoach.getTeam());

}
}