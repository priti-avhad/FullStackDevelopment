import java.util.Scanner;

class BankAccount {
    String accountNumber;
	String accountHolderName;
    double balance;

    public BankAccount(String accountNumber, String accountHolderName double balance,) {
        this.accountNumber = accountNumber;
		this.accountHolderName;
        this.balance = balance;
    }

class SavingAccount extends BankAccount 
{
    double interestRate;

    public SavingAccount(String accountNumber, double initialBalance,String accountHolderName, double interestRate) {
        super(accountNumber, accountHolderName, initialBalance);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interest = balance * (interestRate / 100);
        balance =balance+interest;
        System.out.println("Interest applied at rate " + interestRate + "%: " + interest + ". New Balance: " + balance);
    }
}

public class BankAccountApp {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        String accountNumber = scn.nextLine();
        System.out.print("Enter Initial Balance: ");
        double initialBalance = scn.nextDouble();
        System.out.print("Enter Interest Rate: ");
        double interestRate = scn.nextDouble();

        SavingAccount acc = new SavingAccount(accountNumber, initialBalance, interestRate);
		
 

       
    }
}