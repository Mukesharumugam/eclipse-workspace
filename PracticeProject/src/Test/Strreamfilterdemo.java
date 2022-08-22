package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Strreamfilterdemo {

	public static void main(String[] args) {
//		List<Employee> list = new ArrayList<Employee>();
//		for (Employee emp : getproduct()) {
//			if (emp.getSalary() > 1600) {
//				list.add(emp);
//			}
//			for (Employee emp1 : list) {
//			}
//			System.out.println(list);
//		}
		// using stream ApI filter interface
		List<Employee> list = getproduct().stream().filter((emp) -> emp.getSalary() > 1600)
				.collect(Collectors.toList());
		list.forEach(System.out::println);
	}

	public static List<Employee> getproduct() {
		List<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee("mukesh", 12, 3600));
		emp.add(new Employee("karthic", 9, 1600));
		emp.add(new Employee("aswini", 45, 8600));
		emp.add(new Employee("ganesh", 10, 39000));
		emp.add(new Employee("Alan", 14, 8600));
		return emp;
	}

}

class Employee {
	private String name;
	private int id;
	private int salary;

	public Employee(String name, int id, int salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}

}