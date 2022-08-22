//create int array and update existing element at a given index

import java.util.Scanner;

public class Program73 {

	final static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int[] ary1 = getInput();
		int index = getIndex();
		int element = getElement();
		ary1 = update(ary1, index, element);
		print(ary1);
	}
	public static int[] getInput() {
		int arr[] = new int[scan.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		return arr;
	}

	public static int getIndex() {
		return scan.nextInt();
	}

	public static int getElement() {
		return scan.nextInt();
	}

	public static int[] update(int input[], int index, int newElement) {
		input[index] = newElement;
		return input;
	}
	
	

	public static void print(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
