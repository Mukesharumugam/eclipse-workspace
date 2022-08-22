//create int array and insert new element  at a given index

public class Program71 {
	
	public static void main (String[] args) {
		insert();
	}
	
	public static void insert() {
		int ary [] = {1,2,3,6,7,8};
		int ary2 [] = new int [ary.length + 1];
		int pos = 4,element = 4;
		for (int i = 0; i < pos; i++) {
			ary2[i] = ary[i];
		} 
		ary2[pos] = element;
		for (int i = pos +1; i <= ary.length; i++) {
			ary2[i] = ary[i - 1];
		}
		for (int i = 0; i < ary2.length; i++) {
			System.out.println(ary2[i]);
		}
	}
}
