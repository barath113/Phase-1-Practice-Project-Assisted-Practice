package nonstaticcontent;

public class BankAccount {
	static String bankName="SBI";
	static int bankInterest=7;
	int bankBalance;
	int accountNumber;
	
	void printAccount() {
		System.out.println("Welcome to "+ bankName);
		System.out.println("The Bank Interest is "+ bankInterest);
		System.out.println("Account number: "+ this.accountNumber);
		System.out.println("Bank Balance: "+ this.bankBalance);
		System.out.println("---------------------");
	}

}
