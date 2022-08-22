//count each element present in the array

package Test;

public class Program68 {

	public static void main(String[] args) {
		int ary[] = { 2, 2, 3, 44, 5, 6, 7, 6, 8, 8, 4, 3, 7 };
		int count;
		for (int i = 0; i < ary.length; i++) {
			count = 1;
			for (int j = i + 1; j < ary.length; j++) {
				if (ary[i] == ary[j])
					count++;
				else
					break;
			}
			System.out.println(ary[i] + " =" + count);
			i += (count - 1);

		}
	}
}
