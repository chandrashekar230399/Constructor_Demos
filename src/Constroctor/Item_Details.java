package Constroctor;

public class Item_Details {
	String item_Name;
	String item_Brand;
	float item_quantity;
	int item_No;
	double item_Price;
	char item_Grade;

	public Item_Details(String i_name, String i_brand, float i_quantity, int i_No, double i_Price, char i_Grade) {
		item_Name = i_name;
		item_Brand = i_brand;
		item_quantity = i_quantity;
		item_No = i_No;
		item_Price = i_Price;
		item_Grade = i_Grade;
	}

	public void dispalyItemDetails() {// this is method creating
		System.out.println("The item name is:" + item_Name);
		System.out.println("The flavour is:" + item_Brand);
		System.out.println("The quantity of icecream:" + item_quantity);
		System.out.println("The item no is:" + item_No);
		System.out.println("The item cost is:" + item_Price);
		System.out.println("The item grade is:" + item_Grade);
	}

	public static void main(String[] args) {
		Item_Details ii = new Item_Details("ice cream", "butterscotch", 500f, 01, 50, 'A');
		ii.dispalyItemDetails();// calling method with obj ref
		
		System.out.println("The item name is:" + ii.item_Name);// this is directly calling with obj name
		System.out.println("The flavour is:" + ii.item_Brand);
		System.out.println("The quantity of icecream:" + ii.item_quantity);
		System.out.println("The item no is:" + ii.item_No);
		System.out.println("The item cost is:" + ii.item_Price);
		System.out.println("The item grade is:" + ii.item_Grade);
	}

}
