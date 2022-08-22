//create two array and print only the common element present in both the array

package Test;

public class Program67 {

	public static void main(String[] args) {
		int ary1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 10 };
		int ary2[] = { 10, 2, 17, 18, 19 };
		for (int i = 0; i < ary1.length; i++) {
			for (int j = 0; j < ary2.length; j++) {
				if (ary1[i] == ary2[j]) {
					System.out.println(ary2[j]);

				}
			}
		}
	}
}
