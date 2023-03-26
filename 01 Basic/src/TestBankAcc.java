
public class TestBankAcc {
	public static void main(String[] args) {
		
		BankAcc account1 = new BankAcc("John", "Saving", 45000);
		BankAcc account2 = new BankAcc("Peter", "Current", 23000);
		
		account1.displayBankAccDetails();
		account2.displayBankAccDetails();
		
		BankAcc.displayBankName();
	}
}
