package com.comparatorexamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentMain {
	
	public static void main(String[] args) {
		List<StudentComparator> students= new ArrayList<>();
		
		students.add(new StudentComparator(11,"salla",25));
		students.add(new StudentComparator(9,"amit",25));
		students.add(new StudentComparator(21,"durga",25));
		students.add(new StudentComparator(1,"bargav",25));
		
		Collections.sort(students, new StudentIdComparator());
		
		for(StudentComparator data: students) {
			System.out.println(data.getId()+" "+data.getName()+" "+data.getAge());
		}
		
		Collections.reverse(students);
		
		for(StudentComparator data: students) {
			System.out.println(data.getId()+" "+data.getName()+" "+data.getAge());
		}
		
		List<StudentComparator> students2= new ArrayList<>();
		
		students2.add(new StudentComparator(11,"salla",25));
		students2.add(new StudentComparator(9,"amit",25));
		students2.add(new StudentComparator(21,"durga",25));
		students2.add(new StudentComparator(1,"bargav",25));
		
		
		Collections.sort(students2, new StudentNameComparator());
		
		for(StudentComparator data: students2) {
			System.out.println(data.getId()+" "+data.getName()+" "+data.getAge());
			
		}
		Collections.reverse(students2);
		
		for(StudentComparator data: students2) {
			System.out.println(data.getId()+" "+data.getName()+" "+data.getAge());
			
		}
		
	}

}
