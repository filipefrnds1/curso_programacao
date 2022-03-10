import java.util.Locale;
import java.util.Scanner;

import packest.CurrencyConverter;

public class ExerFix73 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//CurrencyConverter con = new CurrencyConverter();
		
		System.out.print("What is the dollar price? ");
		double dollar = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double qntdollar = sc.nextDouble();
		
		//double result = CurrencyConverter.dollarToReal(dollar,qntdollar);
		System.out.println("Amount to be paid in reais = " + CurrencyConverter.dollarToReal(dollar, qntdollar));
		
		
		
		
		sc.close();
	}

}
