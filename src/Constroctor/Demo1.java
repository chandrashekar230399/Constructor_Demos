package Constroctor;

public class Demo1 {
	
	int a;
	int b;
	int c;
	
	
	void m1() {
		a=10;
		b=20;
		c=30;
		System.out.println(a+" "+b+" "+c);
	}
	void m1(int d,int e,int f) {
		a=d;
		b=e;
		c=f;
		System.out.println(a+" "+b+" "+c);
	}
	public Demo1(int d,int e,int f) {
		a=d;
		b=e;
		c=f;
		System.out.println(a+" "+b+" "+c);
	}

	public static void main(String[] args) {
		 Demo1 dd = new Demo1(5, 6, 7);
		 dd.m1();
		 dd.m1(2, 3, 4);
		 dd.m1(4, 2, 1);


	}

}
