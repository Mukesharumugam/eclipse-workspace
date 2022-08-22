//print only the odd numbers present between 15 and 49

public class Program2 {
	
	public static void main ( String[] args) {
		printoddbw15and49();
	}
	
	public static void printoddbw15and49() {
		for (int i = 15; i <= 49; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}		
	}

}
