package Constroctor;

public class DefaultConstructor {
int sno;
	public DefaultConstructor(int sno) {
		this.sno = sno;
		System.out.println("this is default constructor");
	}
	public static void main(String[] args) {
		DefaultConstructor j = new DefaultConstructor(10);
		System.out.println(j.sno);
	}

}
