package in.test;

import java.util.Date;

public class Employee {
	String empname1;
	String empname2;
	Date date1;
	Date date2;

	public String getEmpname1() {
		return empname1;
	}

	public void setEmpname1(String empname1) {
		this.empname1 = empname1;
	}

	public String getEmpname2() {
		return empname2;
	}

	public void setEmpname2(String empname2) {
		this.empname2 = empname2;
	}

	public Date getDate1() {
		return date1;
	}

	public void setDate1(Date date1 ) {
		this.date1 = date1;
	}

	public Date getDate2() {
		return date2;
	}

	public void setDate2(Date date2) {
		this.date2 = date2;
	}

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Employee obj = new Employee();
		obj.setEmpname1("A.Mukesh");
		obj.setDate1(new Date("05/10/2022"));
		obj.setEmpname2("Rajesh San");
		obj.setDate2(new Date("05/21/2022"));
		System.out.println("Employee name:" + " " + obj.getEmpname1()+"|"+"Joining date:"+" "+obj.getDate1());
		System.out.println("Employee name:" + " " + obj.getEmpname2()+"|"+"Joining date:"+" "+obj.getDate2());
	}
}
