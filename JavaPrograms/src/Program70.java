//create int array and remove dublicate

public class Program70 {

	public static void main(String[] args) {
		remove();
	}

	public static void remove() {
		int ary[] = { 1, 2, 3, 7, 8, 4, 5, 9, 10, 3, 5, 5, 2 };
		int l = ary.length;
		for (int i = 0; i < l - 1; i++) {
			for (int j = i + 1; j < l; j++) {
				if (ary[i] == ary[j]) {
					ary[j] = ary[l - 1];
					l--;
				}
			}
		}
		for (int i = 0; i < l; i++) {
			System.out.println(ary[i]);
		}
	}
}
