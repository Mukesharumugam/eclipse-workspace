package in.test;

public class Bufferdemo {

	public static void main(String[] args) {
		//StringBuffer str = new StringBuffer((CharSequence) System.in);
		StringBuffer str = new StringBuffer("Hello");
		String str1 = new String("light");
		System.out.println(str.append("HI"));
		System.out.println(str.capacity());
		System.out.println(str.replace(2, 4, "Java"));
		String s = str1.toUpperCase();
		System.out.println(s);
	}

}
