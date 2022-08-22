package com.learning;

import java.util.*;

public class Collectiondemo {

	public static void main(String[] args) {
		List <Integer> values = new ArrayList <>();
		values.add(0,34);
		values.add(1,45);
		values.add(2,23);
		values.add(1,50);
		values.set(0, 10);
//		for (int i = 0; i < values.size(); i++) {
//			//System.out.println(values.get(0));
//		}
//		System.out.println(values.get(1));
		values.forEach(i -> System.err.println(i));
//		Set values = new TreeSet();
//		values.add(98);
//		values.add(12);
//		values.add(12);
//		values.add(3);
		//System.out.println(values);
		//values.forEach(i -> System.out.println(i));
	}
}
