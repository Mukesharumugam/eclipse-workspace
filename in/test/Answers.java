package in.test;
import  java.util.Scanner;

public class Answers {
	
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		Substract obj = new Substract();
		int a = scan.nextInt();
		int b = scan.nextInt();
		obj.add(a, b);
		obj.sub(a, b);
	}

}
