package com.learning;

import java.util.Scanner;

public class ContinueAndBreak {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int i = 0;
		/*while (i <= input) {
			i++;
			if (i == 4) {
				continue;
			}
			System.out.println(i);*/
			//i++;
			/*
			 * for (int i = 1; i <= input; i++) { if (i == 4) { continue; }
			 * System.out.println(i); }
			 */
			/*
			 * do { i++; if (i == 4) { continue; } System.out.println(i); }while (i <=
			 * input);
			 */
			/*
			 * for (int i = 1; i <= input; i++) { if (i == 4) { break; }
			 * System.out.println(i); }
			 */
		/*while (i <= input) {
			if (i > 6) {
				break;
			}
			System.out.println(i);
			i++;*/
		do {
			if (i > 6) {
				break;
			}
			System.out.println(i);
			i++;
		}while (i <= input);
		}
	}
