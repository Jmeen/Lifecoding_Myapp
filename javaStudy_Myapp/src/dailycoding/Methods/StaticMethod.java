package dailycoding.Methods;

class Print {
	String delimiter;

	public void a() {
		System.out.println(this.delimiter);
		System.out.println("a");
		System.out.println("a");
	}

	public void b() {
		System.out.println(this.delimiter);
		System.out.println("b");
		System.out.println("b");
	}

	public static void C(String delimiter) {
		System.out.println(delimiter);
		System.out.println("C");
		System.out.println("C");
	}
}

public class StaticMethod {

	public static void main(String[] args) {
//			Print.a("-");
//			Print.b("-");

		// 인스턴스 instance
		Print p1 = new Print();
		p1.delimiter = "-";
		p1.a();
		p1.b();

		Print.C("$");

//			Print.a("*");
//			Print.b("*");

		Print p2 = new Print();
		p2.delimiter = "*";
		p2.a();
		p2.b();

	}
}
