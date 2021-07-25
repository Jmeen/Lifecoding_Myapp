package dailycoding.oop;

import java.io.FileWriter;
import java.io.IOException;

public class OthersOOP {

	public static void main(String[] args) throws IOException {

		// class : System. Math, FileWriter
		// instance : f1, f2
		
		// 1회성 사용은 이렇게 사용
		System.out.println(Math.PI);
		System.out.println(Math.floor(1.8));
		System.out.println(Math.ceil(1.8));

		// 계속 사용할거면 복제해서 사용
		FileWriter f1 = new FileWriter("data.txt");
		f1.write("Hello");
		f1.write(" JAVA");
		f1.close();

		FileWriter f2 = new FileWriter("data2.txt");
		f2.write("Hello");
		f2.write(" JAVA2");
		f2.close();

	}

}
