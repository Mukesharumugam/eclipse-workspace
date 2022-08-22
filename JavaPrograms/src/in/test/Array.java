package in.test;

import java.util.*;
import java.io.*;

class Array {

	public static int[] ArrayChallenge(int size) {
		int[] arr = new int[size];
		arr[0] = 4;
		arr[1] = 5;
		arr[2] = -2;
		arr[3] = 3;
		arr[4] = 1;
		arr[5] = 2;
		arr[6] = 6;
		arr[7] = 6;
		Arrays.sort(arr);
		return arr;
	}

	public static void main(String[] args) {
		// keep this function call here
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		System.out.println(ArrayChallenge(size).hashCode());
	}

}
