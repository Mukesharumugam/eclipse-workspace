//reverse a string

package Test;

public class Program23 {

	public static void main(String[] args) {
		produce();
	}

	public static void produce() {
		String str = "alan";
		String output = " ";
		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			output += ch;
		}
		System.out.println(output);
	}
}
