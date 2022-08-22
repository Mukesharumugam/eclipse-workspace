
//extract a character based on the given index 
import java.util.Scanner;

public class Program14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		produce(input);
	}

	public static void produce(String str) {
		System.out.println(str.charAt(3));
	}

}