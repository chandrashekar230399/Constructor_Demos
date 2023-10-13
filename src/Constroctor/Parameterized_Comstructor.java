package Constroctor;

public class Parameterized_Comstructor {
	int sno;
	String sname;
	
	

	public Parameterized_Comstructor(int sno,String sname) {
		super();
		this.sno = sno;
		this.sname = sname;
	}

	public static void main(String[] args) {
		Parameterized_Comstructor p = new Parameterized_Comstructor(100, "chandu");
		System.out.println(p.sno);
		System.out.println(p.sname);

	}

}
