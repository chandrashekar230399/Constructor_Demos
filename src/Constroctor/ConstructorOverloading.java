package Constroctor;

class ConstructorOverloading {

	ConstructorOverloading(int sno) {

		System.out.println("this is one constructor argument int sno:" + sno);
	}

	ConstructorOverloading(String sname, int sage) {

		System.out.println("this is two constructor arguments String name:" + sname + "int age:" + sage);
	}

	ConstructorOverloading(Long phnNumber) {
		System.out.println("this is also one constuctor argument phonenumber:" + phnNumber);
	}

	public static void main(String[] args) {
		ConstructorOverloading c = new ConstructorOverloading(100);
		ConstructorOverloading c1 = new ConstructorOverloading("chandu", 24);
		ConstructorOverloading c2 = new ConstructorOverloading(9666463311L);
	}

}
