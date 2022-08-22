package in.test;

public class Profile extends Students {

	public void display(String name, long rollno, int year) {
		this.name = name;
		this.rollno = rollno;
		this.year = year;
		System.out.println("name :" +name + " |" + "rollno :" +rollno + " |" + "year :"+ year);
	}
}
