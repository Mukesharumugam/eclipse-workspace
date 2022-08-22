//print numbers divisible by 3 between 20 and 60 incl.

public class Program1 {
	
	public static void main(String[] args) {
		printbw20and60();
	}

	public static void printbw20and60() {
		for (int i = 20; i <= 60; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
	}
}
