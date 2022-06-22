
package com.consulting;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
	ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("config.xml");
	
	
	Consultant dilbert = context.getBean("ITGuru",Consultant.class);
	Consultant wally =  context.getBean("ITGuru",Consultant.class);
	Consultant ratbert = context.getBean("SpinDoctor",Consultant.class);
	Consultant catbert = context.getBean("SpinDoctor",Consultant.class);
	
	System.out.println("Wally="+wally + " Dilbert="+ dilbert );
	System.out.println("Ratbert="+ratbert + " Catbert="+ catbert );
	context.close();
	}
}
