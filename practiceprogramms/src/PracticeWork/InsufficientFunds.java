package PracticeWork;

public class InsufficientFunds extends Exception {
	
	double amount;
	
	public InsufficientFunds(double amount) {
		this.amount = amount;
	}
	
	public double getAmount()
	{
		return this.amount;
	}

}
