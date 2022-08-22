import java.util.Arrays;

//create int array and print the count of unique elements

public class Program69 {

	public static void main(String[] args) {
		int ary[] = { 1, 2, 2, 3, 44, 5, 6, 7, 8, 8, 9, 10, 4, 10 };
		Arrays.sort(ary);
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
