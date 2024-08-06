package ulti;

public class CurrencyConverter {

	public static final double IOF = 0.06; 
	
	public static double dollarToReal(double dollarAmount, double dollarRate) {
		double total = dollarAmount * dollarRate; 
		total += total * IOF; 
		return total; 
	}
	
	
}
