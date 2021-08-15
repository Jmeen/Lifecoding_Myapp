package JavaStudy.Q200;

import java.util.Scanner;

public class Ch05_datatype {
	public static void main(String[] args) {
		q5_10();
	}
	
	private static void q5_10() {
		//"ABC/n"을 표시하는 프로그램을 작성하자.
		System.out.println("\"ABC\\n\"");
	}

	private static void q5_09() {
		// 0.0부터 1.0까지 0.001씩 증가시키며 제곱 표시(반복을 float으로 제어)
		System.out.println("x\t\tx의 제곱");
		float x = 0.0f;
		for (int i = 0; i <= 1000; i++, x += 0.001f) {
			System.out.printf("%9.7f\t\t%9.7f%n", x, x * x);
		}
	}

	private static void q5_08() {
		// 0.0부터 1.0까지 0.001씩 증가시키며 표시하고, 그 옆에 iNT형 변수를 0부터 1000까지 1씩 증가시켜가며 1000으로 나눈
		// 값을 ㅍ시하자.
		System.out.println("float\t\t int");
		float x = 0.0f;
		for (int i = 0; i <= 1000; i++, x += 0.001f) {
			System.out.printf("%9.7f\t%9.7f  %n", x, (float) i / 1000);
		}
	}

	private static void q5_07() {
		// int형변환에 실숫값을 대입해서 표시하는 프로그램을 작성하자.

		int a;

		a = (int) 10.0;
		System.out.println(a);

//		a= 10.0; // 에러발생

	}

	private static void q5_06() {
		// 3개의 정수의 합계와 평균을 구하는 프로그램을 작성하자.
		// 평균은 캐스트 연산자를 이여해서 구하고, 실수로 표시할 것.

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int sum = a + b + c;
		double avg = (double) sum / 3;

		System.out.println("합계는" + sum);
		System.out.println("평균은" + avg);

	}

	private static void q5_05() {
		// 3개의 정수값을 읽어서 합계와 평균을 구하는 프로그램을 자것ㅇ하자. 평균을 실수로 표시할 것.
		Scanner sc = new Scanner(System.in);
		double avg = 0.0;
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			int t = sc.nextInt();
			sum += t;
		}
		avg = sum / 3;

		System.out.printf("합계는 %d입니다.%n", sum);
		System.out.printf("평균은 %.1f입니다.%n", avg);

	}

	private static void q5_04() {
		// 논리형 변수에 ture나 false를 대입해서 표시하는 프로그램을 만들어보자.

		boolean b1 = true;
		boolean b2 = false;

		System.out.println("b1 : " + b1);
		System.out.println("b2 : " + b2);
	}

	private static void q5_03() {
		// float형 변수와 double형 변수에 값을 읽어서 표시해보자.

		Scanner sc = new Scanner(System.in);
//		float x = 0.123456789;
		double y = 0.123456789;

	}

	private static void q5_02() {
		// 10진 정수를 8진수와 16진수로 표시하는 프로그램을 작성하자.
		int num = 10;
		System.out.printf(num + "을 8진수로 변경하면 %o입니다.%n", num);
		System.out.printf(num + "을 16진수로 변경하면 %x입니다.%n", num);
	}

	private static void q5_01() {
		// 8진수 12, 10진수 12, 16진수 12를 각각 10진수로 표현해보자.

		System.out.println("8진수 12는 012로 표현하고 10진수로 표현하면 " + 012 + "입니다.");
		System.out.println("10진수 12는 12로 표현하고 10진수로 표현하면 " + 12 + "입니다.");
		System.out.println("16진수 12는 0x12로 표현하고 10진수로 표현하면 " + 0x12 + "입니다.");

	}
}
