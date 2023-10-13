package Constroctor;

class Cal{
	int num1;
	int num2;
	int result;
	
	public  Cal() {
		num1 =5;
		num2 =8;
		result = num1+num2;
	}
	public Cal(int num) {
		
		
	}
}

public class Addition {

	public static void main(String[] args) {
		Cal obj = new Cal(10);
		System.out.println(obj);
	
	}

}
