package Constroctor;

public class Demo {
 
	int a;
	int b;
	int c;

	public Demo(int a,int b,int c) {
		System.out.println("this is parameterized constructor");
		this.a = a;
		this.b = b;
		this.c = c;
		System.out.println(a+" "+b+" "+c);
		System.out.println(this.a + " " + this.b + " " + this.c);
	}


	public static void main(String[] args) {
		Demo d = new Demo(1, 2, 3);
		Demo d1 = new Demo(2, 4, 6);
		System.out.println(d.a + " " +d. b + " " + d.c);
		System.out.println(d1.a + " " +d1. b + " " + d1.c);
	}

}
