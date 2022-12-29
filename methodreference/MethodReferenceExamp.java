package com.methodreference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

interface Printable {
	void print(String message);
}

public class MethodReferenceExamp {
	
	
	public void display(String message) {
		message = message.toUpperCase();
		System.out.println(message);
	}

	public static void main(String[] args) {

		// 1. method reference to a static method
		// lambda expression
		Function<Integer, Double> function1 = (input) -> (Math.sqrt(input));
		System.out.println(function1.apply(9));

		// using method reference

		Function<Integer, Double> function2 = Math::sqrt;
		System.out.println(function2.apply(16));

		// 
		// lambda expression
		BiFunction<Integer, Integer, Integer> biFunction1 = (a, b) -> MethodReferenceExamp.addition(a, b);
		System.out.println(biFunction1.apply(10, 20));

		// method reference
		BiFunction<Integer, Integer, Integer> biFunction2 = MethodReferenceExamp::addition;
		System.out.println(biFunction2.apply(25, 35));
		
		
		
		
		
		// 2. Method reference to an instance method of an object
		
		MethodReferenceExamp methodReferenceExamp = new MethodReferenceExamp();
		
		// lambda expression 
		Printable printable = (message)-> methodReferenceExamp.display(message);
		printable.print("hello world");
		
		//  method reference
		Printable printable1 =  methodReferenceExamp::display;
		printable1.print("hello world");
		
		/*
		 * 3. Reference to the instance method of an arbitrary object.
		 * 
		 *   sometimes, we call a method of argument in the lambda expression.
		 *   In that case, we can use a method reference  to call an instance method of an 
		 *   arbitrary object of a specific type.
		 * 
		*/
		
		//  using lambda expression
		Function<String,String> StringFunctionLambda = (String input) -> input.toLowerCase();
		System.out.println(StringFunctionLambda.apply("Mallesh Salla"));
		
		Function<String,String> StringFunctionMehthodReference = String::toLowerCase;
		System.out.println(StringFunctionMehthodReference.apply("Mallesh Salla"));
		
		
		String[] arr = {"a","e","o","i","u","A","U","O","E","I"};
		
		// using lambda expression
		Arrays.sort(arr, (s1,s2)->s1.compareToIgnoreCase(s2));
		
		for (String strArr : arr) {
			System.out.print(strArr+" ");
		}
		System.out.println("");
		
		//using method reference
		Arrays.sort(arr, String::compareToIgnoreCase);
		for (String strArr : arr) {
			System.out.print(strArr+" ");
		}
		
		// 4.  reference to a constructor
		
		List<String> fruits = new ArrayList<>();
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Orenge");fruits.add("Watermelon");	
	
		// using lambda expression
		Function<List<String>, Set<String>> setFunction = (fruitsList) -> new HashSet<>(fruitsList);
		System.err.println(setFunction.apply(fruits));

		// using method reference
		Function<List<String>,Set<String>> setFunctionMethodReference = HashSet::new;
		System.out.println(setFunctionMethodReference.apply(fruits));
		
		
		
	}

	private static int addition(int a, int b) {

		return (a + b);
	}

}
