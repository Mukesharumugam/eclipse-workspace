package com.learning;

class Ready implements Runnable {
	public void run() {
		System.out.println("hello");
	}
}

public class Threaddemo {

	public static void main(String[] args) {
		Thread obj = new Thread(new Ready());
		//Ready obj2 = new Ready();
		//obj.start();
		obj.run();
	}
}
