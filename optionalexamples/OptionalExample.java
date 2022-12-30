package com.optionalexamples;

import java.lang.StackWalker.Option;
import java.util.Optional;

public class OptionalExample {

	
	public static void main(String[] args) {
		
		//  of,empty,ofNullable
		
		String email = null;
		Optional<Object> emptyOptional = Optional.empty();
		System.out.println(emptyOptional); //Optional.empty
		
		// Create an Optional object with a value 
	    Optional<String> optional1 = Optional.of("Hello");
	    System.out.println(optional1);//Optional[Hello]
	    
	    // Optional.of(email)  return NullPointerException if it contains null value
	    //Optional<String> optional2 = Optional.of(email);
	    // System.out.println(optional2);
	    
	    //  ofNullable(Object )
	    Optional<String> optional3 = Optional.ofNullable(email);
	    System.out.println(optional3);//Optional[mallesh@email.com]
	   // System.out.println(optional3.get());
	    //  mallesh@email.com    or  NoSuchElementException: No value present
	    
		// Check if the Optional object is empty
		 
	    if (!emptyOptional.isPresent()) {
	      System.out.println("The Optional object is empty.");
	    }
				
	    // orElse() is used to give defalut value when our value is null.
	    Optional<String> optional4 = Optional.ofNullable(email);
	    String defaultValue = optional4.orElse("defalut@gmail.com");
	    System.out.println(defaultValue);
	    
	    // orElseGet() method is accepts supplier interface 
	    String defaultValue1 = optional4.orElseGet(()-> "default@gmail.com");
	    System.out.println(defaultValue1);
	    
	    //String optional5 = optional4.orElseThrow(()-> new IllegalArgumentException("Email is not found"));
	    //System.out.println(optional5);
	    
	    Optional<String> gender = Optional.of("Male");
	    Optional<String> emptyOptional1 = Optional.empty();
	    gender.ifPresent((s)-> System.out.println("value is present"));
	    
	   
	    
 	    
	}

}
