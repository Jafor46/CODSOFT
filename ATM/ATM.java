import java.util.Scanner;



public class ATM extends BankAccount {
	public ATM(double balance) {
		super(balance);
	}
	Scanner scanner = new Scanner(System.in);
	BankAccount user;
	//private BankAccount account;
	private void checkBalance()
	{
		CheckBalance();
	}
	private void Deposit()
	{
		System.out.println("Enter amount for deposit: ");
		double amount=scanner.nextDouble();
		deposit(amount);
	}
	private void Withdraw()
	{
		System.out.println("Enter amount for withdraw: ");
		System.out.println("1. 500");
		System.out.println("2. 1000");
		System.out.println("3. 2000");
		System.out.println("4. 5000");
		System.out.println("5. 10000");
		System.out.println("6. 15000");
		System.out.println("7. 20000");
		System.out.print("Enter the key: ");
		int press = scanner.nextInt();
		//double amount=scanner.nextDouble();
		if(press == 1)
		{
			withdraw(500);
		}
		else if(press == 2)
		{
			withdraw(1000);
		}
		else if(press == 3)
		{
			withdraw(2000);
		}
		else if(press == 4)
		{
			withdraw(5000);
		}
		else if(press == 5)
		{
			withdraw(10000);
		}
		else if(press == 6)
		{
			withdraw(15000);
		}
		else if(press == 7)
		{
			withdraw(20000);
		}
		else
		{
			System.out.println("Invalid Key.");
		}
	}
	public void ShowMenu()
	{
		while(true)
		{
			System.out.println("\nATM Menu :");
			System.out.println("1. Check Balance");
			System.out.println("2. Deposit Amount");
			System.out.println("3. Withdraw Amount");
			System.out.println("4. Exit");
			System.out.print("Choose an option: ");
			int choice = scanner.nextInt();
			switch(choice)
			{
			case 1:
				checkBalance();
				break;
			case 2:
				Deposit();
				break;
			case 3:
				Withdraw();
				break;
			case 4:
				System.out.println("Thank you. Come again.");
				return;
			default:
				System.out.println("Invalid choice. Try again");
			}
		}
	}
}
