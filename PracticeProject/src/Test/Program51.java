//count number of words present in the given sentence

package Test;

	import java.util.Scanner;

	public class Program51 {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			String input = scan.nextLine();
			scan.close();
			generate(input);
		}

		public static void generate(String str) {
			System.out.println(str.length());
		}
}
