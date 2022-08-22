//create two array and print only the common elements present in both array

public class Program67 {
	
	public static void main (String[] args) {
		int ary1 [] = {1,2,3,5,4,6,7,8,10};
		int ary2 [] = {10,2,17,18,19};
		for (int i = 0; i < ary1.length; i++) {
			for (int j =0; j < ary2.length; j++) {
				if (ary1[i] == ary2[j]) {
					System.out.println(ary1[i]);
				}
			}
		}
	
	}
}
