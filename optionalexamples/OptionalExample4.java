package com.optionalexamples;

import java.util.Optional;

public class OptionalExample4 {

	public static void main(String[] args) {
		
		String result = "  abc";
		if (result!=null&&result.contains("abc")) {
			System.out.println(result);
		}
		
		
		Optional<String> optional = Optional.of(result);
		optional.filter(res -> res.contains("abc")).map(String::trim).ifPresent((res)->System.out.println(res));
	}

}
