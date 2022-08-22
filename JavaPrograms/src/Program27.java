
public class Program27 {

	public static void generate(String str) {
		String vow = "aeiou";
		int count = 0;
		for (int i = 0; i < 5;i++) {
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == vow.charAt(i)) {
					count++;
				}
			}
			System.out.println(count);
		}
	}

}
