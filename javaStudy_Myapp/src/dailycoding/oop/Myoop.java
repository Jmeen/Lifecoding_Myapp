package dailycoding.oop;

public class Myoop {
	public static void main(String[] args) {
		Print p1 = new Print("-----");
		p1.A();
		p1.A();
		p1.B();
		p1.B();

		Print p2 = new Print("****");
		p2.A();
		p2.A();
		p2.B();
		p2.B();

		p1.A();
		p2.A();

//		Print.delimiter = "----";
//		Print.A();
//		Print.A();
//		Print.B();
//		Print.B();
//
//		Print.delimiter = "****";
//		Print.A();
//		Print.A();
//		Print.B();
//		
//		Print.delimiter = "----";
//		Print.A();
//		Print.delimiter = "****";
//		Print.A();
	}
}
