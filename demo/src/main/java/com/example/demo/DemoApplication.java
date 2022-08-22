package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext data = SpringApplication.run(DemoApplication.class, args);
//		Springdemo obj = data.getBean(Springdemo.class);
//		obj.show("running success");
//		Prototype obj = data.getBean(Prototype.class);
//		obj.show();
//		Prototype obj1 = data.getBean(Prototype.class);
//		obj1.show();
		Laptop lap = data.getBean(Laptop.class);
		lap.display();
		lap.setBrandname("hp");
		System.out.println(lap.getBrandname());
	}
}
