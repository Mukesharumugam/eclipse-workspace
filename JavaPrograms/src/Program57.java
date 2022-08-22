//create a int array and print in reverse order

//import java.util.Scanner;

public class Program57 {

	public static void main(String[] args) {
		//Scanner scan = new Scanner(System.in);
		//int size = scan.nextInt();
		generatearyelement();
		}
	
	public static void generatearyelement() {
		int ary [] = {1,2,3,4,5};
		//int [] ary = new int[5];
		/*
		 * ary[0] = 1; ary[1] = 2; ary[2] = 3; ary[3] = 4; ary[4] = 5;
		 */
		for (int i = ary.length - 1; i >= 0; i--) {
			//Scanner scan = new Scanner(System.in);
			//ary[i] = scan.nextInt();
			System.out.println(ary[i]);
		}
		//for (int i = ary.length - 1; i >= 0; i--) {
			//System.out.print(ary[i]);
		}
	}

