package JavaStudy.Q200;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ch07_Method {

	public static void main(String[] args) {

		q0725();
	}

	private static void q0725() {
//		배열 a에서 요소 a[idx]부터 n개의 요소를 삭제한 배열을 반환하는arrayRmvofN메서드를 작성하자.
//		int[] arrayRmvofN)int[]a, int idx, int n)
//		삭제는 a[idx] 보다 뒤에있는요소를 n개 앞으로 이동해서 할 것.
//		예) 배열 a의 요소가 {1,3,4,7,9,11}일 때에 arrayRmvOfN(a,1,3)을 호출할 경우, 반환할 배열의 요소는 {1,9,11}이다.

		int[] a = { 1, 3, 4, 7, 9, 11 };
		System.out.println(Arrays.toString(arrayRmvOfN(a, 1, 3)));
	}

	private static int[] arrayRmvOfN(int[] a, int idx, int n) {
		int[] result = new int[a.length - n];
		for (int i = 0; i < idx; i++) {
			result[i] = a[i];
		}
		for (int i = idx; i < a.length - n; i++) {
			result[i] = a[i + n];
		}

		return result;
	}

	private static void q0724() {
//		배열 a에서 요소a[idx]를 삭제한 배열을 반환하는 arrayRmvOf를 작성하자.
//		int[] arrayRmvif(intp[ a, in idx)
//		삭제는 a[idx]보다 뒤에 있는 모든 요소를 하나씩 앞으로 이동시킬 것.
//		예) 배열a의 요소가 {1,3,4,7,9,11}일 때에, arrayRMvof(a,2)를 호출한 경우,
//		반환할 배열의 요소는 {1,3,7,9,11}이다.
		int[] a = { 1, 3, 4, 7, 9, 11 };
		System.out.println(Arrays.toString(arrayRMvof(a, 2)));

	}

	private static int[] arrayRMvof(int[] a, int idx) {

		int[] result = new int[a.length - 1];
		boolean check = true;

		// 내 방법. idx까지 간것을 체크하고, 갈라져라.
//		for(int i = 0; i<a.length; i++) {
//			if(check) {
//				if(i==idx) {
//					check=false;
//				} else {
//					result[i]=a[i];
//				}
//				
//			} else {
//				result[i-1]=a[i];
//			}
//		}
//		
		// 교재 방법. idx를 기점으로 for문을 두개로 나눴다.
		for (int i = 0; i < idx; i++) {
			result[i] = a[i];
		}
		for (int i = idx; i < a.length - 1; i++) {
			result[i] = a[i + 1];
		}

		return result;
	}

	private static void q0723() {
//		배열 a의 요소 중에서 값이 x인 모든 요소의 인덱스를 앞에서부터 순서대로 저장해서 반환하는 arraySrchIdx를 작성하자.
//		int[] arraySrcIdx)int[]a)
//		예)배열 a의 요소가{1,5,4,8,5,5,7}이고, arrySchIdx(a,5)를 호출할 경우, 반환할 배열은{1,4,5}가 된다. 
		int[] a = { 1, 5, 4, 8, 5, 5, 7 };
		System.out.println(Arrays.toString(arrySchIdx(a, 5)));
	}

	private static int[] arrySchIdx(int[] a, int b) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == b) {
				count++;
			}
		}
		int[] result = new int[count];
		count -= 1;
		for (int i = a.length - 1; i > count; i--) {
			if (a[i] == b) {
				result[count] = i;
				count -= 1;
			}
		}
		return result;
	}

	private static void q0722() {
//		배열 a와 같은 배열(요소 수가 같고, 모든 요소의 값이 같은 배열)을 생성해서 반환하는 arrayClone메서드를 작성하자.
		int[] a = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println(Arrays.toString(arrayClone(a)));
	}

	private static int[] arrayClone(int[] a) {
		int[] result = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			result[i] = a[i];
		}
		return result;
	}

	public static void q0721() {
//		배열a와 배열 b의 전체 요소값을 교환하는 aryExchng메서드를 작성하자.
//		void aryExchng(int[] a, intp[] b)
//		두 배열의 요소 수가 같지 않다면, 작은쪽의 배열 수에 맞추어 교환할 것.
//		예) 배열 a의 요소가 {1,2,3,4,5,6,7}이고, 배열 b의 요소가 {5,4,3,2,1}일 때에, aryexchng@a,b)를 호출하면 배열a는{5,4,3,2,1,6,7}이 되고, 배열b는 {1,2,3,4,5} 가 되야 한다.
		int[] a = { 1, 2, 3, 4, 5, 6, 7 };
		int[] b = { 5, 4, 3, 2, 1 };
		aryExchng(a, b);

	}

	private static void aryExchng(int[] a, int[] b) {
		int n = a.length < b.length ? a.length : b.length;
		for (int i = 0; i < n; i++) {
			int temp = a[i];
			a[i] = b[i];
			b[i] = temp;
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}

	private static void q0720() {
		// // 배열 a의 요소 a[idx] 에 x를 삽입하는 aryins메서드를 작성하자.
		// void aryIns{int[] a , int idx, int x )
		// 삽입시에는 a[dix]~a[a.length-2) 를 하나씩 뒤로 이동히셔컁하낟.
		// 예) 배열 a의 요소가{1,3,4,7,9,11}일때 aryIns[a,2,99)라고 호출하면 {1,3,99,4,7,9}가 된다.\
		int[] a = { 1, 3, 4, 7, 9, 11 };
		int idx = 3;
		int x = 99;
		aryIns(a, idx, x);
	}

	private static void aryIns(int[] a, int idx, int x) {
		for (int i = a.length - 1; i > idx; i--) {
			a[i] = a[i - 1];
		}
		a[idx] = x;
		System.out.println(Arrays.toString(a));
	}

	private static void q0719() {
		// 배열 a에서 요소 a[idx]로부터 n개의 요소를 삭제하는 aryRmvN을 작성하자.
		// void aryrmvN(int[] a, int idx, int n)
		// 삭제는 a[idx]보다 뒤에있는 모든 요소를 하나씩 앞으로 이동해서 할 것. 이동대사이 아닌 ㅛㅇ소는 기존 값을 그대로 유지할 것.
		int[] a = { 1, 3, 4, 7, 9, 11 };
		int idx = 1;
		int n = 3;
		aryrmvN(a, idx, n);
	}

	private static void aryrmvN(int[] a, int idx, int n) {
		int idx2 = idx + n - 1;
		if (idx2 > a.length - n - 1) {
			idx2 = a.length - n - 1;
		}
		for (int i = idx; i <= idx2; i++) {
			a[i] = a[i + n];
		}
		System.out.println(Arrays.toString(a));
	}

	private static void q0718() {
		// 배열 a로부터 요소 a[idx]를 삭제하는 aryrmv메서드를 작성하자.
		// void aryrmv(int[] a, int idx)
		// a[idx]의 삭제는 그 뒤에 있는 요소를 앞으로 하나씩 이동해서 할것, 이동한 후에 비게되는 마지막 요소 ㅁ[a.lenth-1)의;ㄱ밧은
		// 이동하기 전 마지막 값을 유지할 것.
		// 예 배열 a의 요소가 {1,3,4,7,9,11}일 때에 aryrmw{a,2)라고 호출 한 후에는 {1,3,7,9,11,11} 이 된다.
		int[] a = { 1, 3, 4, 7, 9, 11 };
		aryrmv(a, 2);

	}

	private static void aryrmv(int[] a, int idx) {
		for (int i = idx; i < a.length - 1; i++) {
//			if (i == a.length - 1) {
			a[i] = a[i + 1];
//			
//			} else {
//				int temp = a[i];
//				a[i] = a[i + 1];
//				a[i + 1] = temp;
//			}
		}
		System.out.println(Arrays.toString(a));
	}

	private static void q0717() {
		// 배열 a로부터 key와 같은 값을 가지는 요소를 탐색하는 linearSearch메서드와, LinearSearchR 메서들르 작성할 것.
		// 단 키와 같은 값을 가지는 요소가 여러개일 경우, LinearSearch는 앞에서, LinearSerachR은 가장 뒤에 위치한 요소를
		// 찾을 것.
		// int linearSearch(int[] a , int key)

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 2, 10 };
		int key = 2;

		System.out.println(linearSearch(a, key));
		System.out.println(linearSearchR(a, key));
	}

	private static int linearSearch(int[] a, int key) {
		int n = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == key) {
				n = i;
				break;
			}
		}
		return n;
	}

	private static int linearSearchR(int[] a, int key) {
		int n = 0;
		for (int i = a.length - 1; i > 0; i--) {
			if (a[i] == key) {
				n = i;
				break;
			}
		}
		return n;
	}

	private static void q0715() {

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(sumof(a));
		System.out.println(minof(a));
	}

	private static int minof(int[] a) {
		// q0717
		// 배열 a가 가진 요소 중 최소값을 구하는 minof를 작성하자.
		int min = a[0];
		for (int i : a) {
			if (i < min) {
				min = i;
			}
		}

		return min;
	}

	private static int sumof(int[] a) {
		// q0715;
		// 배열 a가 가진 모든 요소의 합을 구하는 sumof 메서드를 작성하자.
		int result = 0;
		for (int i : a) {
			result += i;
		}

		return result;
	}

	private static void q0714() {
		// 정ㅅ x의 pos번째 있는 비트부터 n개 연속되는 비트를 1로 변경하는 값은 반환하는 setN메서드, 0으로 변환하는 resetN메서드,
		// 반전시킨 값을 반환하는 inserseN을 작성하자.
		int x = 12332;
		int pos = 5;
		int n = 14;
		printbit(x);
		printbit(setN(x, pos, n));
		printbit(resetN(x, pos, n));
	}

	private static int setN(int x, int pos, int n) {
		return x | ~(~0 << n) << pos;
	}

	private static int resetN(int x, int pos, int n) {
		return x & ~(~(~0 << n) << pos);
	}

	private static void q0713() {
		// 정수 x의 pos번째 있는 비트(최하위 비트부터 0,1,2)를 1로 변경한 값을 반환하는 set메서드, 0으로 변경하는 reset메서드.
		// 그리고 해당위치의 비트를 반전시켜서 반환하는 inverse를 작성하자.
		int x = 11111;
		int pos = 3;
		printbit(x);
		printbit(q0713_set(x, pos));
		printbit(q0713_reset(x, pos));
		printbit(q0713_inverse(x, pos));
	}

	private static int q0713_inverse(int x, int pos) {
		return x ^ (1 << pos);
	}

	private static int q0713_reset(int x, int pos) {
		return x & ~(1 << pos);
	}

	private static int q0713_set(int x, int pos) {
		return x | (1 << pos);
	}

	private static void printbit(int n) {
		// 정수 비트 출력. 옆으로 i값만큼 이동한것이 1이면 1, 아니면 0 프린트.
		for (int i = 31; i >= 0; i--) {
			System.out.print(((n >>> i & 1) == 1) ? 1 : 0);
		}
		System.out.println();

	}

	private static void rRotate() {
		// q07_12
		// 정수 x를 오른쪽으로 n 비트 회전한 값을 반환하는 rRotate메서드를 작성하라.
		int x = 1565857138;
		printbit(x);
		int n = 6;
		n = n % 32;
		printbit(((x >>> n | x << (32 - n))));

	}

	private static void q0711() {
		// 정수를 좌우로 시프트한 값이 "정수 X 2의 거듭제곱"과 같은지 확인하는 프로그램을 작성하자.
		Scanner sc = new Scanner(System.in);
		System.out.print("x : ");
		int x = sc.nextInt();
		System.out.print("n : ");
		int n = sc.nextInt();

		int mpow = x * pow2(n);
		int spow = x / pow2(n);

		int lshift = x << n;
		int rshift = x >> n;

		if (mpow == lshift) {
			System.out.println("거듭제곱과 왼쪽 쉬프트의 값이 같습니다.");
		}
	}

	private static int pow2(int n) {
		int pw = 1;
		while (n-- > 0) {
			pw *= 2;
		}
		return pw;
	}

	private static void cacul() {
		// q07-10
		// 다음 4개의 계산 문제중 하나를 무작위로 출제하는 암산 훈련 프로그램을 작성하자.
		// 이때 x,y,z에 3자리의 정수값을 난수로 생성할 것.

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		int repeat = 1;
		do {
			int a = 1 + rd.nextInt(4);
			int x = 100 + rd.nextInt(900);
			int y = 100 + rd.nextInt(900);
			int z = 100 + rd.nextInt(900);
			String strx = null;
			int answer = 0;

			switch (a) {
			case 1:
				strx = String.format("%d + %d + %d =", x, y, z);
				answer = x + y + z;
				break;
			case 2:
				strx = String.format("%d + %d - %d =", x, y, z);
				answer = x + y - z;
				break;
			case 3:
				strx = String.format("%d - %d + %d =", x, y, z);
				answer = x - y + z;
				break;
			case 4:
				strx = String.format("%d - %d - %d =", x, y, z);
				answer = x - y - z;
				break;
			default:
				break;
			}

			System.out.println(answer);

			int inputanswer = 0;
			do {
				System.out.print("문제!! " + strx + " ");
				inputanswer = sc.nextInt();
				if (inputanswer == answer) {
					System.out.println("정답!");
				} else {
					System.out.println("땡!");
				}
			} while (inputanswer != answer);

			System.out.print("계속할까? 1-yes 0-no");
			repeat = sc.nextInt();
		} while (repeat == 1);
	}

	private static int inputInt() {
		// q07-09
		Scanner sc = new Scanner(System.in);

		int n = 0;
		do {
			System.out.print("양의 정수값 : ");
			n = sc.nextInt();
		} while (n == 0 || n <= 0);

		sc.close();
		return n;
	}

	private static int readplusint(int n) {
		// q07-09
		// "양이 정수값:" 이라는 메세지에 정수값을 입력하면 값을 거꾸로 반환하는 readplusint 를 메서드를 작성하자.
		// 0 이나 음수가 입력되면 재입력 하도록 할 것.
		int result = 0;
		while (n % 10 != 0) {
			int t = n % 10;
			result = (result * 10) + t;
			n /= 10;
		}
		return result;
	}

	private static int random(int a, int b) {
		// q07-08
		// 난수(a=<난수=<b)를 생성하여 반환하는 random 메서드를 작성하라.
		// 메서드 안에서 난수를 생성하는 표준 라이브러리를 호출할 것.
		// 단, b<=a인 경우 a값을 그대로 반환할 것.
		Random rd = new Random();
		int result = 0;
		do {
			result = a + rd.nextInt(b - a + 1);
		} while (a > result && b < result);
		return result;

	}

	private static void putstart() {
		// q07-07
		// 문자 c를 n개 표시하는 puchar메서드와 이 메서드를 내부에서 호출해서 문자 '*'를 n개 연속으로 표시하는 putstart메서드를
		// 작성하자.
		// 이 메서드를 이용해서 직삼각형을 만드는 프로그램을 작성하자.
		Scanner sc = new Scanner(System.in);
		System.out.println("몇단짜리 삼각형을 만들까요");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			putStar(i);
			System.out.println();
		}

	}

	private static void putchar(char c, int n) {
		for (int i = 1; i <= n; i++) {
			System.out.print(c);
		}
	}

	private static void putStar(int n) {
		putchar('*', n);

	}

	private static void printSeason(int n) {
		// Q07_06
		// 인수 n에 지정단 달의 계절을 표시하는 printseason 메서드를 작성하자.
		// n의 값에 따라 봄(3,4,5) 여름(6,7,8) 가을 (9,10,11) 겨울 (12,1,2) 표시하고, 그 이외의 값이오면 아무것도
		// 표시하지 않는다.

		switch (n) {
		case 3:
		case 4:
		case 5:
			System.out.println("봄이에요!");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름이에요!");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을이에요!");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("겨울이에요!");
			break;
		default:
			break;

		}
	}

	private static void Hello() {
		// Q0705
		// 안녕하세요 라고 표시하는 메서드를 만들자.
		System.out.println("안녕하세요!");
	}

	private static int sumUp(int n) {
		// Q07_04
		// 1부터 n까지의 정수의 합을 구해서 반환하는 메서드를 구하자.
		int sum = (n * (1 + n)) / 2;
		return sum;
	}

	private static int med(int a, int b, int c) {
		// Q07_03
		// 3개의 int 형 인수 a,b,c중 중간값을 구하는 med메서드를 작성하라.

		int med = 0;

		if (a >= b) {
			if (c >= a) {
				return a;
			} else if (c >= b) {
				return c;
			} else {
				return b;
			}
		} else if (c >= b) {
			return b;
		} else if (a > c) {
			return c;
		} else {
			return a;
		}

//		if (a >= b)
//
//		{
//			if (b >= c) {
//				return b;
//			} else if (a <= c) {
//				return a;
//			} else {
//				return b;
//			}
//		} else if (c < a) {
//			return a;
//		} else if (b > c) {
//			return c;
//		} else {
//			return b;
//		}
	}

	private static int min(int a, int b, int c) {
		// Q07-02
		// 3개의 int형 인수 a,b,c중 최소값을 구하는 min 매서드를 작성하라.
		int[] abc = { a, b, c };
		int min = a;
		for (int i = 1; i < 3; i++) {
			if (abc[i] < min) {
				min = abc[i];
			}
		}
		return min;

	}

	private static int signOf(int i) {
		// Q07-01
		// 입력한 int형 정수값이 음수이면 -1을 0이면 0을 양수이면 1을 반환하는 signOf메서드를 작성하자.
		if (i < 0) {
			return -1;
		} else if (i > 0) {
			return 1;
		} else {
			return 0;
		}
	}

}
