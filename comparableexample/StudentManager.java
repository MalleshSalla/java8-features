package com.comparableexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentManager {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<>();

		students.add(new Student(11, "ritesh", 23));
		students.add(new Student(10, "sall", 21));
		students.add(new Student(21, "durga", 25));
		students.add(new Student(1, "shiva", 19));

		Collections.sort(students); // by using name we compared the objects
		System.out.println(students);
		
		for (Student student : students) {
			System.out.println(student.getId()+" "+student.getAge()+" "+student.getName());
		}

		Collections.reverse(students);
		System.out.println(students);

	}
}
