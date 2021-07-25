package dailycoding.oop;

public class AccoutingApp {
	public static void main(String[] args) {
//		Accounting.valueOfsupply = 10000.0;
//		System.out.println("Value of Supply : " + Accounting.valueOfsupply);
//		System.out.println("VAT : " + Accounting.getVAT());

//		Accounting.valueOfsupply = 20000.0;	
//		System.out.println("Value of Supply : " + Accounting.valueOfsupply);

//		Accounting.valueOfsupply = 10000.0;
//		System.out.println("VAT : " + Accounting.getVAT());		
//		Accounting.valueOfsupply = 20000.0;		
//		System.out.println("VAT : " + Accounting.getVAT());

//		Accounting.valueOfsupply = 10000.0;
//		System.out.println("Total : " + Accounting.getTotal());
//		Accounting.valueOfsupply = 20000.0;	
//		System.out.println("Total : " + Accounting.getTotal());

		Accounting a1 = new Accounting(10000.0);
		Accounting a2 = new Accounting(20000.0);
		System.out.println("Value of Supply : " + a1.valueOfsupply);
		System.out.println("Value of Supply : " + a2.valueOfsupply);
		
		System.out.println("VAT : " + a1.getVAT());
		System.out.println("VAT : " + a2.getVAT());

		System.out.println("Total : " + a1.getTotal());
		System.out.println("Total : " + a2.getTotal());

	}
}
