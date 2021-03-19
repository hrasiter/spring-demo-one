package com.udemy.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {

		//load spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// retrieve bean from spring container
		
		Coach theCoach = context.getBean("footballCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("footballCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		//check they are same
		
		boolean result = (theCoach == alphaCoach);
		
		System.out.println("\nPointing the same object: " + result);
		
		System.out.println("\nMemory address for theCoach: " + theCoach);
		
		System.out.println("\nMemory address for alphaCoach: " + alphaCoach + "\n");
		
		
		//close context
		context.close();
		
	}

}
