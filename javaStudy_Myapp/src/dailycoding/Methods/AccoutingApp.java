package dailycoding.Methods;

public class AccoutingApp {
	// 전역변수
	// 공급가액
	public static double valueOfsupply = 10000.0;
	// 부가 가치세율
	public static double vatRate = 0.1;

	public static void main(String[] args) {
		// 부가세
		// double vat = valueOfsupply * vatRate;
//		double vat = getVAT();

		// 합계
//		double total = getTotal();

		System.out.println("Value of Supply : " + valueOfsupply);
		System.out.println("VAT : " + getVAT());
		System.out.println("Total : " + getTotal());
	}

	private static double getVAT() {
		return valueOfsupply * vatRate;
	}

	private static double getTotal() {
		return valueOfsupply + getVAT();
	}
}
