package com.example.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component // Singleton model
@Scope(value = "prototype") // Prototype model//when ever we call it create object.
public class Prototype {
	String name;

	public Prototype() {
		super();
		System.out.println("hello java");
	}

	public void show() {
		System.out.println("object success");
	}
}
