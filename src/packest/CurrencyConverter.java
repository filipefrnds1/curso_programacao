package packest;

public class CurrencyConverter {
	
	
	public static double IOF = 0.06;
	
	public static double dollarToReal(double dollar, double qntdollar) {
		return dollar * qntdollar * (1.0 + IOF);
	}
	
	
	
	/*public double dollar;
	public double qntdollar;
	
	public double finalIOF() {
		return dollar * qntdollar + (dollar * qntdollar * 0.06);
	}*/
	

}
