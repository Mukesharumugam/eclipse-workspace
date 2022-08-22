//create int array and remove duplicate

package Test;

public class Program70 {
	
	public static void main (String[] args) {
		int ary [] = {1,2,3,2,7,8,25,99,100};
		int l = ary.length;
		for (int i = 0; i < l - 1; i++) {
			for (int j = i + 1; j < l; j++) {
				if (ary[i] == ary[j]) {
					ary[j] = ary[l-1];
					l--;
				}
			}
		}
		for (int i = 0; i < l; i++) {
			System.out.println(ary[i]);
		}
	}

}
