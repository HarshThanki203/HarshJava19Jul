package practiceprogramms;
import java.util.Scanner;

public class CheckingBankAccount {
	
	long Acno;
	double balance = 0;
	
	public CheckingBankAccount(long Acno) {
		this.Acno = Acno;
	}
	public void deposit(double amount) {
		this.balance =amount+this.balance;
	}
	public void withdraw(double amount) throws InsufficientFunds
	{
		if(amount <= this.balance)
		{
			this.balance = this.balance - amount;
		}
	else
	{
		double needs = amount - this.balance;
		throw new InsufficientFunds(needs);
	}

}
	public void CheckBalance() {
		System.out.println("Your Current Balance is :"+this.balance);		
	}
	public static void main(String[] args) {
		CheckingBankAccount c=new CheckingBankAccount(35454967);
		System.out.println("*******Welcome To Kotak*******\n");
		c.CheckBalance();
		Scanner sc=new Scanner(System.in);
		double amt;
		System.out.println("\nEnter Amount to Deposit");
		amt=sc.nextDouble();
		c.deposit(amt);
		c.CheckBalance();
		System.out.println("\nEnter Amount to Withdraw");
		amt = sc.nextDouble();
		try {
			c.withdraw(amt);
		}catch (InsufficientFunds e) {
			System.out.println("Sorry You Need Rs ."+e.getAmount()+"more to Withdraw.");
		}
		c.CheckBalance();
		
	}
}
