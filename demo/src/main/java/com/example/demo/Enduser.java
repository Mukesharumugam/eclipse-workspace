package com.example.demo;

import org.springframework.stereotype.Component;

@Component("user1")
public class Enduser {

	private int userid;
	private String usernamae;

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUsernamae() {
		return usernamae;
	}

	public void setUsernamae(String usernamae) {
		this.usernamae = usernamae;
	}

	@Override
	public String toString() {
		return "Enduser [userid=" + userid + ", usernamae=" + usernamae + "]";
	}

	public void show() {
		System.out.println("hello user");
	}
}
