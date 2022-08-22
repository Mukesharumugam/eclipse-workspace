package Test;
import java.util.Scanner;

 class sample {
public static void main (String[] args) {
	generate();
}
public static void generate() {
	Scanner sc = new Scanner(System.in);
	int i=sc.nextInt();
	if(i%7==0) {
		System.out.println("abcdefghijklmnopqrstuvwxyz");
	}
	else {
		System.out.println("zywvutsrqponmlkjighfedcab");
	}
	}
	}
		

