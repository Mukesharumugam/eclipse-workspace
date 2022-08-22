package in.test;

public class Calculate {
	int number1;
	int number2;
	int result;
	
	public Calculate(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
	}
	
	public void performAdd() {
		result = number1 + number2;
		System.out.println(result);
	}

	public void performSub() {
		result = number1 - number2;
		System.out.println(result);
	}
}
