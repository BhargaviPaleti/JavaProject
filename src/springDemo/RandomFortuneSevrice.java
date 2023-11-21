package springDemo;

import java.util.Random;

public class RandomFortuneSevrice implements FortuneService {
	
	  public String[] array = {"ABC","2","Testing random string array"};
	 
	  Random R=new Random();

	@Override
	public String getFortune() {
		
		int randomString = R.nextInt(array.length);
		
		//System.out.println("Array Index is :"+randomString);
		String fortuneService= array[randomString];
		
		return fortuneService;
	}
}
