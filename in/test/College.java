package in.test;

public class College {
	String tname;
	int id;

	public College(String tname, int id) {
		this.tname = tname;
		this.id = id;
	}
	
	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void display() {
		System.out.println("Teacher Name:"+ " " +tname);
		System.out.println("Teacher ID:" +" " +id);
	}
}
