package javaStudy_Myapp;

public class AccoutingApp {

	public static void main(String[] args) {
		// 생활코딩 14.2 나의 앱 만들기 1
		// 변수로 변경
		// 입력값 도입
		// args는 String이기때문에 Double로 변경하는 명령어를 추가
		// 제어문 추가
		// 배열
		double valueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double VAT = valueOfSupply * vatRate;
		double Total = valueOfSupply + VAT;
		double expanseRate = 0.3;
		double Expense = valueOfSupply * expanseRate;
		double income = valueOfSupply - Expense;
		
		double rate1 = 0.5;
		double rate2 = 0.3;
		double rate3 = 0.2;
		
		//Rate를 배열로 생성
		double[] dividendRates = new double[3];
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;
		
		double dividend1 = income * dividendRates[0];
		double dividend2 = income * dividendRates[1];
		double dividend3 = income * dividendRates[2];
//
//		if (income > 10000.0) {
//			dividend1 = income * 0.5;
//			dividend2 = income * 0.3;
//			dividend3 = income * 0.2;
//		} else {
//			dividend1 = income * 1;
//			dividend2 = income * 0;
//			dividend3 = income * 0;
//		}

		System.out.println("VAT : " + VAT);
		System.out.println("Value of supply : " + valueOfSupply);
		System.out.println("Total : " + Total);
		System.out.println("Expense : " + Expense);
		System.out.println("income : " + income);
		System.out.println("Dividend1 : " + dividend1);
		System.out.println("Dividend2 : " + dividend2);
		System.out.println("Dividend3 : " + dividend3);
			

	}

}
