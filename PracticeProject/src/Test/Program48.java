package Test;

	import java.util.Scanner;

	public class Program48 {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			String input = scan.nextLine();
			scan.close();
			generate(input);
		}

		public static void generate(String str) {
			int i = 0;
			int n = str.length();
			while (i < n && str.charAt(i) == ' ') {
				i++;
			}
			while (i < n && str.charAt(n-1) == ' ') {
				n--;
			}
			System.out.println(str.substring(i, n));
			}
		}
