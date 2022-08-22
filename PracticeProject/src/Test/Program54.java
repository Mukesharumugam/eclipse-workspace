//read a sentence and reverse in the given format

package Test;

	public class Program54 {
		public static void main(String[] args) {
			generate();
		}

		public static void generate() {
			String str = " wish you all the best";
			String [] sp = str.split(" ");
			String str2 = "";
			for (int i = 0; i < sp.length; i++)
			{
				String word = sp[i];
				System.out.println(word);
				String str3 = "";
			for (int j = word.length()-1; j >= 0; j--) {
				str3 += word.charAt(i);
			}
			str2 += str3;
		}
			System.out.println(str);
			System.out.println(str2);
			
	}
}