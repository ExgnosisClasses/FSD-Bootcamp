
package com.consulting;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
	ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("config.xml");
	
	
	Consultant dilbert = context.getBean("ITGuru",Consultant.class);
	Consultant ratbert =  context.getBean("SpinDoctor",Consultant.class);
	
	System.out.println("Dilbert says " + dilbert.getAdvice());
	System.out.println("Ratbert says " + ratbert.getAdvice());
	context.close();
	}
}
