//read a sentence and reverse in the given format

public class Program54 {

	public static void main(String[] args) {
		reverse();
	}

	public static void reverse() {
		String str = "wish you all the best ";
		String [] str2 = str.split(" ");
		for ( int i = str2.length-1; i >= 0; i--) {
			System.out.print(str2[i] + " ");	
		}
	}
}
	