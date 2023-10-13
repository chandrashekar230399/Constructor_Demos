package Constroctor;

public class Product_Details {
	int product_id;
	String product_Name;
	double Product_Price;
	
	public  Product_Details(int product_id,String product_Name, double Product_Price ) {
		this.product_id=product_id;
		this.product_Name=product_Name;
		this.Product_Price=Product_Price;
		
	}
	
	
	public static void main(String[] args) {
		Product_Details pp = new Product_Details(100,"chandu",35990);
		System.out.println("enter pid:"+pp.product_id);
		System.out.println("enter productname:"+pp.product_Name);
		System.out.println("enter price:"+pp.Product_Price);
		
	}
}
