//find the 1st biggest and first smallest element in the array
import java.util.Arrays;
import java.util.Scanner;

public class Program75 {
	
	public static void main (String[] args) {
		int [] ary = getinput();
		biggest(ary);
		smallest(ary);
	}
	
	public static int [] getinput() {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int [] ary = new int [size];
		for (int i = 0; i < size; i++) {
			ary[i] = scan.nextInt();
		}
		return ary;
	}
	public static void biggest(int [] ary) {
		//Arrays.sort(ary);
		int big = ary[0];
		for (int i = 1; i < ary.length; i++) {
			if (ary[i] > big) {
				big = ary[i];
			}
		}
		System.out.println(big);
	}
	public static void smallest(int [] ary) {
		//Arrays.sort(ary);
		int small = ary[0];
		for (int i = 1; i < ary.length; i++) {
			if (ary[i] < small) {
				small = ary[i];
			}
		}
		System.out.println(small);
	}
}
