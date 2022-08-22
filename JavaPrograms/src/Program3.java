//print the numbers from 1 to 100 except 25

public class Program3 {

	public static void main(String[] args) {
		print1to100();
	}

	public static void print1to100() {
		for (int i = 1; i <= 100; i++) {
			if (i != 25) {
				System.out.println(i);

			}
		}
	}
}