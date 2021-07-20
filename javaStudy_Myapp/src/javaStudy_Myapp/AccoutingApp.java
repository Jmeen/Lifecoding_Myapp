package javaStudy_Myapp;

class Acconting {
	public static double valueOfSupply;
	public static double vatRate;
	public static double expanseRate;
	private static void print() {
		System.out.println("VAT : " + getVAT());
		System.out.println("Value of supply : " + valueOfSupply);
		System.out.println("Total : " + getTotal());
		System.out.println("Expense : " + getExpense());
		System.out.println("income : " + getIncome());
	}

	private static double getIncome() {
		return valueOfSupply - getExpense();
	}

	private static double getExpense() {
		return valueOfSupply * expanseRate;
	}

	private static double getTotal() {
		return valueOfSupply + getVAT();
	}

	private static double getVAT() {
		return valueOfSupply * vatRate;
	}
}

public class AccoutingApp {
	// 전역변수

	public static void main(String[] args) {
		// 생활코딩 14.2 나의 앱 만들기 1
		// 변수로 변경
		// 입력값 도입
		// args는 String이기때문에 Double로 변경하는 명령어를 추가
		// 제어문 추가
		// 배열
		// 반복문 추가
		// 메소드 추가 -> 메소드 서로 연관된 코드를 그룹핑하여 이름을 붙인 정리정돈의 상자
		// 객체는 class라는 표현을 쓰고, class는 서로 연관된 변수와 메소드를 그루핑하고 이름을 붙인것이다.

		Acconting.valueOfSupply = 10000;
		Acconting.vatRate = 0.1;
		Acconting.expanseRate = 0.3;
		double VAT = Acconting.getVAT();
		double Total = Acconting.getTotal();
		double Expense = Acconting.getExpense();
		double income = Acconting.getIncome();

		Acconting.print();
		// anotherVarialbe..

		// 이 아래 3줄은 같은 일을 하고있다. 반복문으로 바꿔보자.

		double[] dividendRates = new double[3];
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;

//		double dividend1 = income * dividendRates[0];
//		double dividend2 = income * dividendRates[1];
//		double dividend3 = income * dividendRates[2];

		int i = 0;
		while (i < dividendRates.length) {
			System.out.println("Dividend1 : " + income * dividendRates[i]);
			i = i + 1;
		}
	}

}
