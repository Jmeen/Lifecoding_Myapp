package javaStudy_Myapp;

public class AccoutingApp {

	public static void main(String[] args) {
		// 생활코딩 14.2 나의 앱 만들기 1 
		// 기본기능 구현
		System.out.println("Value of supply : "+345600.0);
		System.out.println("VAT : "+(345600.0)*0.1);
		System.out.println("Total : "+(345600.0+(345600.0*0.1)));
		System.out.println("Expense : "+(345600.0*0.3));
		System.out.println("income : "+(345600.0-(345600.0*0.3)));
		System.out.println("Dividend1 : "+(345600.0-(345600.0*0.3))*0.5);		
		System.out.println("Dividend2 : "+(345600.0-(345600.0*0.3))*0.3);	
		System.out.println("Dividend3 : "+(345600.0-(345600.0*0.3))*0.2);		
	}

}
