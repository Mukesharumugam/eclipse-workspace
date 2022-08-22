package com.learning;

import java.time.LocalDateTime;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionInter {
	
	public static void main(String[] args) {
		Function<String,Integer> obj = (str) -> str.length();
		System.out.println(obj.apply("Mukesh"));
		Consumer<String> obj1 = (str) -> System.out.println(str);
		obj1.accept("java");
		Supplier<LocalDateTime> obj2 = () -> LocalDateTime.now();
		System.out.println(obj2.get());
		Supplier<String> obj3 = () -> String.valueOf('u');
		System.out.println(obj3.get());
	}
}
