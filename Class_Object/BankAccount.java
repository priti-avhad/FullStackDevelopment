/*Q3. Create a class BankAccount with the following attributes:
• String accountNumber , double balance ;
Methods:
1. deposit(double amount): Adds the specified amount to the balance. If the amount
is less than or equal to zero, display an error message.
2. withdraw(double amount): Deducts the specified amount from the balance. If the
amount is greater than the balance, display an error message indicating insufficient
funds. If amount is less than or equal to zero, display an error message for invalid
withdrawal amount.
Create a subclass SavingsAccount that inherits from BankAccount and adds an
attribute:
• double interestRate - to store the interest rate in percentage.
applyInterest(): Calculates the interest based on the interestRate and adds it to the
balance.
- Instantiate a SavingsAccount object with an account number, initial balance, and
interest rate.
- Perform the following operations in sequence:
• Deposit an amount into the account.
• Attempt a withdrawal with sufficient funds.
• Attempt a withdrawal with an amount greater than the balance (to test the error
message).
• Apply interest to the account.
• Display the final balance and all the transaction details.*/

