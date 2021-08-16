package JavaStudy.Q200;

import java.util.Random;
import java.util.Scanner;

public class Ch06_array {

	public static void main(String[] args) {
		q06_15();

	}

	private static void q06_15() {
		// 1~12월을 숫자로 표시하고, 해당월의 영어단어를 입력하는 프로그램을 작성하자.
		// 월은 난수로 생성할 것
		// 학습자가 원하는 동안은 계속 반복할 것
		// 동일 월은 연속해서 표시하지 않을것.
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		String[] months = { "JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC" };

		String asw;
		int retry = 1;
		int last = 0;
		int n = 0;
		do {
			do {
				n = 1 + rand.nextInt(12);
			} while (n == last);
			last = n;
			
			String ans = months[last - 1].toLowerCase();
			do {
				System.out.print(last + "월 : ");
				asw = sc.next().toLowerCase();
				if (asw.equals(ans)) {
					System.out.println("정답입니다!");
					break;
				} else {
					System.out.println("틀렸어요");
				}
			} while (asw != ans);

			System.out.print("더 할까요? 1-Yes, 2-No");
			retry = sc.nextInt();
		} while (retry != 2);

	}

	private static void q06_14() {
		// 배열a의 모든 요소를 역순으로 배열 b에 역순으로 복사하는 프로그램을 만들자.
		int n = 6;

		int[] a = { 1, 2, 3, 4, 5, 6 };
		int[] b = new int[n];
		int nb = 0;

		// 내방법
//		for(int i =n-1; i>=0; i--,numb++) {
//			b[nb]=a[i];
//		}
//		
		// 교재 방법
		for (int i = 0; i < n; i++) {
			b[i] = a[n - i - 1];
		}

		for (int x : b) {
			System.out.print(x + " ");
		}
	}

	private static void q06_13() {
		// 배열의 나열순서를 임의대로 섞는 프로그램을 작성하자.

		// 필요 조건 : 배열의 순서는 중복되면 안된다.
		Scanner sc = new Scanner(System.in);
		System.out.print("몇개의 수를 만들까요? >> ");
		int num = sc.nextInt();
		int[] nums = new int[num];
		Random rand = new Random();

		for (int i = 0; i < nums.length; i++) {
			nums[i] = 1 + rand.nextInt(10);
			for (int j = 0; j < i; j++) {
				if (i > 1 && nums[j] == nums[i]) {
					i--;
					System.out.println("중복발생!");
					continue;
				}
			}
		}
		System.out.println("배열을 만들었습니다.");
		for (int x : nums) {
			System.out.println(x);
		}

		// 이제 섞어보자
//		for(int i = 0; i<num*2; i++) {
//			int idx1 = rand.nextInt(num);
//			int idx2 = rand.nextInt(num);
//			
//			int temp = nums[idx1];
//			nums[idx1] = nums[idx2];
//			nums[idx2] = temp;
//		}
		// Fisher-yates 알고리즘
		for (int i = num - 1; i > 0; i--) {
			int j = rand.nextInt(i + 1);
			if (j != i) {
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
			}
		}

		System.out.println("배열을 섞었습니다.");
		for (int x : nums) {
			System.out.println(x);
		}

		sc.close();
	}

	private static void q06_12() {
		// 서로 다른 요소가 동일한 값을 지니지 않도록 6-10의 프로그램을 수정하자.
		// 예를들면 1,2,3,4,1,2 가 돼서는 안된다.
		Scanner sc = new Scanner(System.in);
		System.out.print("몇개의 수를 만들까요? >> ");
		int num = sc.nextInt();
		int[] nums = new int[num];
		Random rand = new Random();

//		for (int i = 0; i < nums.length; i++) {
//			int j = 0;
//			do {
//				nums[i] = 1 + rand.nextInt(10);
//				for (; j < i; j++) {
//					if (nums[j] == nums[i]) {
//						break;
//					}
//				}
//			} while (j < i);
//
//		}

//		// 내방법
		for (int i = 0; i < nums.length; i++) {
			nums[i] = 1 + rand.nextInt(10);
			for (int j = 0; j < i; j++) {
				if (i > 1 && nums[j] == nums[i]) {
					i--;
					System.out.println("중복발생!");
					continue;
				}
			}
		}

		for (int x : nums) {
			System.out.println(x);
		}

		sc.close();
	}

	public static void q06_11() {
		// 인접하는 요소가 동일한 값을 가지지 않도록 문제 6-10의 프로그램을 수정하자.
		// 예를들어 1,4,5,5,3,2가 돼서는 안된다.

		Scanner sc = new Scanner(System.in);
		System.out.print("몇개의 수를 만들까요? >> ");
		int num = sc.nextInt();
		int[] nums = new int[num];
		Random rand = new Random();

		// 교재의 방법.
		// 첫번째를 미리 대입을 하고 다음수부터 반복.
		// 만약 전것과 같으면 do-while문 재실행.
//		nums[0]= 1 + rand.nextInt(10);
//		for (int i = 1; i < nums.length; i++) {
//			do {
//				nums[i] = 1 + rand.nextInt(10);
//			} while (nums[i] == nums[i - 1]);
//		}

		// 1차 내 방법.
		// i가 2보다 많고, 만약 전것과 같은게 있다면, i를 내려서 다시 하자.
		for (int i = 0; i < nums.length; i++) {
			nums[i] = 1 + rand.nextInt(10);

			if (i > 1 && nums[i - 1] == nums[i]) {
				i--;
				continue;
			}
		}

		for (int x : nums) {
			System.out.println(x);
		}

		sc.close();

	}

	private static void q06_10() {
		// 요소의 형이 int형인 배열을 마늘어서 모든 요소에 1~10의 난수를 대입하자.(1이상 10이하)
		// 요소 수는 키보드를 통해 입력받을 것.

		Scanner sc = new Scanner(System.in);
		System.out.print("몇개의 수를 만들까요? >> ");
		int num = sc.nextInt();
		int[] nums = new int[num];
		Random rand = new Random();

		for (int i = 0; i < nums.length; i++) {
			nums[i] = 1 + rand.nextInt(10);
		}

		for (int x : nums) {
			System.out.println(x);
		}

		sc.close();
	}

	private static void q06_09() {
		// double형인 배열의 모든 요소의 합과 평균을 구하는 프로그램을 작성하라.
		// 요소 수와 모든 값은 키보드를 통해 입력받을 것.
		Scanner sc = new Scanner(System.in);
		System.out.print("몇개의 수 >> ");
		int num = sc.nextInt();
		double[] nums = new double[num];

		for (int i = 0; i < nums.length; i++) {
			System.out.print("nums[" + i + "] : ");
			nums[i] = sc.nextDouble();
		}

		double sum = 0;

		for (double d : nums) {
			sum += d;
		}

		System.out.println("모든 요소의 합계는 " + sum + "입니다.");
		System.out.println("모든 요소의 평균는 " + sum / nums.length + "입니다.");
	}

	private static void q06_08() {
		// 배열에서 특정 값을 가지는 요소를 찾아라.
		// 동일 값의 요소가 여러개 있으면, 가장 앞에 위치한 요소를 찾는 프로그램과 가장 뒤에 있는 요소를 찾는 프로그램을 작성하자.
		Scanner sc = new Scanner(System.in);
		System.out.print("몇개의 정수인가? >> ");
		int n = sc.nextInt(); // 배열의 요소 수
		int[] nums = new int[n]; // 배열 생성

		// 정수입력
		for (int i = 0; i < n; i++) {
			System.out.print(i + 1 + " : ");
			nums[i] = sc.nextInt();
		}

		// 검색 할 정수 입력
		System.out.print("어떤 수를 찾을것인가? >> ");
		int search = sc.nextInt();

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == search) {
				System.out.println("찾았다");
				System.out.println(i + 1 + "번째");
			}
		}

	}

	private static void q06_07() {
		// 시험 점수의 합계, 평균, 최고점, 최저점을 구하는 프로그램을 작성하자.
		// 사람 수와 점수는 키보드를 통해 입력받을것.
		Scanner sc = new Scanner(System.in);
		System.out.print("몇명의 점수인가? >> ");
		int n = sc.nextInt(); // 배열의 요소 수
		int[] nums = new int[n]; // 배열 생성
		int sum = 0, max = 0, min = 0;
		double avg = 0;

		// 점수입력
		for (int i = 0; i < n; i++) {
			System.out.print(i + "번의 점수 : ");
			nums[i] = sc.nextInt();
		}

		// 점수 합계, 최대, 최소
		max = nums[0];
		min = nums[0];

		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			if (nums[i] > max) {
				max = nums[i];
			}
			if (nums[i] < min) {
				min = nums[i];
			}
		}

		avg = sum / nums.length;
		System.out.printf("합계 : %d , 평균 : %.2f, 최대값 : %d, 최소값 : %d%n", sum, avg, max, min);

	}

	private static void q06_06() {
		// 배열의 요소 수와 개별 요소의 값을 입력 받아서 표시하는 프로그램을 작성하자.
		// 표시 형식을 배열 초기값과 같은 형식으로, 각 요소의 값을 쉼표로 연겨하고 {}로 감싼 형태이다.
		Scanner sc = new Scanner(System.in);
		System.out.print("배열에 몇개의 정수를 넣을까요? >> ");
		int n = sc.nextInt(); // 배열의 요소 수
		int[] nums = new int[n]; // 배열 생성

		for (int i = 0; i < nums.length; i++) {
			System.out.print(">> ");
			nums[i] = sc.nextInt();
		}

		System.out.print("nums = {");

		if (n >= 2) {
			for (int i = 0; i < n - 1; i++) {
				System.out.print(nums[i] + ",");
			}
		}
		if (n >= 1) {
			System.out.print(nums[n - 1]);
		}
		System.out.println("}");

	}

	private static void q06_05() {
		// 배열의 요소 수가 5인 int형 배열을 5,4,3,2,1 로 초기화해서 표시하는 프로그램을 작성하자.
		int[] nums = { 5, 4, 3, 2, 1 };
		Scanner sc = new Scanner(System.in);

//		for (int i = 0; i < nums.length; i++) {
//			nums[i] = sc.nextInt();
//
//			for (int j = 0; j < i; j++) {
//				if (nums[i] > nums[j]) {
//					int t = nums[i];
//					nums[i] = nums[j];
//					nums[j] = t;
//				}
//			}
//		}

		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}

	}

	private static void q06_04() {
		// int형 배열의 각 요소에 1~10의 난수를 대입하고, 각 요소의 값을 막대그래프(기호문자 *를 나열) 로 표시하는 프로그램을 작성하자.
		// 마지막에는 인덱스를 10으로 나눈 나머지를 표시할 것.
		Random rand = new Random();

		int num = 12;
		int[] nums = new int[num];

		for (int i = 0; i < num; i++) {
			nums[i] = 1 + rand.nextInt(10);
		}

//		for (int i = 0; i < nums.length; i++) {
//			System.out.println(nums[i]);
//		}

		for (int i = 10; i >= 1; i--) {
			for (int j = 0; j < num; j++) {
				if (nums[j] >= i) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		for (int i = 0; i < num * 2; i++) {
			System.out.print("-");
		}
		System.out.println();
		for (int i = 0; i < num; i++) {
			System.out.print(i % 10 + " ");
		}

	}

	private static void q06_03() {
		// 요소 갯수가 5인 double형 배열을 만들고, 앞에서부터 1.1, 2.2, 3.3, 4.4, 5.5를 대입해서 표시하는 프로그램을
		// 작성하자.
		double[] nums = new double[5];
		for (int i = 0; i < 5; i++) {
			nums[i] = (i + 1) * 1.1;
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}

	private static void q06_02() {
		// 요소 갯수가 5개인 int형 배열에 순서대로 5,4,3,2,1을 대입하는 프로그램을 작성하자.
		int[] nums = new int[5];
		int x = 5;
		for (int i = 0; i < 5; i++) {
			nums[i] = x;
			x--;
		}

		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}

	}

	private static void q06_01() {
		// 자료형은 double이고 요소수가 5인 배열을 생성하고, 이 배열의 모든 요소를 표시하는 프로그램을 작성하자.

		double[] dbs = new double[5];
		for (int i = 0; i < dbs.length; i++) {
			System.out.println(dbs[i]);
		}

	}

}
