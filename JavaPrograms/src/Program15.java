
//extract index number based on the given character
import java.util.Scanner;

public class Program15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		produce(input);
	}

	public static void produce(String str) {
		System.out.println(str.indexOf('m'));

	}

}
