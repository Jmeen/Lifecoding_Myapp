package JavaStudy.Q200;

public class Ch07_Method {

	public static void main(String[] args) {
		System.out.println(med(444, 33, 2212));
//		System.out.println(signOf(999));
		System.out.println(sumUp(10));
		Hello();
	}
	private static void Hello() {
		// Q0705
		// 안녕하세요 라고 표시하는 메서드를 만들자.
		System.out.println("안녕하세요!");
	}
	
	
	private static int sumUp(int n) {
		// Q07_04
		// 1부터 n까지의 정수의 합을 구해서 반환하는 메서드를 구하자.
		int sum = (n* (1 + n)) / 2;
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
