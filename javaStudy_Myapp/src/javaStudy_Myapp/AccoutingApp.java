package javaStudy_Myapp;

class Accounting {
	public double valueOfSupply;
	public double vatRate;
	public double expanseRate;

	public void print() {
		System.out.println("VAT : " + getVAT());
		System.out.println("Value of supply : " + valueOfSupply);
		System.out.println("Total : " + getTotal());
		System.out.println("Expense : " + getExpense());
		System.out.println("income : " + getIncome());

		double[] dividendRates = new double[3];
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;

		int i = 0;
		while (i < dividendRates.length) {
			System.out.println("Dividend1 : " + getIncome() * dividendRates[i]);
			i = i + 1;
		}

	}
	public double getIncome() {
		return valueOfSupply - getExpense();
	}
	public double getExpense() {
		return valueOfSupply * expanseRate;
	}
	public double getTotal() {
		return valueOfSupply + getVAT();
	}
	public double getVAT() {
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
		// 인스턴스는 하나의 클래스를 복제해서 서로다른 데이터의 값과 서로같은 메소드를 메소드를 가진 복제본을 만드는 것이다.
		Accounting a1 = new Accounting();

		a1.valueOfSupply = 10000;
		a1.vatRate = 0.1;
		a1.expanseRate = 0.3;
		double VAT = a1.getVAT();
		double Total = a1.getTotal();
		double Expense = a1.getExpense();
		double income = a1.getIncome();

		a1.print();

		// 클래스를 자주 끌어다 쓰는건 버그를 유발할 확률이 높음.

		// ,,,

		// accounting 1 과 account 2는 서로 저장된 값이 달라 영향을 받지 않는다.
		Accounting a2 = new Accounting();
		a2.valueOfSupply = 20000;
		a2.vatRate = 0.1;
		a2.expanseRate = 0.3;
		a2.print();

		// anotherVarialbe..

		// 이 아래 3줄은 같은 일을 하고있다. 반복문으로 바꿔보자.

//		double[] dividendRates = extracted();

//		double dividend1 = income * dividendRates[0];
//		double dividend2 = income * dividendRates[1];
//		double dividend3 = income * dividendRates[2];

	}

}
