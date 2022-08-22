//create int array and print all the elements located at even index

public class Program58 {

	public static void main(String[] args) {
		locate();
	}

	public static void locate() {
		int ary[] = { 4, 2, 7, 1, 5, 3 };
		for (int i = 0; i < ary.length; i++) {
			if (i % 2 == 0) {
				System.out.println(ary[i]);
			}
		}
	}
}
