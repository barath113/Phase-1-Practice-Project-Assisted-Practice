package nonstaticcontent;

public class AccountDetails {
	
	public static void main(String[] args) {
		BankAccount account1=new BankAccount();
		account1.accountNumber=1001;
		account1.bankBalance=1500;
		
		BankAccount account2=new BankAccount();
		account2.accountNumber=1002;
		account2.bankBalance=2000;
		
		account1.printAccount();
		account2.printAccount();
	}

}
