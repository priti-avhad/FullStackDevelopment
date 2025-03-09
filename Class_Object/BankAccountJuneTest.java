import java.util.*;
class BankAccount
{
	String accountNumber;
	double balance;

	public BankAccount(String  accountNumber, double balance)
	{
		this.accountNumber=accountNumber;
		this.balance=balance;
	}

	public void deposit(double amount)
	{
		if(amount>0)
		{
			balance=balance+amount;
			System.out.println("deposited:"+amount+"new balance"+balance);;	
		}
		else
		{
			System.out.println("error message");
		}
	}
		
	public void withdraw(double amount)
	{
		if(amount>balance)
		{
			System.out.println("insufficient funds");
		}
		else if(amount<=0)
		{
			System.out.println("invalid withdrawl amount");
		}
		else
		{
			balance=balance-amount;
			System.out.println("withdrawl :"+amount+"new balance"+balance);

		}
	}
}

class SavingAccount extends BankAccount
{
	double interestRate;
	public SavingAccount(String accountNumber, double initialBalance, double interestRate)
	{
		super(accountNumber, initialBalance);
		this. interestRate= interestRate;
	}

	public void applyInterest()
	{
		double interest=balance*(interestRate/100);
		balance=balance+interest;
		        System.out.println("Interest applied at rate " + interestRate + "%: " + interest + ". New Balance: " + balance);

	}
}

public class BankAccountJuneTest
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the account number");
		String accountNumber=sc.nextLine();
		System.out.println("Enter initial balance");
		double initialBalance=sc.nextDouble();
		System.out.println("Enter interest rate");
		double interestRate=sc.nextDouble();

		SavingAccount account=new SavingAccount(accountNumber, initialBalance, interestRate);
		
		int choice;
		do
			{	
				System.out.println("\n menu");
				System.out.println("1. deposit");
				System.out.println("2. withdrawl");
				System.out.println("3. apply interest");
				System.out.println("4. show balance");
				System.out.println("5. exit");

				choice=sc.nextInt();
				switch(choice)
				{
					case 1:
					
							 System.out.print("Enter amount to deposit: ");
                   					 double depositAmount = sc.nextDouble();
                    					 account.deposit(depositAmount);
									break;

						case 2:
						
										System.out.print("Enter amount to withdraw: ");
                    					double withdrawAmount = sc.nextDouble();
											account.withdraw(withdrawAmount);
										break;

							case 3:
								account.applyInterest();
                    						break;

							case 4:
								System.out.println("Current Balance: " + account.balance);
                   						 break;
								
							case 5:
								System.out.println("Exiting. Thank you!");
                    						break;

							default:
								System.out.println("Invalid choice. Please try again.");
				}
				}while(choice!=5);
			}	
}

