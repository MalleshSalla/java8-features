package com.optionalexamples;

import java.util.Optional;

public class OptionalExample3 {
	public static void main(String[] args) {
		String str = "Hello";
		Optional<String> opt = Optional.ofNullable(str);
		if (opt.isPresent()) {
			System.out.println(opt.get());
		}
		opt.ifPresent(s -> System.out.println(s.toUpperCase()));
		System.out.println(opt.orElse("World")); // "Hello"
		System.out.println(Optional.ofNullable(null).orElseGet(() -> "World"));
	}
}