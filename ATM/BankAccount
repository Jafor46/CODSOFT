
public class BankAccount {
	private double balance;
	public BankAccount(double balance)
	{
		this.balance=balance;
	}
	public void deposit(double amount)
	{
		balance+=amount;
		System.out.println("Deposit Successfull");
		System.out.println("Current Balance: "+balance);
	}
	public void CheckBalance()
	{
		System.out.println("Current Balance: "+balance);
	}
	public void withdraw(double amount)
	{
		if(balance>0 && amount<=balance)
		{
			balance-=amount;
			System.out.println("Withdraw Successfull");
			System.out.println("Current Balance: "+balance);
		}
		else
		{
			System.out.println("Insufficient Balance");
		}
	}
}
