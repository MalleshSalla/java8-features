package com.comparatorexamples;

import java.util.Comparator;

public class StudentIdComparator implements Comparator<StudentComparator>{

	
	
	
	@Override
	public int compare(StudentComparator o1, StudentComparator o2) {
		if (o1.getId()==o2.getId()) {
			return 0;
		}
		else if(o1.getId()>o2.getId()) {
			return 1;
		}
		else {
			return -1;
		}		
	}
	
}
