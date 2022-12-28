
package com.lambdaexpression;


interface Shape {	
	public void draw();
}

public class LambdaExample {
	public static void main(String[] args) {
		
		Shape circle = ()-> System.out.println("circle shape");
		
		Shape squre = ()->System.out.println("square shappe");
		
		Shape rectangle = ()->System.out.println("rectangle shape");
		
		print(circle);
		print(squre);
		print(rectangle);
		
	}

	private static void print(Shape shape) {
		
		shape.draw();
	}
	
	
}



