package com.example.demo;

import org.springframework.stereotype.Component;

@Component //Default ->Singleton model Spring framework //It indicate that this class needs a bean.//prehand object is created 
//object is created once
public class Springdemo {

	String name;

	public void show(String name) {
		this.name = name;
		System.out.println(name);
	}
}
