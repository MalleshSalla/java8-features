package com.functionalinterface;

import java.util.function.Consumer;

public class ConsumerExample1 {
	public static void main(String[] args) {
		// using lambda expression
		Consumer<String> c = (s) -> System.out.println(s);
		c.accept("hello");

		ConsumerDemo consumerDemo = new ConsumerDemo();

		Consumer<String> consumer = (message) -> consumerDemo.message(message);

		consumer.accept("Lambda expression");
		
		// using method reference
		Consumer<String> consumer1 =  consumerDemo::message;
		consumer1.accept("method reference");


	}

}

class ConsumerDemo {
	public void message(String name) {
		System.out.println("coming from " + name);
	}
}
/*
 * Consumer is a functional interface that represents an operation that
 * accepts a single input argument and returns no result.
 */