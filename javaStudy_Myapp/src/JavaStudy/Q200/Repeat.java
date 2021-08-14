package JavaStudy.Q200;

import java.util.Random;
import java.util.Scanner;

public class Repeat {

	public static void main(String[] args) {
		q4_30();
	}

	private static void q4_30() {
		// 문제 4-3의 숫자맞추기 게임에서 숫자의 범위를 0~99로 변경하고, 플레이어가 입력할 수 있는 횟수를 제한 하도록 수정하자.
		// 제한 횟수내에 맞추지 못한 경우네는 정답을 표시하고 게임을 종료할 것.

		// 2자리의 정수값(10~99)를 맞추는 '숫자맞추기 게임'을 해보자.
		// 난수 생성과 if문 그리고 do를 이용할 것.
		System.out.println("숫자 맞추기 게임 시작!");
		System.out.println("0부터 99까지의 숫자를 맞추세요!");
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int rdnum = rand.nextInt(99);
		System.out.println(rdnum);
		int num = 0;
		int count = 6;
		int leftcount = count;

		do {
			System.out.print("남은 횟수 " + leftcount + "회, 정답은 ?? >>");
			num = sc.nextInt();

			if (num > rdnum) {
				System.out.println(" >>> 다운");
				leftcount--;
			} else if (num < rdnum) {
				System.out.println(" >>> 업");
				leftcount--;
			}

		} while (num != rdnum && leftcount > 0);

		if (rdnum == num) {
			System.out.println("정답!! " + (count - leftcount + 1) + "회만에 맞추셨습니다.");
		} else {
			System.out.println("정답은 " + rdnum + "이었습니다.");
		}
	}

	private static void q4_29() {
		// 5개의 정수로 구성된 그룹의 전체 합계(그룹별이 아닌 전체 그룹의 합)을 구하는 프로그램을 작성하자.
		// 전체 10개의 그룹이 있으면 각 정수값은 키보드를 통해 입려한다.
		// 단 99999를 입력하면 전체 입력을 종료하고, 88888을 입력하면 현재 읽고있는 그룹의 입력을 종료할 것.

		Scanner sc = new Scanner(System.in);
		int totalsum = 0;

		outer: for (int i = 1; i <= 10; i++) {
			int groupsum = 0;
			int t = 0;
			System.out.println(i + "번 그룹");

			for (int j = 0; j < 5; j++) {
				t = sc.nextInt();
				if (t == 99999) {
					break outer;
				} else if (t == 88888) {
					break;
				} else {
					groupsum += t;
					totalsum += t;
				}
			}
			System.out.println(i + "번 그룹 합계 : " + groupsum);
		}
		System.out.println("전체 그룹의 합계 : " + totalsum);
	}

	private static void q4_28() {
		// 정수값을 연달아 읽어서 음수가 아닌 값의 합계와 평균을 구하자.
		// 음수의 개수는 평균을 구할때 분모에서 제외할 것.
		Scanner sc = new Scanner(System.in);
		System.out.print("몇개의 숫자를 더할까? >> ");
		int num = sc.nextInt();
		int count = 0, sum = 0;

		for (int i = 0; i < num; i++) {
			System.out.print(">> ");
			int t = sc.nextInt();
			if (t < 0) {
				continue;
			} else {
				sum += t;
				count++;
			}
		}

		System.out.println("합계는 " + sum + "입니다.");
		System.out.println("평균은 " + sum / count + "입니다.");

	}

	private static void q4_27() {
		// 정수값을 읽어서 합계와 평균을 구하는 프로그램을 작성하자.
		// 단, 정수값의 입력은 합계가 1000을 넘지 않는 범위에서 이뤄잊ㄹ것.
		Scanner sc = new Scanner(System.in);
		System.out.print("몇개의 숫자를 더할까? >> ");
		int num = sc.nextInt();

		int sum = 0;

		for (int i = 0; i < num; i++) {
			int t = 0;
			do {
				System.out.print("정수값 >> ");
				t = sc.nextInt();
			} while (t < 0);

			if (sum + t > 1000) {
				System.out.println("합계가 1000이 넘었습니다. 마지막 값은 무시합니다.");
				break;
			} else {
				sum += t;
			}
		}
		System.out.println("합계는 " + sum + "입니다.");
		System.out.println("평균은 " + sum / num + "입니다.");
	}

	private static void q4_26() {
		// 정수값을 연속해서 입력을 받아 합계와 평균을 구한느 프로그램을 작성하자.(0입력시 종료)
		Scanner sc = new Scanner(System.in);
		System.out.print("몇개의 숫자를 더할까? >> ");
		int num = sc.nextInt();
		int count = 0;
		int sum = 0;
		int a = 0;
		for (int i = 0; i < num; i++) {
			do {
				System.out.print("정수값 >> (0입력시 종료)");
				a = sc.nextInt();
			} while (a < 0);

			if (a == 0)
				break;
			else {
				sum += a;
				count++;
			}

		}

		System.out.println("합계는 " + sum + "입니다.");
		System.out.println("평균은 " + sum / count + "입니다.");
	}

	private static void q4_25() {
		// 양의 정수값을 읽어서 소수인지를 판정하는 프로그램을 작성하자.
		// 소수란 2이상n미만인 수중 어떤 수로도 나누어지지 않는 정수값n이다. (즉 자기자신과 1로만 나뉘어진다)
		Scanner sc = new Scanner(System.in);
		System.out.print("정수는? >> ");

		int num = sc.nextInt();

		boolean unique = true;
		if (num > 1) {
			for (int i = 2; i < num; i++) {

				if (num % i == 0) {
					unique = false;
					break;
				}
			}
			System.out.println(unique ? "소수임" : "소수아님");
		}
	}

	private static void q4_24() {
		// n단의 숫자 피라미드를 표시하는 프로그램을 작성하라.
		// i번째 행에는i%10을 표시할것.

		int num = 15;
		for (int i = 1; i <= num; i++) {
			for (int j = 0; j < num - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k < 2 * i; k++) {
				System.out.print(i % 10);
			}
			System.out.println();
		}
	}

	private static void q4_23() {
		// n단 피라미드를 표시하는 프로그램을 작성하자.
		// i행 째에[는 (i-1)*2 +1 개의 '*' 기호를 표시하고 마지막 행인 n 행째에는 (n-1)*2+1개의 '*'을 표시할 것.

		Scanner sc = new Scanner(System.in);
		System.out.print("몇단? >> ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k < (2 * i); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void q4_22() {
		// 기호문자 '*'을 나열해서 직각의 이등변 삼각형을 표시하는 프로그램을 작성하자.
		// 직각의 위치가 왼쪽 아래, 왼쪽위, 오른쪽 아래, 오른쪽 위레 표시하는 프로그램을 각각 작성하자.
		Scanner sc = new Scanner(System.in);
		System.out.print("단수는?");
		int num = sc.nextInt();
		// 1. 왼쪽 아래
		System.out.println("1. 왼쪽 아래");
		System.out.println();
		for (int j = 0; j < num; j++) {
			for (int i = 0; i <= j; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("===========");

		// 2. 왼쪽 위
		System.out.println("2. 왼쪽 위");
		System.out.println();
		for (int i = 0; i <= num; i++) {
			for (int j = 0; j < num - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("===========");

		// 3. 오른쪽 아래
		System.out.println("3. 오른쪽 아래");
		System.out.println();
		for (int i = 0; i < num; i++) {
			for (int j = 1; j < (num - i); j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}

			System.out.println();
		}

		// 4. 오른쪽 위
		System.out.println("4. 오른쪽 위");
		System.out.println();
		for (int i = 0; i < num; i++) {

			for (int k = 0; k < i; k++) {
				System.out.print(" ");
			}

			for (int j = 0; j < num - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void q4_21() {
		// 기호문자 '*'을 나열해서 n단의 정사각형을 표시하는 프로그램을 작성하자.
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num > 0) {
			for (int j = 0; j < num; j++) {
				for (int i = 0; i < num; i++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}

	private static void q4_20() {
		// 월을 정수값으로 읽어서 해당하는 달의 계절을 표시하는 프로그램을 작성하자.
		// 원하는 만큼 입력 및 출력할 수 있게 하여 1-12이외의 값이 입력된 경우에는 재입력 하도록 할것.

		Scanner sc = new Scanner(System.in);
		int num = 0;
		int check = 1;

		do {
			do {
				System.out.print("월을 입력해 주세요");
				num = sc.nextInt();
			} while (num < 1 || num > 12);

			switch (num) {
			case 3:
			case 4:
			case 5:
				System.out.println("봄입니다.");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("여름입니다.");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("가을입니다.");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println("겨율입니다.");
				break;

			default:
				System.out.println("값을 다시 입력해주세요.");
				break;
			}
			do {
				System.out.println("다시할까요? 1- 네, 0-아니요");
				check = sc.nextInt();
			} while (check > 1 || check < 0);

		} while (check == 1);

	}

	private static void q4_19() {
		// 1부터 n까지의 정수값에 각 값을 제곱해서 표시한느 프로그램을 작성하라
		// n을 입력받을 것.
		// 예 > 3 --> 1의 제곱은 1입니다, 2의 제곱은 4입니다. 3의 제곱은 9입니다.

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if (num > 0) {
			for (int i = 1; i <= num; i++) {
				int result = i * i;
				System.out.println(i + "의 제곱은 " + result + "입니다.");
			}

			System.out.println();
			// for 선언부에 변수를 추가로 넣을 수 있다. 조건 부에 , 으로 구분해야한다.
			for (int i = 1, j = 1; i <= num; i++, j = i * i) {
				System.out.println(i + "의 제곱은 " + j + "입니다.");
			}

		}

	}

	private static void q4_18() {
		// 입력한 정숫값의 모든 약수와 그 갯수를 표시하는 프로그램을 작성하자.
		// 예> 정수 : 12 >> 1,2,3,4,5,12/ 12의 약수는 6개입니다.

		Scanner sc = new Scanner(System.in);
		int num = 12;
		int count = 0;

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println();
		System.out.println(num + "의 약수는 " + count + "개 입니다.");

	}

	private static void q4_17() {
		// 읽은 갯수만큼 '*'을 표시하는 4-11을 변경해서, 5개 단위로 줄바꿈해서 표시하는 프로그램을 작성하자.
		Scanner sc = new Scanner(System.in);
		int num = 14;
		int for1 = num / 5;
		int for2 = (num % 5 != 0 ? 1 : 0);

		// 교재 방법 2
		for (int i = 0; i < num / 5; i++) {
			System.out.println("*****");
		}

		if (num % 5 != 0) {
			for (int j = 0; j < num % 5; j++) {
				System.out.print("*");
			}
		}

//		// 교재 방법 1
//		for (int i = 0; i < num; i++) {
//			System.out.print("*");
//			if (i % 5 == 4) {
//				System.out.println();
//			}
//		}
//
//		if (num % 5 != 0) {
//			System.out.println();
//		}

		// 내가 푼 방법
//		for (int i = 0; i < for1; i++) {
//			for (int j = 0; j < 5; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//
//		if (for2 != 0) {
//			for (int j = 0; j < num % 5; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
	}

	private static void q4_16() {
		// 신장별 표준 체중 대응표를 표시하는 프로그램을 작성해보자.
//		표시할 신장의 범위(시작값, 종료값,증가값)은 정수로 입력받을것
		// 표준체중 = (신장 -100) * 0.9
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int min = 0;
		int increse = 5;
		double weight = 0;

		do {
			System.out.print("최대키을 입력해 주세요 >> ");
			max = sc.nextInt();
		} while (max <= 130);

		do {
			System.out.print("최소키을 입력해 주세요 >> ");
			min = sc.nextInt();
		} while (min <= 130);

		if (min > max) {
			int temp = max;
			max = min;
			min = temp;
		}

		for (int i = min; i <= max; i = i + increse) {
			weight = ((i - 100) * 0.9);
			System.out.println(i + "cm의 평균 체중은 " + weight + "kg 입니다.");
		}

	}

	private static void q4_15() {
		// 14 프로그램을 수정해서 결과뿐만 아니라 계산식도 보여주는 프로그램을 만들어보자.
		// 예) 1 + 2+ 3 = 6

		Scanner sc = new Scanner(System.in);
		int num = 0;
		do {
			System.out.print("정수를 입력하세요 >> ");
			num = sc.nextInt();
		} while (!(num > 0));
		int sum = 0;

		for (int i = 1; i < num; i++) {
			System.out.print(i + " + ");
			sum += i;
		}
		System.out.print(num + " = ");
		sum += num;

		System.out.println(sum);

//		for (int i = 1; i <= num; i++) {
//			sum += i;
//		}
//
//		for (int j = 1; j <= num; j++) {
//			System.out.print(j);
//			if (j != num) {
//				System.out.print(" + ");
//			}
//		}
//		System.out.print(" = ");
//		System.out.println(sum);

	}

	private static void q4_14() {
		// 1부터 n까지의 합을 구하는 프로그램을 for문을 사용해 작성하자.
		Scanner sc = new Scanner(System.in);
		int num = 0;
		do {
			System.out.print("정수를 입력하세요 >> ");
			num = sc.nextInt();
		} while (!(num > 0));

		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println(sum);

	}

	private static void q4_13() {
		// q4-12 와 반대로 카운트 업
		Scanner sc = new Scanner(System.in);
		int num = 0;
		do {
			System.out.print("정수를 입력하세요 >> ");
			num = sc.nextInt();
		} while (!(num > 0));

		for (int i = 0; i <= num; i++) {
			System.out.println(i);
		}
	}

	private static void q4_12() {
		// 양의 정수값을 0까지 카운트다운하는 문제 4-5를 for문으로 작성하시오.
		Scanner sc = new Scanner(System.in);
		int num = 0;
		do {
			System.out.print("정수를 입력하세요 >> ");
			num = sc.nextInt();
		} while (!(num > 0));

		for (int i = 0; i <= num; i++) {
			System.out.println(num - i);
		}

		sc.close();
	}

	private static void q4_11() {
		// 기호 문자를 임의의 개수만큼 출력했던 문제 4-7을 for문으로 작성하라.
		// 입력한 값의 갯수만큼 '*'을 표시하는 포로그램을 만들어 보자.
		// 마지막에는 줄바꿈 문자를 출력할 것.
//		단 읽은값이 1미만이면, 줄바꿈 문자를 표시해서는 안된다.
		Scanner sc = new Scanner(System.in);
		int num = 0;
		do {
			System.out.print("정수를 입력하세요 >> ");
			num = sc.nextInt();
		} while (!(num > 0));

		for (int i = 0; i < num; i++) {
			System.out.print('*');
		}
		System.out.println();
	}

	private static void q4_10() {
		// 양의 정수값 n을 읽어서 1부터 n까지의 곱을 구하는 프로그램을 작성해보자.
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int x = 1;
		int result = 1;

		do {
			System.out.print("정수를 입력하세요 >> ");
			num = sc.nextInt();
		} while (!(num > 0));

		while (x <= num) {
			result *= x;
			x++;
		}

		System.out.println(result);

	}

	private static void q4_9() {
		// 양의 정수값을 읽어 자릿수를 표시한다.

		Scanner sc = new Scanner(System.in);
		int num = 0;
		int count = 0;
		do {
			System.out.print("정수를 입력하세요 >> ");
			num = sc.nextInt();
		} while (!(num > 0));

		while (num > 0) {
			num = num / 10;
			count++;
		}

//		boolean bl = true;
//		while (bl) {
//			if (num % 10 == 0) {
//				bl = false;
//			} else {
//				num = num / 10;
//				count++;
//			}
//		}
//		
		System.out.println(count);
	}

	private static void q4_8() {
		// 읽은 값의 개수만큼 '*'와 '+'을 번갈아가며 표시하는 프로그램을 작성하자.
		// 마지막에는 줄바꿈 문자를 출력할 것.
		int num = 11;

//		while (num > 0) {
//			if (num % 2 == 0) {
//				System.out.print("*");
//			} else {
//				System.out.print("+");
//			}
//			num--;
//		}
//
//		System.out.println();

		int i = 0;
		while (i < num / 2) {
			System.out.print("*+");
			i++;
		}
		if (num % 2 != 0) {
			System.out.print("*");
		}
		System.out.println();
	}

	private static void q4_7() {
		// 입력한 값의 갯수만큼 '*'을 표시하는 포로그램을 만들어 보자.
		// 마지막에는 줄바꿈 문자를 출력할 것.
//		단 읽은값이 1미만이면, 줄바꿈 문자를 표시해서는 안된다.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 >> ");
		int num = sc.nextInt();
		if (num > 0) {
			while (num > 0) {
				System.out.print("*");
				num--;
			}
		}
		System.out.println();
	}

	private static void q4_6() {
		// 문제 4-5dptj x--를 --x로 고치면, 어떻게 출력이 바뀌는지 검증해보자.
		// 프로그램을 작성하여 실행 결과를 확인할 것.

		Scanner sc = new Scanner(System.in);
		int num = 5;

		do {
			System.out.print("정수를 입력하세요.(1~99) >>> ");
			num = sc.nextInt();
		} while (num < 0 || num > 99);

		while (num >= 0) {
			System.out.println(--num);
		}
		System.out.println("현재 num의 값 : " + num);

		sc.close();
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
