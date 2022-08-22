package Test;
//count individual vowels present in the given string

public class Program21 {

	public static void main(String[] args) {
		generate();
	}

	public static void generate() {
		String str = "doutaaihj";
		int count0 = 0, count1 = 0, count2 = 0, count3 = 0, count4 = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a') {
				count0++;
			}
			if (ch == 'e') {
				count1++;
			}
			if (ch == 'i') {
				count2++;
			}
			if (ch == 'o') {
				count3++;
			}
			if (ch == 'u') {
				count4++;
			}
		}
		System.out.println(count0 + " " + count1 + " " + count2 + " " + count3 + " " + count4);
	}
}
