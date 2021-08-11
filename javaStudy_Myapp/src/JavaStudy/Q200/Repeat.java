package JavaStudy.Q200;

import java.util.Random;
import java.util.Scanner;

public class Repeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		q4_5();
	}

	private static void q4_5() {
		// 입력받은 정수값부터 0까지 카운트다운하는 프로그램을 작성하라.
		// 카운트다운 종료후의 변수값을 확인할 수 있게 할 것.
		Scanner sc = new Scanner(System.in);
		int num = 5;

		do {
			System.out.print("정수를 입력하세요.(1~99) >>> ");
			num = sc.nextInt();
		} while (num < 0 || num > 99);

		while (num >= 0) {
			System.out.println(num--);
		}
		System.out.println("현재 num의 값 : " + num);

		sc.close();

	}

	private static void q4_4() {
		// 2개의 정수값을 읽어서 두 정수 상에 있는 모든 정수값을
		// 작은것부터 큰 순으로 표시하는 프로그램을 작성하자.

		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수를 입력하세요 >> ");
		int a = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요 >> ");
		int b = sc.nextInt();

		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		System.out.print(a + " ");
		do {
			a++;
			System.out.print(a + " ");
		} while (a < b);

//		for (int i = a; i <= b; i++) {
//			System.out.print(i + " ");
//
//		}

		sc.close();

	}

	private static void q4_3() {
		// 2자리의 정수값(10~99)를 맞추는 '숫자맞추기 게임'을 해보자.
		// 난수 생성과 if문 그리고 do를 이용할 것.
		System.out.println("숫자 맞추기 게임 시작!");
		System.out.println("10부터 99까지의 숫자를 맞추세요!");
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int rdnum = 10 + rand.nextInt(90);
//		System.out.println(rdnum);
		int num = 0;

		do {
			do {
				System.out.println("-------------");
				System.out.print("정답은 ?? >>");
				num = sc.nextInt();
			} while (num < 10 || num > 99);
			if (num > rdnum) {
				System.out.println(" >>> 다운");
			} else if (num < rdnum) {
				System.out.println(" >>> 업");
			}
		} while (num != rdnum);
		System.out.println(" >>> 정답!");
	}

	private static void q4_2() {
		// 3자리의 양의 정수값(100~999)를 읽는 프로그램을 작성하라.
		// 입력받은 값이 3자리의 양의 정수값이 아니면 다시 입력받아라.
		// 드모르간의 법칙
		Scanner sc = new Scanner(System.in);
		int num = 0;
		do {
			System.out.print("3자리의 양의 정수를 입력하세요 >>> ");
			num = sc.nextInt();

		} while ((num < 100) || (num > 999));

		System.out.println("입력하신 값 : " + num);

		sc.close();

	}

	private static void q4_1() {
		// 아래 프로그램을 원하는대로 반복해보자.
		// 읽은 정수값의 부호(양수/음수/0을 판정해서 표시
		Scanner sc = new Scanner(System.in);
		boolean ck = true;
		int i = 0;
		do {
			System.out.print("정수값 >> ");
			int n = sc.nextInt();
			if (n > 0) {
				System.out.println("n은 양수입니다.");
			} else if (0 > n) {
				System.out.println("n은 음수입니다.");
			} else {
				System.out.println("n은 0입니다.");
			}
			do { // do 반복문을 두번 반복하여 정확한 값을 입력할때까지 반복할수 있음.
				System.out.print("한번더? 1-Y / 0-N");
				i = sc.nextInt();
			} while (i != 1 && i != 0);
			ck = i == 1 ? true : false;
		} while (ck);
	}
}