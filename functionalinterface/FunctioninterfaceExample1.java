package com.functionalinterface;

import java.util.function.Function;




public class FunctioninterfaceExample1 {

	public static void main(String[] args) {
		
		
		int [] n = {1,2,43,4,5,6,7};
		
		Function<Integer,Boolean> fn = i -> (i%2==0);
		
		for(Integer data: n) {	
			if (fn.apply(data)) {
				System.out.println(data);
			}
		}
		
		System.out.println("---------------------");
		
		
		String str[] = {"sachin","dhoni","kohli","abc"};
		
		Function<String,String> p1 = i-> (i.toUpperCase());
		
		function(p1,str);
	}

	private static void function(Function<String, String> p1, String[] s) {
		for(String data:s) {
			System.out.println(p1.apply(data));
		}	
	}
}

/*
 * Java 8 Function interface is exactly same as Predicate except that functions
 * can return any type of result but function should(can) return only one value
 * and that value can be any type. This is a functional interface whose
 * functional method is apply(Object).
 */		
