package springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeansScope {

	public static void main(String[] args) {
	
		ClassPathXmlApplicationContext  obj2= new ClassPathXmlApplicationContext("BeansScope.xml");
		
		TrackCoach theCoach= obj2.getBean("TrackCoach",TrackCoach.class);
		 
		TrackCoach exaCoach= obj2.getBean("TrackCoach",TrackCoach.class);
		
		boolean results= (theCoach==exaCoach);
		
		System.out.println("\nBeanScope reults object reference is same it will display true : " +results);
		
		
		System.out.println("\nBeanScope reference for the object theCoach" +theCoach);
		
		
		System.out.println("\nBeanScope reference for the object exaCoach" +exaCoach);
		
		
		
	}

}
