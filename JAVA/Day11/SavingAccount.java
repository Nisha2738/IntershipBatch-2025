package Day11.java;

class Account {

	String accountHolder = "Nisha Nikam";
	long accountNumber = 1234567890L;

	void displayAccountInfo() {
	        System.out.println("Account Holder: " + accountHolder);
	        System.out.println("Account Number: " + accountNumber);
	    }
	}

class SavingAccount extends Account {
	    double balance = 15000.50;

	    void displayAccountDetails() {
	        displayAccountInfo(); 
	        System.out.println("Balance: ₹" + balance);
	    }

	    public static void main(String[] args) {
	        SavingAccount sa = new SavingAccount();
	        sa.displayAccountDetails();
	    }
}


