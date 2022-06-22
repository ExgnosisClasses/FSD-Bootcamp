
package com.consulting;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
	ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("config.xml");
	
	
	Consultant dilbert = context.getBean("ITGuru",Consultant.class);
	Consultant wally =  context.getBean("ITGuru",Consultant.class);
	
	System.out.println("Dilbert says " + dilbert.getAdvice());
	System.out.println("Wally says " + wally.getAdvice());
	context.close();
	}
}
