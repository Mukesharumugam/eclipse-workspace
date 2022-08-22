//find the nth biggest element in the array

import java.util.Arrays;
import java.util.Scanner;

public class Program76 {

	final static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int[] ary = getInputArr();
		int nTh = getPostion();
		nthBiggest(ary, nTh);
	}

	public static int[] getInputArr() {
		int ary[] = new int[scan.nextInt()];
		for (int i = 0; i < ary.length; i++) {
			ary[i] = scan.nextInt();
		}
		return ary;
	}

	public static int[] sortArray(int ary[]) {
		//write your own sorting method
		Arrays.sort(ary);
		return ary;
	}

	public static int getPostion() {
		return scan.nextInt();
	}

	public static void nthBiggest(int input[], int nTh) {
		input = sortArray(input);
			System.out.println(input[input.length - nTh]);
		}
	}
