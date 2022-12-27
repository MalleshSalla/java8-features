package com.streamexample;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ArraySorting {
	
	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(11, 2, 5, 3, 2, 55, 32, 34);
		
	
		Collections.sort(list);
		
		System.out.println(list);
		
		
		list.sort(Comparator.reverseOrder());
		System.out.println(list); // sorting in reverse order
		 
		
		
		/*  2nd of sorting array
		 * 
		 * 
		List<Integer> list1 = list.stream().sorted().collect(Collectors.toList());
		
		System.out.println(list1);
		
		//   sorting in reverse order 
			list = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
			
			System.out.println(list);
		
		*/
		
		
		
		 /*  3rd way of sorting array
		  * 
		  * 
		  * 
	    list.sort(Integer::compareTo);

	    System.out.println(list);
		
		//  sorting in reverse order
		Collections.sort(list,Comparator.reverseOrder());
		
		System.out.println(list);
		*/
		
		
		
		
	}
	
}
