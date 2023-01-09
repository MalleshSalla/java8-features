package org.capgemini.genericexamples;

class Test1<T,U> {
	T o1;
	U o2;
 Test1(T o1, U o2) {
		super();
		this.o1 = o1;
		this.o2 = o2;
	}
	public void print() {
		System.out.println(o1);
		System.out.println(o2);
	}
}

// Driver class to test above
public class Classgeneric{
	public static void main(String[] args) {
		Test1<String,Integer> obj = new Test1<String,Integer>("mallesh",1001);
		obj.print();
	}

	
}