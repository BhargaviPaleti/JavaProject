package springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeansLifeCycle {

	public static void main(String[] args) {
		
		
		ClassPathXmlApplicationContext obj3= new ClassPathXmlApplicationContext("BeansLifeCycle.xml");
		
		TrackCoach blc = obj3.getBean("TCoach", TrackCoach.class);
		
		System.out.println(blc.getDailyWorkout());
		
		obj3.close();
		
		
	}

}
