package Constroctor;

class No_arguments {
int sno;
String sname;

	No_arguments() {
		System.out.println("this is constructor method");
	}

	public static void main(String[] args) {
		No_arguments j = new No_arguments();
		System.out.println(j.sno);
		System.out.println(j.sname);
		
	}

}
