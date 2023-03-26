
public class TestBankAccount {
	public static void main(String[] args) {
		
		//BankAccount account = new BankAccount();
		BankAccount account1 = new BankAccount(101, "John", "Saving", 45000);
		//BankAccount account2 = new BankAccount(102, "Peter", "Current", 34000);
		
		account1.displayAccountDetails();
		
		account1.withdraw(4500);
				
		account1.displayAccountDetails();
		
		BankAccount.displayBankName();
	}
	
}







