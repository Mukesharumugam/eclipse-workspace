import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int arr[] = new int[scan.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		int index = scan.nextInt();
		
		arr = remove(arr, index);
		print(arr);
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
