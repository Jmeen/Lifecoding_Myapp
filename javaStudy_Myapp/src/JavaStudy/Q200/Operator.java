package JavaStudy.Q200;

import java.util.Random;
import java.util.Scanner;

public class Operator {

	public static void main(String[] args) {

		q3_21();
	}

	private static void q3_21() {
		// 월을 1~12의 정수값으로 읽어서 계절을 표시하는 프로그램을 만들어 보자
		Scanner sc = new Scanner(System.in);
		System.out.print("지금은 몇월인가요?  >>  ");
		int month = sc.nextInt();

		switch (month) {
		case 12:
		case 1:
		case 2:
			System.out.println("겨울");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
			break;
		default:
			System.out.println("제대로 입력해주세요");
			break;
		}
	}

	private static void q3_20() {
		// 0,1,2 중 하나의 난수를 생성하여 0이면 가위, 1이면 바위, 2면 보를 표시하는 프로그램을 작성하여라
		Random rand = new Random();

		int a = rand.nextInt(3);
		System.out.println(a);
		switch (a) {
		case 0:
			System.out.println("가위");
			break;
		case 1:
			System.out.println("바위");
			break;
		case 2:
			System.out.println("보");
			break;
		}

	}

	private static void q3_19() {
		// 세 정수값을 읽어서 큰수대로 표현
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a > b) {
			int t = a;
			a = b;
			b = t;
		}

		if (b > c) {
			int t = b;
			b = c;
			c = t;
		}

		if (a > b) {
			int t = a;
			a = b;
			b = t;
		}

		System.out.printf("%d-%d-%d", a, b, c);

	}

	private static void q3_18() {
		// 두 정수값을 읽어서 큰수대로 표현
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a > b) {
			int t = a;
			a = b;
			b = t;
		}

		System.out.println(a);
		System.out.println(b);
		sc.close();
	}

	private static void q3_17() {
		// 두 정수값 중 작은값과 큰 값을 구해서 표시
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a == b) {
			System.out.println("두 값은 같다.");
		} else {
			if (a > b) {
				System.out.println("a>b");
			} else {
				System.out.println("a<b");
			}
		}

//		
//		if(a>b) {
//			System.out.println("a>b");
//		} else if(a<b) {
//			System.out.println("a<b");
//			
//		} else {
//			System.out.println("두값이 같다");
//		}
	}

	private static void q3_16() {
		// 키보드에서 입력한 3개의 정수값중 중앙값을 구해서 표시하는 프로그램을 작성해보자.
		// 예를들어 2,3,1의 중앙값은 2이고, 1,2,1의 중앙값은 1이고, 3,3,3의 중앙값은 3이다.

		int a = 2, b = 3, c = 1;
		int middle = 0;

		if (a >= b) {
			if (b >= c) {
				middle = b;
			} else if (c >= a) {
				middle = a;
			} else {
				middle = c;
			}
		} else if (a > c) {
			middle = a;
		} else if (b > c) {
			middle = c;
		} else {
			middle = b;
		}

		System.out.println("중간값은 " + middle);
	}
}
