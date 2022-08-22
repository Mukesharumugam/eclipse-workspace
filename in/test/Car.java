package in.test;

public abstract class Car {
	String cname;
	int yom;
	public  abstract void show(String cname,int yom);
	public void out(String cmpname) {
		System.out.println("Company Name :" +cmpname);
	}
}
