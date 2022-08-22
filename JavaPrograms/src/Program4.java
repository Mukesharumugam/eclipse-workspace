//print all the numbers from 1 to 100 except 78,96

public class Program4 {
	
	public static void main (String[] args) {
		generate1to100();
	}
	
	public static void generate1to100() {
		for (int i = 1;i <= 100;i++) {
			if (i != 78 && i != 96) {
				System.out.println(i);
			}
		}
	}
}
	
