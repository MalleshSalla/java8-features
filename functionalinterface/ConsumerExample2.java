package com.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;



public class ConsumerExample2 {
	


	public static void main(String[] args) {
		
		List<Integer> list1 = Arrays.asList(12,34,22,45,64,39);
		Consumer<List<Integer>> consumer1 = ConsumerSum::sumWithInteger;
		System.out.print("The sum of Integer Array list is  ");
		consumer1.accept(list1);
		
		List<Double> list2 = Arrays.asList(10.10,43.43,34.87,32.33,12.24);
		Consumer<List<Double>> consumer2 = ConsumerSum::sumWithDouble;
		System.out.print("The sum of Double Array list is  ");
		consumer2.accept(list2);
		

	}	
}



class ConsumerSum{
	
	public static void sumWithInteger(List<Integer> list) {
		
		int sumInt = list.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sumInt);
	}

	public static void sumWithDouble(List<Double> list) {
		double sumDouble = list.stream().mapToDouble(Double::doubleValue).sum();
		System.out.println(sumDouble);
	}
	
}


