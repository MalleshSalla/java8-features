package org.capgemini.genericexamples;

public class Test {
	// generic method example
	static <T> void genericDisplay(T element) {
		System.out.println(element.getClass().getName() + " + "+ element);
	}
	
	public static void main(String[] args) {
		//calling generic method with Integer argument
		genericDisplay(3456);
		
		//Calling generic method with String argument
		genericDisplay("mallesh");
		
		//Calling generic method with double argument
		genericDisplay(2.0);
		
	}
}
	
