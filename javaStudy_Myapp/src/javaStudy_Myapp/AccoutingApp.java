package javaStudy_Myapp;

public class AccoutingApp {
	// 전역변수
	public static double valueOfSupply;
	public static double vatRate;
	public static double expanseRate;
	public static void main(String[] args ) {
		// 생활코딩 14.2 나의 앱 만들기 1
		// 변수로 변경
		// 입력값 도입
		// args는 String이기때문에 Double로 변경하는 명령어를 추가
		// 제어문 추가
		// 배열
		// 반복문 추가
		// 메소드 추가 -> 메소드서로 연관된 코드를 그룹핑하여 이름을 붙인 정리정돈의 상자
		valueOfSupply = 10000;
		vatRate = 0.1;
		expanseRate = 0.3;
		double VAT = getVAT();
		double Total = getTotal();
		double Expense = getExpense();
		double income = getIncome();
		
//		double rate1 = 0.5;
//		double rate2 = 0.3;
//		double rate3 = 0.2;	
		//Rate를 배열로 생성
//		if (income > 10000.0) {
//			dividend1 = income * 0.5;
//			dividend2 = income * 0.3;
//			dividend3 = income * 0.2;
//		} else {
//			dividend1 = income * 1;
//			dividend2 = income * 0;
//			dividend3 = income * 0;
//		}
		
		print();
		
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
			System.out.println("Dividend1 : " + income*dividendRates[i]);
			i = i + 1;
		}
	}

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
