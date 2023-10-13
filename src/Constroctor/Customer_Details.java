package Constroctor;

public class Customer_Details {

	int cid;
	String cname;
	float csal;

	public Customer_Details(int cid, String cname, float csal) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.csal = csal;
	}

	public void PrintDetails() {
		System.out.println("enter customer id no:" + cid);
		System.out.println("enter customer name:" + cname);
		System.out.println("enter customer salary:" + csal);
	}

	public static void main(String[] args) {
		Customer_Details cd = new Customer_Details(101, "chandu", 25000f);
		cd.PrintDetails();

	}

}
