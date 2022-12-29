package com.functionalinterface;

import java.util.function.Function;

/*class FunctionImpl implements Function<String, Integer>{

	@Override
	public Integer apply(String s) {	
		return s.length();
	}	
}*/

public class FunctionInterfaceExample2 {
	
	public static void main(String[] args) {
		
//		Function<String, Integer> fun =new FunctionImpl();
//		System.out.println(fun.apply("Salla Mallesh"));
		
		Function<String, Integer> fun = (s)-> s.length();
		
		System.out.println(fun.apply("Salla Mallesh Yadav"));
		
		
	}
	
	
	
	
}
