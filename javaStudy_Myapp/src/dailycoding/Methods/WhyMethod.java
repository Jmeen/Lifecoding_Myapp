package dailycoding.Methods;

import java.io.FileWriter;
import java.io.IOException;

public class WhyMethod {

	public static void main(String[] args) throws IOException {
		// 서로 연관된 코드를 모아서 이름을 붙인 것인 메소드

		// 인자 argument
		System.out.println(twoTime("a", "-"));

		printTwoTimesA("a", "_");

		printTwoTimesA("b", "%");

		printTwoTimesA("c", "!");
//
//		writefileTwoTimes("C", "!");
	}

	public static String twoTime(String text, String delimiter) {
		String out;
		out = delimiter + "\n";
		out += text + "\n";
		out += text;
		return out;
	}

	// 매개 변수, parameter
	public static void printTwoTimesA(String str, String delimiter) {
		System.out.println(delimiter);
		System.out.println(str);
		System.out.println(str);
	}

	public static void writefileTwoTimes(String text, String delimiter) throws IOException {
		FileWriter fw = new FileWriter("output.txt");
		fw.write(delimiter + "\n");
		fw.write(text + "\n");
		fw.write(text + "\n");
		fw.close();
	}
}