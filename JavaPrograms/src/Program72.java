//create int array and remove an element at a given index

import java.util.Scanner;

public class Program72 {
	
	final static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int[] arr1 = getInputArr();
		int index = getInput();
		arr1 = remove(arr1, index);
		print(arr1);
	}
	
	public static int[] getInputArr() { 
		int arr[] = new int[scan.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		return arr;
	}
	
	public static int getInput() {
		return scan.nextInt();
	}

	public static int[] remove(int[] input,int index) {
		int output[] = new int[input.length - 1];		
		int j = 0;
		for (int i = 0; i < input.length; i++) {
			if (i != index) {
				output[j] = input[i];
				j++;
			}
		}
		return output;
	}
	
	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
}
