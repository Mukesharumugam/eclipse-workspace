package in.test;

public class Emp {
	String name;
	int id;
	static int salary;

	public void show() {
		System.out.println(name + " :" + id + " :" + salary);
	}

	public static void main(String[] args) {
		Emp obj1 = new Emp();
		Emp obj2 = new Emp();
		obj1.id = 101982;
		obj1.name = "Mukesh";
		Emp.salary = 5768;
		obj2.id = 182623;
		obj2.name = "Alan";
		obj1.show();
		obj2.show();
	}
}
