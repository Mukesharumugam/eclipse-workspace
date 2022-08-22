//read a sentence and split and join it

package Test;

	import java.util.Scanner;

	public class Program52 {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			String input = scan.nextLine();
			scan.close();
			generate(input);
		}

		public static void generate(String str) {
			String [] str2 = str.split(" ", 4);
			for (int i = 0; i < str2.length; i++) {
				System.out.print(str2[i]);
			}
				String str3 = str.join(" "," a","b","c","d");
				System.out.println(str3);
			}	
			}
