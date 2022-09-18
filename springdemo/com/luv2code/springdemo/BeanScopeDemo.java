package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {

	public static void main(String[] args) {

		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// retrieve the bean from spring container
		
		Coach theCoach = context.getBean("myTrackCoach",Coach.class);
		
		Coach alphaCoach = context.getBean("myTrackCoach",Coach.class);
		
		// chekc if the re the same bean
		
		boolean result = (theCoach == alphaCoach);
		
		System.out.println("result : "+result);
		
		System.out.println("memory location for theCoah : "+theCoach);
		
		System.out.println("memory location for alphaCoach : "+alphaCoach);
	}

}
