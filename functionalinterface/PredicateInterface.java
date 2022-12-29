package com.functionalinterface;

import java.util.function.Predicate;

public class PredicateInterface {

	public static void main(String[] args) {
		int[] arr = { 10, 8, 12, 15, 7, 21 };

		Predicate<Integer> obj1 = s -> s % 2 == 0;

		for (int data : arr) {

			if (obj1.test(data)) {
				System.out.println(data);
			}
		}
	}

}


/*
 * A java Predicate is a functional interface whose functional method is
 * test(Object), that takes an argument and returns boolean value.
 */