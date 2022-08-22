// create int array and find average of array elements

import java.util.Scanner;

public class Program61 {

	public static void main(String[] args) {
		average();
	}

	public static void average() {
		int sum = 0;
		double avg;
		int ary[] = new int[5];
		for (int i = 0; i < 5; i++) {
			Scanner scan = new Scanner(System.in);
			ary[i] = scan.nextInt();
		}
		for (int i = 0; i < ary.length; i++) {
			sum += ary[i];
			//avg = sum / ary[i];  
		}
		//avg = sum / 5;
		avg =  (double) sum / 5;
		for (int i = 0; i < ary.length; i++) {
		}
		System.out.println(avg);
	}
}
