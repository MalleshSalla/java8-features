package com.functionalinterface;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Random;
import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;
import java.util.function.Supplier;


/*class SupplierImp implements Supplier<LocalDateTime>{

	@Override
	public LocalDateTime get() {
		return LocalDateTime.now();
	}
	
}*/

public class SupplyExample {
	
	static String product = "Android";
	  static double price = 659.50;
	
	
	public static void main(String[] args) {
		
		
		/*
		 * Supplier<LocalDateTime> supplierLocalTimeDate = new SupplierImp();
		 * System.out.println(supplierLocalTimeDate.get());
		 */
		
		Supplier<LocalDateTime> supplierLocalTimeDate1 = () -> LocalDateTime.now();
		System.out.println(supplierLocalTimeDate1.get());
		Supplier<String> uppeCasesupplier =  product::toUpperCase;
		Supplier<Boolean> booleanSupplier = ()-> product.length()==7;
		Supplier<Integer>  intSupplier = ()-> product.length()-2;
		
		System.out.println(uppeCasesupplier.get());
		System.out.println(booleanSupplier.get());
		System.out.println(intSupplier.get());
		
		
		Supplier<Integer> randomNumSupplier = SupplyExample::getTwoDigitRandom;
		
		System.out.println(randomNumSupplier.get());
		
		
		
		
		
		
		
		BooleanSupplier boolSupplier = () -> product.length() == 10;
        IntSupplier intValueSupplier = () -> product.length() - 2;
        DoubleSupplier doubleSupplier = () -> price -20;
        LongSupplier longSupplier = () -> new Date().getTime();
        
        
        System.out.println(boolSupplier.getAsBoolean());//false
        System.out.println(intValueSupplier.getAsInt());//5
        System.out.println(doubleSupplier.getAsDouble());//639.5
        System.out.println(longSupplier.getAsLong());// 1581187440978 (it depends on current time)
        
		
	}
	
	public static Integer getTwoDigitRandom() {
		
		int random = new Random().nextInt(100);
		if(random<10) {
			return 10;
		}
		return random;
		
	}
	

}
/*
 * Supplier is a functional interface whose functional method is  get(). 
 * The Supplier interface represents an operation that takes no argument 
 * and returns a result.
 * 
 */
