package springDemo;



import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext Context= new ClassPathXmlApplicationContext("Beans.xml");
      //Retrieve bean from container
      Coach theCoach= Context.getBean("myCoach",Coach.class);
      //call methods on bean
      System.out.println(theCoach.getDailyWorkout());
      System.out.println("Just do it for trackCoach: " + theCoach.getDailyFortune());
      //close the Context
      Context.close();
    
    
       
	}
}
