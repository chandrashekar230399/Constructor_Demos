package Constroctor;

class Prod {
	int pid;
	String pname;
	float price;

	public Prod() {

		System.out.println("Enter p details:");
	}
}

class Custom extends Prod {
	public Custom(int pid, String pname, float price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;

	}
}

public class Product1 {

	public static void main(String[] args) {
		Custom p = new Custom(1, "lux", 40f);
		System.out.println("Enter p id:" + p.pid);
		System.out.println("Enter p name:" + p.pname);
		System.out.println("Enter p price:" + p.price + "rs");

	}

}
