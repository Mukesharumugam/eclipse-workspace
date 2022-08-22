package Test;
import java.util.Scanner;
public class printpatterns {
public static void main(String[] args) {
	generate();
}
public static void generate() {
	Scanner sc=new Scanner(System.in);
	int row = sc.nextInt();
	for(int i = 1;i <= row;i++)
	{
		for(int j = 1;j <= i;j++) {
			System.out.println("*");
	}
	System.out.println();
}
}
}