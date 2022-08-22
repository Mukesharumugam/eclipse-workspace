package com.learning;

//class thread implements Runnable {
//	public void run() {
//		System.out.println("hi");
//	}
//}
public class Runnabledemo {
	public static void main(String[] args) {
//		Thread t1 = new Thread(new thread());
//		t1.start();
//		thread obj = new thread ();
//		Thread t1 = new Thread(obj);
//		Runnable obj = () -> System.out.println("hllo");
//		Thread t2 = new Thread(obj);
//		t2.start();
		Thread obj = new Thread(() -> System.out.println("hello"));
		obj.start();
	}
}
