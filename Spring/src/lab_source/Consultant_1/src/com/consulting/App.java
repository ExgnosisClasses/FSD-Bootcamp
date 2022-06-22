
package com.consulting;

public class App {

	public static void main(String[] args) {
		
	  Consultant dilbert = new ITGuru();
	  System.out.println("ITGuru says " + dilbert.getAdvice());
	  
	  Consultant ratbert = new PRWhiz();
	  System.out.println("PRWhiz says " + ratbert.getAdvice());
	}
}
