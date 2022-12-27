package com.streamexample;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class CreateStreamObjects {

	public static void main(String[] args) {
		
		// create a stream object
		
		Stream<String> stream1 = Stream.of("a","b","c");
		stream1.forEach(System.out::println);
		
		//create a stream from sources
		Collection<String> collection1 = Arrays.asList("JAVA","J2EE","SPRING","HIBERNET");
		Stream<String> stream2 = collection1.stream();
		stream2.forEach(System.out::println);
		
		List<String> list1 = Arrays.asList("JAVA1","J2EE1","SPRING1","HIBERNET1");
		Stream<String> stream3 = list1.stream();
		stream3.forEach(System.out::println);
		
	
		Set<String> set1 = new HashSet<>(list1);
		Stream<String> stream4 = set1.stream();
		stream4.forEach(System.out::println);
		
		String[] strArray = {"a","b","c"};
		Stream<String> stream5 = Arrays.stream(strArray);
		stream5.forEach(System.out::println);
		
		/*
		 * Introduced in Java 8, the Stream API is used to process collections of objects.
		 * A stream is a sequence of objects that supports various methods which can be pipelined to produce the desired result.
           
           The features of Java stream are –

           1) A stream is not a data structure instead it takes input from the Collections, Arrays or I/O channels.
           2) Streams don’t change the original data structure, they only provide the result as per the pipelined methods.
           3) Each intermediate operation is lazily executed and returns a stream as a result, hence various intermediate operations can be pipelined.
           4) Terminal operations mark the end of the stream and return the result.
           
           */
		
		

	}

}
