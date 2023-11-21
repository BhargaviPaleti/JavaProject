package springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeDIusingSArray {

	public static void main(String[] args) {
			
		/*
		 * Test test = new Test("2", "5");
		 * 
		 * test.testMethod();
		 * 
		 * Test test1 = new Test();
		 * 
		 * test1.testMethod();
		 */
		 
		//GolfCoach a = new GolfCoach();
		
		
		  ClassPathXmlApplicationContext obj1 = new
		  ClassPathXmlApplicationContext("Beans.xml");
		  
		  GolfCoach GCoach= obj1.getBean("GCoach",GolfCoach.class );
		  
		  
		  System.out.println(GCoach.getDailyWorkout());
		  System.out.println(GCoach.getDailyFortune());
		  
		  
		 
	}

}
