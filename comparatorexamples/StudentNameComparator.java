package com.comparatorexamples;

import java.util.Comparator;

public class StudentNameComparator implements Comparator<StudentComparator> {
	
	public int compare(StudentComparator o1,StudentComparator o2) {
		
		return o1.getName().compareTo(o2.getName());
	}

}
