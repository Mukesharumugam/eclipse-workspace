package in.test;

public class CarDetails extends Car {

	@Override
	public void show(String cname, int yom) {
		this.cname = cname;
		this.yom = yom;
		System.out.println("cname :" + cname + " |" + "year of manufacture :" + yom);
	}
}
