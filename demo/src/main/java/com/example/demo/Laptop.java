package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
	
	private String brandname;
	private String model;
	@Autowired//Search object by type.
	@Qualifier("user1")//Search object by name.
	private Enduser user;
	public Enduser getUser() {
		return user;
	}
	public void setUser(Enduser user) {
		this.user = user;
	}
	public String getBrandname() {
		return brandname;
	}
	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void display() {
		System.out.println("yours datas");
		user.show();
	}

}
