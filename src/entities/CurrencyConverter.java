package entities;

public class CurrencyConverter {

	public static double convert (double exchange, double quantity) {
		
		double amount = exchange * quantity;
			   amount = amount + (amount * 0.06);
		return amount;
		
	}
	
}
