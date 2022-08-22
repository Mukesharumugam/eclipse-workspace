//create two int array and print the numbers that are missing in 1st aray which is not present in 2nd aray

package Test;

public class Program65 {

	public static void main(String[] args) {	
		int[] ary = { 4, 5, 6, 1, 2, 7, 9, 8, 10 };
		int[] ary2 = { 10, 20, 3, 40 };
		int n = ary.length + 1;
		int sum = (n * (n + 1)) / 2;
		//System.out.println("oooo"+sum);
		for (int i = 0; i < ary.length; i++) {
			for (int j = 0; j < ary2.length; j++) {
			sum -= ary[i];
			if( sum != ary2[j]) {
				System.out.println(sum);
				
			}
		}
		//for (int j = 0; j < ary2.length; j++) {
			//if (sum != ary2[j]) {
				//System.out.println(sum);

			}
		}
	}

