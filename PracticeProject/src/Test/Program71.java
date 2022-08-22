package Test;

import java.util.Scanner;

public class Program71 {
	
	public static void main (String [] args) {
		int ary [] = {111,2,3,4,5};
		int index = 4, element = 88;
		int ary2[] = new int [ary.length];
		for (int i = 0; i < index; i++) {
			ary2[i] = ary[i];
		}
		for (int i = 0; i < ary.length; i++) {
			if (i == index) {
				ary[i] = element;
			}
		}
		for (int i = index; i < ary.length; i++) {
			ary2[i] = ary[i];
		}
		for (int i = 0; i < ary2.length; i++) {
			System.out.print(ary2[i] + " ,");
		}	
	}
}
