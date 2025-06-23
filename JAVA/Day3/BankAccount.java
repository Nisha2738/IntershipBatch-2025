package Day2_2.java;

public class BankAccount {
			int accountNumber;
		    String accountHolder;
		    double balance;

		    public BankAccount(int accountNumber, String accountHolder, double balance) {
		        this.accountNumber = accountNumber;
		        this.accountHolder = accountHolder;
		        this.balance = balance;
		    }

		    public void deposit(double amount) {
		        balance += amount;
		        System.out.println("Deposited: " + amount);
		        System.out.println("New Balance: " + balance);
		    }

		    public void withdraw(double amount) {
		        if (amount <= balance) {
		            balance -= amount;
		            System.out.println("Withdrawn: " + amount);
		            System.out.println("New Balance: " + balance);
		        } else {
		            System.out.println("Insufficient balance.");
		        }
		    }

		    public static void main(String[] args) {
		        BankAccount account = new BankAccount(12345, "Nisha", 1000.0);
		        account.deposit(500);
		        account.withdraw(300);
		    }
		}
	
